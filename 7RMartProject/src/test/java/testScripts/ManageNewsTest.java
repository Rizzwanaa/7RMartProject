package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import pages.ManageNewsPage;
import utility.ExcelUtility;

public class ManageNewsTest extends Base {
	
@Test
	public void verifyUserIsAbleToAddNewNews() throws IOException {
		String username=ExcelUtility.getStringdata(0, 0, "LoginPage");
		String password=ExcelUtility.getStringdata(0, 1,"LoginPage" );
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickSignInButton();
		ManageNewsPage managenews=new ManageNewsPage(driver);
		managenews.clickManageNewsButton();
		managenews.clickNewButton();
		String newsfield=ExcelUtility.getStringdata(0, 0, "ManageNewsPage");
		managenews.enterNewsOnField(newsfield);
		managenews.clickSaveButton();
		String expectedResult="Enter News Informations";
		String actualResult=managenews.getTextFromManageNews();
		Assert.assertEquals(actualResult,expectedResult,"User is unable to click on managenews button");
				
		
		
}

		
}