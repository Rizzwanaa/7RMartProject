package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.HomePage;
import pages.LoginPage;
import utility.ExcelUtility;

public class Hometest extends Base {

@Test(description="Whether user is able to logout of admin page")
public void verifyUserIsAbleToLogoutFromHomePage() throws IOException {

	String username=ExcelUtility.getStringdata(0, 0, "LoginPage");
	String password=ExcelUtility.getStringdata(0, 1,"LoginPage" );
	HomePage home=new HomePage(driver);
	home.enterUsernameOnUsernameField(username);
	home.enterPasswordOnPasswordField(password);
	home.clickSignInButton();
	home.clickOnAdminButton();
	home.clickOnLogOutButton();
}
	
}