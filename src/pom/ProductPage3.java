package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class ProductPage3 extends BasePage{
	@FindBy (xpath="(//input[@type='checkbox'])[3]")
	private WebElement men;
	
	@FindBy (xpath="//span[.='Gazelle Black Running Shoes']")
	private WebElement product;
	
	public ProductPage3(WebDriver driver) 
	{
	     	PageFactory.initElements(driver, this);
	}
	
	public void bornToBeMen()
	{
		men.click();
	}

	public void selectedProduct()
	{
	    product.click();
	}

}
