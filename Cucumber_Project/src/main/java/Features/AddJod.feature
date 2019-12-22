Feature: orange crm ADD new Job Feature


#With Example keyword 
Scenario Outline:: Login orange CRM

Given User is already on login page
When title of the page is orange CRM
Then user enter "<username>" and "<password>" 
Then user click on login button
And user is on home page
Then go to add job page
Then add new job "<jobtitle>" and "<jobdesc>" and "<jobnote>"
Then close the browser

Examples:
   | username | password | jobtitle | jobdesc | jobnote |
   | Admin    | admin123 | IT Mangr | IT      |  test   |
   | Admin    | admin123 | PT Mangr | PT      |  test   |