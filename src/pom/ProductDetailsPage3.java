package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class ProductDetailsPage3 extends BasePage{
	
	@FindBy (xpath="(//a[@class='btn-popover swatch-item '])[5]")
	private WebElement details;
	
	@FindBy (id="add-to-cart")
	private WebElement addtocart;
	
	
	
	public ProductDetailsPage3(WebDriver driver) 
	{
	     	PageFactory.initElements(driver, this);
	}
	
	
	public void productDetails()
	{
		details.click();
	}
	public void addToCart()
	{
		addtocart.click();
	}

}
