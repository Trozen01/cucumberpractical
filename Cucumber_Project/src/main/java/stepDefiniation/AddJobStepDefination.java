/*package stepDefiniation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddJobStepDefination {
	
	public WebDriver wd;
	public String url, title, CTitle;

	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws InterruptedException {

		System.out.println("Start Cucumbar testing");

		url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir")+ "\\src\\main\\java\\Browserexe\\chromedriver.exe");

		wd = new ChromeDriver();
		wd.get(url);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

	}

	@When("^title of the page is orange CRM$")
	public void title_of_the_page_is_orange_CRM() {
		title = "OrangeHRM";
		CTitle = wd.getTitle();
		System.out.println("title is before login:-" + CTitle);
		Assert.assertEquals(title, CTitle);

	}
//Reg exp:.
//1.\"(.*)\"
//2.\"(.*)\"	

	
	@Then("^user enter \"(.*)\" and \"(.*)\"$")
	public void user_enter_username_and_password(String username, String password) {
		wd.findElement(By.id("txtUsername")).sendKeys(username);
		wd.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() {
		wd.findElement(By.id("btnLogin")).click();
		
		// if log in button is not work that time we use java script executor.
		//Creating the JavascriptExecutor interface object by Type casting		
		//WebElement logbutton=wd.findElement(By.id("btnLogin")).click();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeAsyncScript("arguments[0];", logbutton)
		
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		System.out.println("title is after login :-" + CTitle);
		Assert.assertEquals(title, CTitle);
		

	}
	
	@Then("^go to add job page$")
	public void go_to_add_job_page() throws InterruptedException  {
	 
		 //Instantiate Action Class        
		  Actions action = new Actions(wd);
		  
		  //Retrieve WebElement 'Admin' to perform mouse hover 
		WebElement Adminicon = wd.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
		 //Mouse hover menuOption 'Music'
	     action.moveToElement(Adminicon).build().perform();
	     System.out.println("Done hover on 'Admin' from Menu");
		
	   //Now Select 'job' from sub menu which has got displayed on mouse hover of 'Admin'
	    WebElement jobcon  = wd.findElement(By.id("menu_admin_Job"));
	    //Mouse hover menuOption 'job'
	     action.moveToElement(jobcon).build().perform();
	     System.out.println("Done Mouse hover on 'Job' from Menu");
	     
	     
		// Now, finally click on add job title.
		WebElement addjob  = wd.findElement(By.id("menu_admin_viewJobTitleList"));
        addjob.click();
        
        // click on add button.
        wd.findElement(By.id("btnAdd")).click();
        Thread.sleep(1000);	
		  
        // mouse hover example
        //https://www.toolsqa.com/selenium-webdriver/mouse-hover-action/
        
	}
	
	@Then("^add new job \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void add_new_job_IT_Mangr_and_IT_and_test(String jobname, String jobdescr, String jnote)  {
		wd.findElement(By.id("jobTitle_jobTitle")).sendKeys(jobname);
		wd.findElement(By.id("jobTitle_jobDescription")).sendKeys(jobdescr);
		wd.findElement(By.id("jobTitle_note")).sendKeys(jnote);
		wd.findElement(By.id("btnSave")).click();
		
	    
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	 wd.close();
	 
	}

}
*/