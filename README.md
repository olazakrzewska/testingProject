# Triangle Testing Project

A simple project demonstrating different software testing tools.

| Tool | Purpose |
|---|---|
| JUnit | Unit testing |
| JaCoCo | Code coverage |
| Postman | REST API testing |
| Selenium | UI testing |
| JMeter | Performance testing |
| Maven | Build automation |
| Inspect Code | Static analysis |

## Open the Project

1. Open IntelliJ IDEA
2. Select `File -> Open`
3. Choose the `triangle` project folder

## Run the Application

1. Open `TriangleApp.java`
2. Click Run

Application:
   
`http://localhost:8080`

REST API:
   
`http://localhost:8080/api/triangle?a=3&b=4&c=5`

## JUnit

1. Open `TriangleServiceTest.java`
2. Run tests

## JaCoCo

1. Open terminal
2. Run:
   
   `mvnw.cmd test`

3. Open:
   
   `target/site/jacoco/index.html`

## Static Analysis

Use:
   
`Code -> Inspect Code`

## Postman

1. Open Postman
2. Create GET request:
   
   `http://localhost:8080/api/triangle?a=3&b=4&c=5`

3. Click `Send`
4. Run Collection Runner
5. Sample collection in Triangle test.postman_collection.json

## Selenium

1. Run the application
2. Open `SeleniumTest.java`
3. Run tests

## Maven

Run tests:
   
`mvnw.cmd test`

Full build:
   
`mvnw.cmd clean install`

## JMeter

1. Open JMeter
2. Open or create test plan
3. Configure HTTP Request
4. Run performance tests
5. Sample plan in Test Plan-000001.jmx
