package testscenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.LoginPage1;

public class LoginTest1 extends Base{
	@Test
	public void loginTest()
	{
		String username="admin";
		String password="admin";
		LoginPage1 loginpage1=new LoginPage1(driver);
		loginpage1.enterUsername(username);
		loginpage1.enterPassword(password);
		loginpage1.clickSignin();
		//loginpage1.isDashBoardDispalyed();
		boolean isdashboarddisplayedvariable=loginpage1.isDashBoardDispalyed();
		Assert.assertTrue(isdashboarddisplayedvariable);
	}

}
