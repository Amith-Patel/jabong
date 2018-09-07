package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class ProductPage0 extends BasePage{
	
	@FindBy (xpath="//span[.='Superfly Sock Black Running Shoes']")
	private WebElement product;
	
	
	
	public ProductPage0(WebDriver driver) 
	{
	     	PageFactory.initElements(driver, this);
	}
	
	
	public void selectedProduct()
	{
		product.click();
	}

}
