package testScripts;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.SubCategoryPage;
import utility.ExcelUtility;

public class SubCategoryTest extends Base {
	
@Test(description="whether user is able to add category on subcategory")
public void verifyUserIsAbleToAddCategoryOnSubCategory() throws IOException {
	String username=ExcelUtility.getStringdata(0, 0, "LoginPage");
	String password=ExcelUtility.getStringdata(0, 1,"LoginPage" );
	SubCategoryPage subcategory=new SubCategoryPage(driver);
	subcategory.enterUsernameOnUsernameField(username);
	subcategory.enterPasswordOnPasswordField(password);
	subcategory.clickSignInButton();
	subcategory.clickSubCategory();
	subcategory.clickNewButton();
	subcategory.clickSelectButton();
	subcategory.clickOption();
	String expectedResult="burger";
	String actualResult=subcategory.selectoption();
	Assert.assertEquals(actualResult,expectedResult,"user is unable to click on select button" );
}

	
	
}