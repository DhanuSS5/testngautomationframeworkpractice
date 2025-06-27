package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	public WebDriver driver;
	public LoginPage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")WebElement usrname;
	@FindBy(xpath="//input[@name='password']")WebElement psword;
	@FindBy(xpath="//button[@type='submit']")WebElement sinin;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;	

public void enterUsername(String username)
{
	usrname.sendKeys(username);
}
public void enterPassword(String password)
{
	psword.sendKeys(password);
}
public void clickSignin()
{
	sinin.click();
}
public boolean isDashBoardDispalyed()
{
	return dashboard.isDisplayed();
}
}
