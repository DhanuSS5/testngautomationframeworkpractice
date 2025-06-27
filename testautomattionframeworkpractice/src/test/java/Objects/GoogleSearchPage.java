package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driver;
	public GoogleSearchPage(WebDriver driver)
	{
		this.driver=driver;
		
	}

	By searchbox=By.xpath("//textarea[@name='q']");
	public void searchgoogle(String searchinput) throws InterruptedException
	{
		driver.findElement(searchbox).sendKeys(searchinput);
		Thread.sleep(5000);
	}
}
