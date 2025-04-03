package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void dropdownSelectionByIndex(WebDriver driver,int index,WebElement element) {
	
		Select select=new Select(element);
		select.selectByIndex(2);
	}
	
	public void dropdownSelectionByValue(WebDriver driver,String value) {
		WebElement dropdown2=driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select select2=new Select(dropdown2);
		select2.selectByValue("maven");
	}
	
	public void dropdownSelectionByVisibleText(WebDriver driver,String text) {
		WebElement dropdown3=driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select select3=new Select(dropdown3);
		select3.selectByVisibleText("CSS");
	}
	public void checkboxSelection(WebDriver driver) {
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox.click();
	}
	public void radiobuttonSelection(WebDriver driver) {
		WebElement radiobutton2=driver.findElement(By.xpath("//input[@value='purple']"));
		radiobutton2.click();
	}
	public void rightClickAction(WebDriver driver) {
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions action=new Actions(driver);
		action.contextClick(rightclick).build().perform();
	}
	public void mouseOverAction(WebDriver driver) {
		WebElement doubleclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions action=new Actions(driver);
		action.moveToElement(doubleclick).build().perform();
	}
	
	public void dragAndDropAction(WebDriver driver) {
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		}
	
	public void scrollWindowAction(WebDriver driver) {
	WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']")); 
 	JavascriptExecutor js = (JavascriptExecutor)driver; 
 	js.executeScript("arguments[0].click();", showMessageButton);
 	js.executeScript("window.scrollBy(0,-350)", "");
	
	}
}