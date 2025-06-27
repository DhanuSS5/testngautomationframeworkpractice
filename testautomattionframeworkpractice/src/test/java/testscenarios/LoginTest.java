package testscenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.LoginPage;

public class LoginTest extends Base{
	@Test
	public void loginTest()
	{
	String username="admin";
	String password="admin";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserName(username);
	loginpage.enterPassword(password);
	loginpage.signinButton();
	//loginpage.isDashboardDisplayed();
	boolean isdashboardvisible=loginpage.isDashboardDisplayed();
	Assert.assertTrue(isdashboardvisible);
	
	
	
	}
	}
