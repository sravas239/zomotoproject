package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class zomotologinsteps {
	WebDriver driver;
	
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	}

	@When("I open Zomoto home page")
	public void i_open_zomoto_home_page() {
	  driver.get("https://www.zomato.com");
	}

	@Then("I verify that username and password")
	public void i_verify_that_username_and_password() {
	   driver.findElement(By.xpath("//a[text()='Log in']")).click();
//	  driver.findElement(By.xpath("//span[text()='Create account']")).click();
	  
	  driver.findElement(By.xpath("//div[@type='number']")).sendKeys("9603661643");
	 
	}

	@Then("close browser")
	public void close_browser() {
	   driver.close();
	}
}
