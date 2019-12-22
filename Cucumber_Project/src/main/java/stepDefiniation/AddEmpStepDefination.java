/*package stepDefiniation;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmpStepDefination {
public WebDriver wd;
public String url, title, CTitle;
	
@Given("^User is already on login page$")
public void user_is_already_on_login_page() throws InterruptedException{

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

@Then("^user enter username and password$")
public void user_enter_username_and_password_Then_go_to_add_employee_page( DataTable credentials)  {
	List<List<String>> dealValues = credentials.raw();
    
	wd.findElement(By.id("txtUsername")).sendKeys(dealValues.get(0).get(0));
	wd.findElement(By.id("txtPassword")).sendKeys(dealValues.get(0).get(1));
	wd.findElement(By.id("btnLogin")).click();
}

@Then("^user is on home page$")
public void user_is_on_home_page() {
	System.out.println("title is after login :-" + CTitle);
	Assert.assertEquals(title, CTitle);
	System.out.println("User is now on Home page");

}

@Then("^go to add Employee Page$")
public void go_to_add_Employee_Page() throws InterruptedException{
	
	Actions action = new Actions(wd);
	WebElement Adminicon = wd.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
	 //Mouse hover menuOption 'Music'
    action.moveToElement(Adminicon).build().perform();
    System.out.println("Done hover on 'PIM' from Main Menu");

    wd.findElement(By.id("menu_pim_viewEmployeeList")).click();
    Thread.sleep(1000);	
    
    wd.findElement(By.id("btnAdd")).click();
    Thread.sleep(1000);	
}

@Then("^Add employee$")
public void add_employee( DataTable DataEmp ) throws InterruptedException  {
    List<List<String>> dealValues = DataEmp.raw();
    
	wd.findElement(By.id("firstName")).sendKeys(dealValues.get(0).get(0));
	wd.findElement(By.id("middleName")).sendKeys(dealValues.get(0).get(1));
	wd.findElement(By.id("lastName")).sendKeys(dealValues.get(0).get(2));
	wd.findElement(By.id("employeeId")).sendKeys(dealValues.get(0).get(3));
	wd.findElement(By.id("btnSave")).click();
	Thread.sleep(1000);	
	
}

@Then("^exit from the browser$")
public void exit_from_the_browser()  {
    wd.close();
}

}

//Note:- scenario with table is not a great aproach because with the help of this we canm execute only one line.
//and with the help of the secnario outline with example keyword we can execute multipal execution.*/