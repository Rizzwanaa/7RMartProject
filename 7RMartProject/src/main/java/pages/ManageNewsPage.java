package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage  {
	public  WebDriver driver;
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']") private WebElement managenewsfield;
	 @FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") private WebElement newbutton;
	@FindBy(xpath="//textarea[@id='news']")private WebElement addnews;
	@FindBy(xpath="//button[@class='btn btn-danger']") private WebElement savebutton;
	@FindBy(xpath="//div[@class='card-header']") private WebElement text;
	 
		
		public void clickManageNewsButton() {
			managenewsfield.click();
			
		}
		public void clickNewButton() {
			newbutton.click();
		}
		
		public void enterNewsOnField(String newsfield) {
			addnews.sendKeys(newsfield);
			
		}
		public void clickSaveButton() {
			savebutton.click();
			
		}
		public String getTextFromManageNews() {
			return text.getText();

			
			}
		}