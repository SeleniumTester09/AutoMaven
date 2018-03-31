package MavenDemo.AutoMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestLogin {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		
		  System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
		   driver = new ChromeDriver();
		
	}
	
	@AfterSuite
	public void tearDown(){
		System.out.println("Quitting the driver");
		driver.quit();
	}
	
	
	@Test(priority=1)
	public void navigateURL(){
		
		driver.get("http://google.com");
		
	}
	
	@Test(priority=2)
	public void validateTitle(){
		
		Assert.assertEquals("Google", driver.getTitle());
	}

}
