package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class HomePage extends BasePage{
     
	@FindBy (id="search")
	private WebElement searchtb;
	
	@FindBy (xpath="//span[@class='top-search-icon hidden-xs']")
	private WebElement searchicon;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchTextBox(String searchit)
	{
		searchtb.sendKeys(searchit);
	}
	public void searchIcon() 
	{
		searchicon.click();
	}
	
}
