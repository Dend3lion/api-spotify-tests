# Test automation project for [Spotify](https://open.spotify.com) API

<p align="center"><a href="https://open.spotify.com/"><img src="media/images/Spotify_Logo.png" align="center" height="150" alt="Steam"/></a></p>  

## :bookmark_tabs: Contents
- [Technologies and tools](#computer-technologies-and-tools)
- [Features](#star2-features)
- [Test cases](#clipboard-test-cases)
- [Running tests locally](#rocket-running-tests-locally)
- [Build in Jenkins](#-build-in-jenkins)
- [Test results in Allure report](#-test-results-in-allure-report)
- [Test management in Allure TestOps](#-allure-testops)
- [Integration with Jira](#-integration-with-jira)
- [Remote launch in Browserstack](#-remote-launch-in-browserstack)
- [Notification of test results in Telegram](#-notification-of-test-results-in-telegram)

## :computer: Technologies and tools
<p align="center">
<a href="https://www.jetbrains.com/idea/"><img width="6%" title="IntelliJ IDEA" src="media/images/Intelij_IDEA.svg"></a>
<a href="https://www.java.com/"><img width="6%" title="Java" src="media/images/Java.svg"></a>
<a href="https://github.com/allure-framework"><img width="6%" title="Allure Report" src="media/images/Allure_Report.svg"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/images/AllureTestOps.svg"></a>
<a href="https://gradle.org/"><img width="6%" title="Gradle" src="media/images/Gradle.svg"></a>
<a href="https://junit.org/junit5/"><img width="6%" title="JUnit5" src="media/images/JUnit5.svg"></a>
<a href="https://rest-assured.io//"><img width="6%" title="Rest Assured" src="media/images/RestAssured.svg"></a>
<a href="https://aerokube.com/selenoid/"><img width="7%" title="Selenoid" src="media/images/Selenoid.svg"></a>
<a href="https://github.com/"><img width="6%" title="GitHub" src="media/images/GitHub.svg"></a>
<a href="https://www.jenkins.io/"><img width="6%" title="Jenkins" src="media/images/Jenkins.svg"></a>
<a href="https://web.telegram.org/"><img width="6%" title="Telegram" src="media/images/Telegram.svg"></a>
<a href="https://www.atlassian.com/software/jira/"><img width="5%" title="Jira" src="media/images/Jira.svg"></a>
</p>

Automated tests are written in the `Java` language using `JUnit 5` and `Rest Assured`. The project is built with `Gradle`.
For remote execution, a task is implemented in `Jenkins` to generate an `Allure report` and send the results to `Telegram` using a bot.
Remote execution is carried out in `Selenoid`.
To manage test scenarios and manually initiate test runs, `Allure TestOps` is utilized, and the results of their completion are linked to `Jira` issues.

## :star2: Features
- `Object Serialization/Deserialization`: Utilizes `Jackson` to seamlessly transform data for handling API requests and responses
- `Request Specification`: Streamlines and centralizes API test configuration through the use of request specifications
- `Test data generation`: Utilizes the `Faker` library for generating random test data
- `JSON fixtures`: Efficient and organized data handling in the application through data mapping
- `Custom Allure Listener`: Provides informative logging of API requests and responses
- `Parallel Execution`: Speeds up tests, providing faster feedback and reduced time
- `Allure TestOps integration`: Unifies test reporting, analytics and launch management
- `Jira Integration`: Streamlines issue tracking, collaboration, and integrates Allure for test case and launch management
- `Autotests as Documentation`: Provides real-time insight into project functionality

## :clipboard: Test cases

- :white_check_mark: Get album by id
- :white_check_mark: Get album by invalid id
- :white_check_mark: Get album by id with parameters
- :white_check_mark: Get artist by id

## :rocket: Running tests locally

```bash
gradle clean test
```

## <img alt="Jenkins" width="5%" src="media/images/Jenkins.svg"/> Build in [Jenkins](https://jenkins.autotests.cloud/job/api-spotify-tests/)
<p align="center">  
<img src="media/images/Jenkins_Screenshot.png" alt="Jenkins" width="950"/></a>  
</p>

## <img alt="Allure Report" width="5%" src="media/images/Allure_Report.svg"/> Test results in [Allure report](https://jenkins.autotests.cloud/job/api-spotify-tests/allure/)
<p align="center">  
<img src="media/images/AllureReport_Main.png" alt="Allure Report main page" width="950"/></a>  
</p>
<p align="center">  
<img src="media/images/AllureReport_Tests.png" alt="Allure Report suites page" width="950"/></a>  
</p>

## <img alt="Allure TestOps" width="4%" src="media/images/AllureTestOps.svg"/> Test management in [Allure TestOps](https://allure.autotests.cloud/project/4012/dashboards)
<p align="center">  
<img src="media/images/AllureTestOps_Main.png" alt="Allure Report main page" width="950"/></a>  
</p>
<p align="center">  
<img src="media/images/AllureTestOps_Tests.png" alt="Allure Report suites page" width="950"/></a>  
</p>

## <img alt="Jira" width="4%" src="media/images/Jira.svg"/> Integration with [Jira](https://jira.autotests.cloud/browse/HOMEWORK-1093)
<p align="center">  
<img src="media/images/Jira_Task.png" alt="Jira task page" width="950"/></a>  
</p>


## <img alt="Telegam" width="5%" src="media/images/Telegram.svg"/> Notification of test results in [Telegram](https://play.google.com/store/apps/details?id=org.telegram.messenger&hl=ru&gl=US)
<p align="center">  
<img src="media/images/Telegram_Bot.png" alt="Telegram bot" width="300"/></a>  
</p>
