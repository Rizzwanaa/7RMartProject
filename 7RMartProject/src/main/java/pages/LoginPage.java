package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']") private WebElement usernamefield;
	 @FindBy(xpath="//input[@type='password']") private WebElement passwordfield;
	 @FindBy(xpath="//button[@type='submit']") private WebElement signinbutton;
	 @FindBy(xpath="//li[@class='breadcrumb-item active']") private WebElement dashboard;
	 @FindBy(xpath="//b[text()='7rmart supermarket']") private WebElement logintext;
	 
	 
		 
	
	public void enterUsernameOnUsernameField(String username) {
		usernamefield.sendKeys(username);
		}
	
	public void enterPasswordOnPasswordField(String password) {
		passwordfield.sendKeys(password);
	}
	
	public void clickSignInButton() {
		signinbutton.click();
		}
	
	public boolean isDashBoardDisplayed() {
		return dashboard.isDisplayed();
		}
	
	public String getTextFromLoginText() {
		return logintext.getText();
		
	}
	

}