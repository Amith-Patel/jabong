package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class BlankPage22 extends BasePage{
	
	@FindBy (xpath="//a[@class='moengage-logout']")
	private WebElement logout;
	
	public BlankPage22(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void logOut()
	{
		logout.click();
	}
 

}
