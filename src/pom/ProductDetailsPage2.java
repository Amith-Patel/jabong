package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;
import genericlibraries.SelectLib;

public class ProductDetailsPage2 extends BasePage{
	
	@FindBy (xpath="(//select[@class='form-control '])[1]") 
	private WebElement selectsize;
	
	@FindBy (xpath="(//button[.='add to Bag'])[1]")
	private WebElement addtobag;
	
	public  ProductDetailsPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void theSize()
	{
		//SelectLib.select(selectsize, "ONESIZE");
		
		SelectLib.select(selectsize, 1);
	}
	public void addToBag()
	{
		addtobag.click();
	}

}
