package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class HomePage2 extends BasePage{
	
	@FindBy (xpath="//a[.='Levis']")
	private WebElement levi;
	

	public HomePage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchTextBox()
	{
		levi.click();
	}

}
