package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:/Users/Trozen/workspace/Cucumber_Project/src/main/java/Features/TaggedHooks.feature",    // path of step defination file.
		glue={"stepDefiniation"},            //path of the step defination file.
		format ={"pretty","html:test-output", "json:json_output/cucumber.json","junit:json_xml/cucumbar.xml"},        // it use for create report in many type of format like html,Json,xml
		monochrome= true,                    // display the console output in a proper readable format.
	    strict =true,                      // it will check if any step is not defined in step definition file. 
		dryRun = false                  // to check the mapping is proper between feature file and step definiation file.
		//tags = {"~@SmokeTest,@RegressionTest"}
		)

public class TestRunner {

	
	
}

//note
//1. What are options are avaliable in cucumbar. Ans:DryRun feature Glue,Tags,Monochrome,Format,Strict


//ORed : tags = {"@SmokeTest,@RegressionTest"} --execute all tests tagged as @SmokeTest or @RegressionTest
//ANDed : tags = {"@SmokeTest","@RegressionTest"} --execute all tests tagged as @SmokeTest and @RegressionTest
// ~ = tages =  tags = {"~@SmokeTest,@RegressionTest"}  -- Ignore all tests tagged (exclude all @SmokeTest)
