Feature: orange crm Login Feature

#Without Example keyword 
Scenario: Login orange CRM

Given User is already on login page
When title of the page is orange CRM
Then user enter "Admin" and "admin123" 
Then user click on login button
And user is on home page



   
   
   
#Notes
#Difference between scenario VS scenario outline with example =
#Simple data driven -- without Example keyword.   == simple and basic we just define scenario and step defination file and pass hardcoded value. (above is the Eg)
#With example + scenario outline= If we use scenario with example keyword so that time scenario become scenario outline Eg.

#With the help of scenario we can execute scenrio only one time but with the help of scenario outline example we can execute same test case more then one time with different data in one shot.
#In scenario we need to give hard code value and need update every time.

#------------------------------------------------------------------------------------------------------

#Difference between Scenario Outline + Example VS Data Table
#Scenario Outline: 
   #his uses Example keyword to define the test data for the Scenario
   #This works for the whole test.
   #Cucumber automatically run the complete test the number of times equal to the number of data in the Test Set.
   
#Data Table
   #No keyword is used to define the test data.
   #This works only for the single step, below which it is defined.
   #A separate code is need to understand the test data and then it can be run single or multiple times but again just for the single step, not for the complete test.
   
   