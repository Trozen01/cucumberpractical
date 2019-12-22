/*package stepDefiniation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefiniation {
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
	public void user_enter_username_and_password(String id, String Password) {
		wd.findElement(By.id("txtUsername")).sendKeys(id);
		wd.findElement(By.id("txtPassword")).sendKeys(Password);
	}


	@Then("^user click on login button$")
	public void user_click_on_login_button() {
		wd.findElement(By.id("btnLogin")).click();
		
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		System.out.println("title is after login :-" + CTitle);
		Assert.assertEquals(title, CTitle);
	
	}
}
*/