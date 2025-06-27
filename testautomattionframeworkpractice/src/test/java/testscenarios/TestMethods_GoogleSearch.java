package testscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.GoogleSearchPage;

public class TestMethods_GoogleSearch {
	WebDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		}
	@Test
	public void SearchOperation() throws InterruptedException {
		GoogleSearchPage page=new GoogleSearchPage(driver);
		page.searchgoogle("facebook");
		
		
	}
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}
	

}
