package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFBStepFile
{
	WebDriver driver;
	
	@Given("^open chrome browser$")
	public void open_chrome_browser() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "F:\\Cucumber_Project\\Drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	        System.out.println("Open the Browser and launch the application.");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password()
	{
		System.out.println("Enter the Username and Password");
	       driver.findElement(By.id("email")).sendKeys("nikita123@gmail.com");
	       driver.findElement(By.id("pass")).sendKeys("nikita@123");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() 
	{
		 driver.findElement(By.id("u_0_b")).click();
		 System.out.println("Clicks on Login button");
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		System.out.println("Close the browser");
		Thread.sleep(3000);
		driver.quit();
	}


}
