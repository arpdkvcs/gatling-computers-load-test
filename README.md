<a name="readme-top"></a>

[![Contributors][contributors-shield]][contributors-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<div>

<h3 align="center">Gatling computer database load test</h3>

  <p align="center">
    A "Hello World!" style load test using gatling load- and performance testing framework.
    <br />
    <a href="https://github.com/arpdkvcs/gatling-computers-load-test/issues">Report Bug</a>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#setup-and-run">Setup & Run</a></li>
      </ul>
    </li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project
A "Hello World!" type project using the Gatling load- and performance testing framework.
The test simulates 2 types of visitors on the site ("users" and "admins") and 3 types of activities (search, browse, edit) on Gatling's own database:

<a href="https://computer-database.gatling.io">Gatling's computer database</a>

Users search and browse, while admins do all 3 activities.
There are 10 users and 2 admins, and they start using the site at different times in a 10 seconds period. By this the scenarios are more real life like.
All these parameters can easily be changed in the `setUp` section of the ***AdvancedSimulation.java*** class.

<p align="right">(<a href="#readme-top">back to top</a>)</p>


### Purpose
To get familiar with the basics of the Gatling framework using as a maven project.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With

* [![Gatling][Gatling]][Gatling-url]
* [![Java][Java]][Java-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started


### Prerequisites
Gatling supports 64bits OpenJDK LTS (Long Term Support) versions: 11, 17 and 21.
You need one of these installed on your computer.

https://jdk.java.net/

### Setup and Run

_Steps:_

1. Clone the repo
   ```sh
   git clone https://github.com/arpdkvcs/gatling-computers-load-test.git
   ```
2. Run the test (inside repo folder)
    ```sh
    mvn gatling:test
    ```
At the end of the test it will generate a report which is accessible by it's link. Clicking on it opens it in the default browser.
<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Project Link: [https://github.com/arpdkvcs/stackoverflow-tw](https://github.com/arpdkvcs/stackoverflow-tw/)

<p align="right">(<a href="#readme-top">back to top</a>)</p>





<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/arpdkvcs/gatling-computers-load-test?style=for-the-badge
[contributors-url]: https://github.com/arpdkvcs/gatling-computers-load-test/graphs/contributors
[linkedin-shield]: https://img.shields.io/badge/LinkedIn-blue?style=for-the-badge
[linkedin-url]: https://www.linkedin.com/in/arpad-kovacs/
[Gatling]: https://img.shields.io/badge/Gatling-777777?style=for-the-badge&logo=gatling
[Gatling-url]: https://gatling.io/
[Java]: https://img.shields.io/badge/Java-777777?style=for-the-badge&logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAxMjggMTI4IiBpZD0iamF2YSI+PHBhdGggZmlsbD0iIzAwNzRCRCIgZD0iTTQ3LjYxNyA5OC4xMnMtNC43NjcgMi43NzQgMy4zOTcgMy43MWM5Ljg5MiAxLjEzIDE0Ljk0Ny45NjggMjUuODQ1LTEuMDkyIDAgMCAyLjg3MSAxLjc5NSA2Ljg3MyAzLjM1MS0yNC40MzkgMTAuNDctNTUuMzA4LS42MDctMzYuMTE1LTUuOTY5ek00NC42MjkgODQuNDU1cy01LjM0OCAzLjk1OSAyLjgyMyA0LjgwNWMxMC41NjcgMS4wOTEgMTguOTEgMS4xOCAzMy4zNTQtMS42IDAgMCAxLjk5MyAyLjAyNSA1LjEzMiAzLjEzMS0yOS41NDIgOC42NC02Mi40NDYuNjgtNDEuMzA5LTYuMzM2eiI+PC9wYXRoPjxwYXRoIGZpbGw9IiNFQTJEMkUiIGQ9Ik02OS44MDIgNjEuMjcxYzYuMDI1IDYuOTM1LTEuNTggMTMuMTctMS41OCAxMy4xN3MxNS4yODktNy44OTEgOC4yNjktMTcuNzc3Yy02LjU1OS05LjIxNS0xMS41ODctMTMuNzkyIDE1LjYzNS0yOS41OCAwIC4wMDEtNDIuNzMxIDEwLjY3LTIyLjMyNCAzNC4xODd6Ij48L3BhdGg+PHBhdGggZmlsbD0iIzAwNzRCRCIgZD0iTTEwMi4xMjMgMTA4LjIyOXMzLjUyOSAyLjkxLTMuODg4IDUuMTU5Yy0xNC4xMDIgNC4yNzItNTguNzA2IDUuNTYtNzEuMDk0LjE3MS00LjQ1MS0xLjkzOCAzLjg5OS00LjYyNSA2LjUyNi01LjE5MiAyLjczOS0uNTkzIDQuMzAzLS40ODUgNC4zMDMtLjQ4NS00Ljk1My0zLjQ4Ny0zMi4wMTMgNi44NS0xMy43NDMgOS44MTUgNDkuODIxIDguMDc2IDkwLjgxNy0zLjYzNyA3Ny44OTYtOS40Njh6TTQ5LjkxMiA3MC4yOTRzLTIyLjY4NiA1LjM4OS04LjAzMyA3LjM0OGM2LjE4OC44MjggMTguNTE4LjYzOCAzMC4wMTEtLjMyNiA5LjM5LS43ODkgMTguODEzLTIuNDc0IDE4LjgxMy0yLjQ3NHMtMy4zMDggMS40MTktNS43MDQgMy4wNTNjLTIzLjA0MiA2LjA2MS02Ny41NDQgMy4yMzgtNTQuNzMxLTIuOTU4IDEwLjgzMi01LjIzOSAxOS42NDQtNC42NDMgMTkuNjQ0LTQuNjQzek05MC42MDkgOTMuMDQxYzIzLjQyMS0xMi4xNjcgMTIuNTkxLTIzLjg2IDUuMDMyLTIyLjI4NS0xLjg0OC4zODUtMi42NzcuNzItMi42NzcuNzJzLjY4OC0xLjA3OSAyLTEuNTQzYzE0Ljk1My01LjI1NSAyNi40NTEgMTUuNTAzLTQuODIzIDIzLjcyNSAwLS4wMDIuMzU5LS4zMjcuNDY4LS42MTd6Ij48L3BhdGg+PHBhdGggZmlsbD0iI0VBMkQyRSIgZD0iTTc2LjQ5MSAxLjU4N3MxMi45NjggMTIuOTc2LTEyLjMwMyAzMi45MjNjLTIwLjI2NiAxNi4wMDYtNC42MjEgMjUuMTMtLjAwNyAzNS41NTktMTEuODMxLTEwLjY3My0yMC41MDktMjAuMDctMTQuNjg4LTI4LjgxNSA4LjU0OC0xMi44MzQgMzIuMjI5LTE5LjA1OSAyNi45OTgtMzkuNjY3eiI+PC9wYXRoPjxwYXRoIGZpbGw9IiMwMDc0QkQiIGQ9Ik01Mi4yMTQgMTI2LjAyMWMyMi40NzYgMS40MzcgNTctLjggNTcuODE3LTExLjQzNiAwIDAtMS41NzEgNC4wMzItMTguNTc3IDcuMjMxLTE5LjE4NiAzLjYxMi00Mi44NTQgMy4xOTEtNTYuODg3Ljg3NCAwIC4wMDEgMi44NzUgMi4zODEgMTcuNjQ3IDMuMzMxeiI+PC9wYXRoPjwvc3ZnPg==
[Java-url]: https://www.java.com/

