package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import automationCore.Base;
import pages.AdminUserPage;
import utility.ExcelUtility;
import utility.RandomDataUtility;

public class AdminUserTest extends Base {
	@Test
	public void verifyUserIsAbleToAddNewUserToUsersList() throws IOException {
	String username=ExcelUtility.getStringdata(0, 0, "LoginPage");
	String password=ExcelUtility.getStringdata(0, 1,"LoginPage" );
	AdminUserPage adminuser=new AdminUserPage(driver);
	adminuser.enterUsernameOnUsernameField(username);
	adminuser.enterPasswordOnPasswordField(password);
	adminuser.clickSignInButton();
	adminuser.clickAdmin();
	adminuser.clickManageUser();
	adminuser.clickNewButton();
	RandomDataUtility faker=new RandomDataUtility();
	String newusername=faker.createRandomUsername();
	String newpassword=faker.createRandomPassword();
	adminuser.enterAdminuserUsername(newusername);
	adminuser.enterAdminuserPassword(newpassword);
	adminuser.selectUserType();
	adminuser.clickSaveButton();
	
	
	}
}