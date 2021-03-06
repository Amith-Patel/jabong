package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class Logout1 extends BasePage{
	
	@FindBy (linkText="Logout")
	private WebElement logout;
	
	public Logout1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void logOut()
	{
		logout.click();
	}

}
