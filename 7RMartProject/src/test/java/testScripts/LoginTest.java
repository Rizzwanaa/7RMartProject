package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;

import java.io.IOException;

import pages.LoginPage;
import utility.ExcelUtility;

public class LoginTest extends Base {
	@Test(description="whether user  is able to login successfully with valid credentials",priority=1)
	public void verifyUserLoginWithValidCredentials() throws IOException {
		String username=ExcelUtility.getStringdata(0, 0,"LoginPage");
		String password=ExcelUtility.getStringdata(0, 1,"LoginPage" );
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickSignInButton();
		boolean isDashBoardDisplayed=login.isDashBoardDisplayed();
		Assert.assertTrue(isDashBoardDisplayed, Messages.VALIDCREDENTIALERROR);
		
		}
	@Test(description="whether user  is able to login successfully with valid username and invalid password",groups= "smoke",priority=2)
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
        String username=ExcelUtility.getStringdata(1, 0, "LoginPage");
		String password=ExcelUtility.getStringdata(1, 1,"LoginPage" );
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickSignInButton();
		
		}
	@Test(description="whether user  is able to login with invalid username and valid password",groups= "smoke",priority=3)
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
        String username=ExcelUtility.getStringdata(2, 0, "LoginPage");
		String password=ExcelUtility.getStringdata(2, 1,"LoginPage" );
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickSignInButton();
		
		}
	
	@Test(description="whether user  is able to login with invalid credentials",groups= "smoke",priority=4)
	public void verifyUserLoginWithInvalidCredentials() throws IOException {
        String username=ExcelUtility.getStringdata(3, 0, "LoginPage");
		String password=ExcelUtility.getStringdata(3, 1,"LoginPage" );
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickSignInButton();
		
		
		
	}

}