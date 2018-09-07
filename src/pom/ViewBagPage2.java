package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class ViewBagPage2 extends BasePage{
      
	@FindBy (xpath="//a[@class='remove']")
	private WebElement remove;
	
	public ViewBagPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void removeitem()
	{
		remove.click();
	}
 }
