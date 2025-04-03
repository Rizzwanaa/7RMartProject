package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.PageUtility;

public class AdminUserPage {
	public WebDriver driver;
	public AdminUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']") private WebElement usernamefield;
	 @FindBy(xpath="//input[@type='password']") private WebElement passwordfield;
	 @FindBy(xpath="//button[@type='submit']") private WebElement signinbutton;
	@FindBy(xpath="//i[@class='nav-icon fas fa-users']") private WebElement adminusericon;
	@FindBy(xpath="//p[text()='Manage Users']") private WebElement manageuserbutton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") private WebElement newbutton;
	@FindBy(xpath="//input[@id='username']") private WebElement adminusername;
	@FindBy(xpath="//input[@id='password']") private WebElement adminpassword;
	@FindBy(xpath="//select[@id='user_type']") private WebElement select;
	
	@FindBy(xpath="//button[@name='Create']") private WebElement save;
	
	@FindBy(xpath="//h3[text()='Admin Users Informations']") private WebElement text;

	
	public void enterUsernameOnUsernameField(String username) {
		usernamefield.sendKeys(username);
		}

	public void enterPasswordOnPasswordField(String password) {
		passwordfield.sendKeys(password);
	}

	public void clickSignInButton() {
		signinbutton.click();
		}
	public void clickAdmin() {
		adminusericon.click();
		
}
	public void clickManageUser() {
		manageuserbutton.click();
		
	}
	public void clickNewButton() {
		newbutton.click();
		
	}
	
	public void enterAdminuserUsername(String newusername) {
		adminusername.sendKeys(newusername);
	}
	
	public void enterAdminuserPassword(String newpassword) {
		adminpassword.sendKeys(newpassword);
	}
	
	
	public void selectUserType() {
		select.click();
		PageUtility selecttype=new PageUtility();
		selecttype.dropdownSelectionByIndex(driver, 2, select);
	}
	
	public void clickSaveButton() {
		save.click();
	}
	
public String getTextFromAdminUser() {
	return text.getText();
}
}