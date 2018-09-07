package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class Remove extends BasePage{
	
	@FindBy (xpath="//span[@class='delete-icon common-sprite']")
	private WebElement remove;
	
	public Remove(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void removeButton() 
	{
		remove.click();
	}
	

}
