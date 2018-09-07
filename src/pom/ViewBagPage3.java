package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class ViewBagPage3 extends BasePage{
       
	@FindBy (xpath="//a[.='View Bag']")
	private WebElement viewbag;
	
	
	public ViewBagPage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void  viewBag()
	{
		viewbag.click();
	}

}
