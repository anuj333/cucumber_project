package stepdefenation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Testjava {
@Test
public void loginnew() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Cucumber_project\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
	   Thread.sleep(1000);
	   System.out.println("login page");
	   email.sendKeys("anujrajput3333@gmail.com");
	   
	   WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Rajput@3333");
		
		 driver.findElement(By.id("u_0_b")).click();
}

}
