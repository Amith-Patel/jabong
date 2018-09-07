package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class ProductPage4 extends BasePage{
	
	@FindBy (xpath="(//input[@type='checkbox'])[1]")
	private WebElement boys;
	
	@FindBy (xpath="//span[.='Marvel Spider-Man K Red Running Shoes']")
	private WebElement product;
	
	public ProductPage4(WebDriver driver) 
	{
	     	PageFactory.initElements(driver, this);
	}
	
	public void bornToBeMen()
	{
		boys.click();
	}

	public void selectedProduct()
	{
	    product.click();
	}


}
