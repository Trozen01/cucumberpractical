Feature: Check and execute group test cases of Orange CRM

@SmokeTest  @RegressionTest
Scenario: Login orange CRM
Given User is already on login page

@SmokeTest @RegressionTest
Scenario: Go to Home page
Given log on credintional and log in successfully

@RegressionTest
Scenario: Test Home page
Then check Home page

@SmokeTest
Scenario: Test employee page
Given check employee page

@EndToEnd
Scenario: Test employee details
Given check employee details

@RegressionTest
Scenario: Test usermanagement page
Given check usermanagement Page

@SmokeTest
Scenario: Test usermanagement details
Given check usermanagement/ details

@RegressionTest
Scenario: Test Job page
Given check Job Page

@SmokeTest
Scenario: Test Job details
Given check Job details

@RegressionTest
Scenario: Test Location page
Given check Location Page

@EndToEnd
Scenario: Test Location details
Given check Location details

@EndToEnd
Scenario: Test skills page
Given check skills Page

@SmokeTest
Scenario: Test skills details
Given check skills details

@SmokeTest
Scenario: Test modules page
Given check modules Page

@EndToEnd
Scenario: Test modules details
Given check modules details

@EndToEnd
Scenario: Test candidate page
Given check candidate Page

@RegressionTest
Scenario: Test candidate details
Given check candidate details