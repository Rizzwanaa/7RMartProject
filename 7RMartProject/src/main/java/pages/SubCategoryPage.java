package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.PageUtility;

public class SubCategoryPage {
	public WebDriver driver;
	public SubCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']") private WebElement usernamefield;
	 @FindBy(xpath="//input[@type='password']") private WebElement passwordfield;
	 @FindBy(xpath="//button[@type='submit']") private WebElement signinbutton;
	 @FindBy (xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']") private WebElement subcategorybutton;
	 @FindBy(xpath="//h1[@class='m-0 text-dark']") private WebElement text;
	 @FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") private WebElement newbutton;
	@FindBy(xpath="//select[@class='form-control selectpicker']") private WebElement selectbutton;
@FindBy(xpath="//option[@value='560']") private WebElement option;
@FindBy(xpath="//input[@type='text']") private WebElement value;

public void enterUsernameOnUsernameField(String username) {
	usernamefield.sendKeys(username);
	}

public void enterPasswordOnPasswordField(String password) {
	passwordfield.sendKeys(password);
}

public void clickSignInButton() {
	signinbutton.click();
	}
 public void clickSubCategory() {
	 subcategorybutton.click();
}
 public String gettextFromSubcategoryPage() {
	 return text.getText();
	 }
 public void clickNewButton() {
	 newbutton.click();
	 
 }
 public void clickSelectButton() {
	 selectbutton.click();
	 
 }
 public void clickOption() {
	 option.click();
	 
	 
 }
 public void entersubcategory() {
	value.getText();
	 
 }
 
 public String selectoption() {
	return option.getText();
 }
}
