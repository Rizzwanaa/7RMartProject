package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//input[@type='text']") private WebElement usernamefield;
	@FindBy(xpath="//input[@type='password']") private WebElement passwordfield;
	@FindBy(xpath="//button[@type='submit']") private WebElement signinbutton;
	@FindBy(xpath="//a[@data-toggle='dropdown']") private WebElement adminbutton;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']") private WebElement logoutbutton;

public void enterUsernameOnUsernameField(String username) {
	usernamefield.sendKeys(username);
	}

public void enterPasswordOnPasswordField(String password) {
	passwordfield.sendKeys(password);
}

public void clickSignInButton() {
	signinbutton.click();
	}
public void clickOnAdminButton() {
	adminbutton.click();
	
}
public void clickOnLogOutButton() {
	logoutbutton.click();
	
}
}
