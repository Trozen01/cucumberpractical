Feature: Test Tagged Hooks

@First 
Scenario: This is First Scenario
	Given this is the first step
	When this is the second step
	Then this is the third step

@Second	
Scenario: This is Second Scenario
	Given this is the first step
	When this is the second step
	Then this is the third step

@Third	
Scenario: This is Third Scenario
	Given this is the first step
	When this is the second step
	Then this is the third step
	
	
	
#note:
#tagged hooks:- Suppose we have 3 scenario & common method for every scenario (Before and After method) and also we have some special method which we want run before and after specific method.
#We can set ordering also suppose we have more then one Global hooks (Before hooks) so we can set ordering like in TagHooksStepDefinationSecondPart
#Benifit=1.Hooks allow us to better manage code workflow.  2.It help us for code reusability.
#This prerequisite can be anything from:
#Starting a webdriver
#Setting up DB connections
#Setting up test data
#Setting up browser cookies
#Navigating to certain page
#or anything before the test  