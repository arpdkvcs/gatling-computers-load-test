package computerdatabase;

import io.gatling.javaapi.core.ChainBuilder;
import io.gatling.javaapi.core.FeederBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class AdvancedSimulation extends Simulation{

    private HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://computer-database.gatling.io")
            .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
            .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8")
            .acceptEncodingHeader("gzip, deflate, br")
            .acceptLanguageHeader("en-GB,en;q=0.5")
            .doNotTrackHeader("1")
            .upgradeInsecureRequestsHeader("1")
            .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64; rv:123.0) Gecko/20100101 Firefox/123.0");

    private String uri1 = "computer-database.gatling.io";

    private FeederBuilder.Batchable<String> feeder = csv("search.csv").random();

    private ChainBuilder search =
            exec(http("Home").get("/"))
                    .pause(1)
                    .feed(feeder)
                    .exec(http("Search")
                            .get("/computers?f=#{searchCriterion}")
                            .check(
                                    css("a:contains('#{searchComputerName}')", "href")
                                            .saveAs("computerUrl")
                            ))
                    .pause(3)
                    .exec(http("Select")
                            .get("#{computerUrl}"))
                    .pause(4);

    private ChainBuilder browse =
            repeat(5, "n").on(
                    exec(http("Page #{n}").get("/computers?p=#{n}"))
                            .pause(Duration.ofMillis(rand(500, 1000)))
            );

    private ChainBuilder edit =
            exec(http("Form").get("/computers/new"))
                    .pause(4)
                    .exec(http("Post").post("/computers")
                            .formParam("name", "Framework")
                            .formParam("introduced", "2020-09-01")
                            .formParam("discontinued", "")
                            .formParam("company", "10")
                            .check(status().is(session ->
                                200 + rand(2)
                            ))
                    );

    private ChainBuilder tryMaxEdit = tryMax(2).on(
            exec(edit)
    ).exitHereIfFailed();

    private ScenarioBuilder users = scenario("Users")
            .exec(search, browse);

    private ScenarioBuilder admins = scenario("Admins")
            .exec(search, browse, tryMaxEdit);

    {
        setUp(
                users.injectOpen(rampUsers(10).during(10)),
                admins.injectOpen(rampUsers(2).during(10))
        ).protocols(httpProtocol);
    }

    private int rand(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    private int rand(int max) {
        return ThreadLocalRandom.current().nextInt(max);
    }
}
