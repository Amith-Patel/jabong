package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class ProductPage1 extends BasePage{
	
	@FindBy (xpath="//span[.='Superfly Sock Black Running Shoes']")
	private WebElement product;
	
	public ProductPage1(WebDriver driver) 
	{
	     	PageFactory.initElements(driver, this);
	}

	public void selectedProduct()
	{
	    product.click();
	}

	

}
