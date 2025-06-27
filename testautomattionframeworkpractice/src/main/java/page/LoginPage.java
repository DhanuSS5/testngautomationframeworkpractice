package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver  driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")WebElement user;
	@FindBy(xpath="//input[@name='password']")WebElement pasword;
	@FindBy(xpath="//button[@type='submit']")WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	
	public void enterUserName(String username)
	{
		user.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		pasword.sendKeys(password);
	}

	public void signinButton()
	{
		signin.click();
	}
	public boolean isDashboardDisplayed()
	{
		return dashboard.isDisplayed();
	}
}
