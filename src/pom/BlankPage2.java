package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class BlankPage2 extends BasePage 
{
	@FindBy (xpath="//a[@class='goto-link ']")
    private WebElement viewbag;
	
	public BlankPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void viewBag()
	{
		viewbag.click();
	}
}
