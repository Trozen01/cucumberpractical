package stepDefiniation;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagHooksStepDefinationSecondPart {

	//Global hooks
	@Before(order=0)
	public void beforeScenario() {
		System.out.println("Lunch chrome browser");
	}

	@After(order=0)
	public void afterScenario() {
		System.out.println("Close chrome browser");
	}
	
	@Before(order=1)    // just example for orderring 
	public void beforeScenario1() {
		System.out.println("Lunch chrome browser");
	}

	@After(order=1)
	public void afterScenario1() {
		System.out.println("Close chrome browser");
	}
/*---------------------------------------------------------------------------------------*/	
	
	//local -only for first sceario
	@Before("@First")
	public void beforeFirst() {
		System.out.println("This will run only before the First Scenario");
	}

	@After("@First")
	public void afterFirst() {
		System.out.println("This will run only after the First Scenario");
	}

	@Before("@Second")
	public void beforeSecond() {
		System.out.println("This will run only before the Second Scenario");
	}

	@After("@Second")
	public void afterSecond() {
		System.out.println("This will run only after the Second Scenario");
	}

	@Before("@Third")
	public void beforeThird() {
		System.out.println("This will run only before the Third Scenario");
	}

	@After("@Third")
	public void afterThird() {
		System.out.println("This will run only after the Third Scenario");
	}

	@Given("^this is the first step$")
	public void This_Is_The_First_Step() {
		System.out.println("This is the first step");
	}

	@When("^this is the second step$")
	public void This_Is_The_Second_Step() {
		System.out.println("This is the second step");
	}

	@Then("^this is the third step$")
	public void This_Is_The_Third_Step() {
		System.out.println("This is the third step");
	}
}
