package stepdefenation;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_defination {
	WebDriver driver;
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Cucumber_project\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("enable-automation");
		options.addArguments("--disable-browser-side-navigation");
		//options.addArguments("--headless");
		//options.addArguments("--window-size=1920,1080");
		//options.addArguments("--no-sandbox");
		options.addArguments("--disable-extensions");
		options.addArguments("--dns-prefetch-disable");
		options.addArguments("--disable-gpu");
		/*
		 * System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,
		 * "true"); Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		 */
		//--disable-browser-side-navigation
		 driver = new ChromeDriver();
		 System.out.println("login page");
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//WebElement email1= driver.findElement(By.xpath("//input[@id='email']"));
		  
	}

	@When("^user navigate to login page$")
	public void user_navigate_to_login_page() throws Throwable {
		
	   WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
	   Thread.sleep(1000);
	   System.out.println("login page");
	   email.sendKeys("anujrajput3333@gmail.com");
	   
	}

	@And("^enters user id and pass$")
	public void enters_user_id_and_pass() throws Throwable {
		WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Rajput@3333");
	    
	}

	@Then("^login sucessfully$")
	public void login_sucessfully() throws Throwable {
	    driver.findElement(By.id("u_0_b")).click();
	  
	}



}
