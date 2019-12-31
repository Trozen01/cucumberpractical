Feature: orange crm Login Feature

#Without Example keyword 
Scenario: Login orange CRM

Given User is already on login page
When title of the page is orange CRM
Then user enter "Admin" and "admin123" 
Then user click on login button
And user is on home page