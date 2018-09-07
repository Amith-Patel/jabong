package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class ProductPage2 extends BasePage{
	
	@FindBy (xpath="//a[.='Men']")
	private WebElement men;
	
	@FindBy (xpath="//a[.='Caps']")
	private WebElement categories;
	
	@FindBy (xpath="//a[.='Black']")
	private WebElement color;
	
	@FindBy (xpath="//span[@class='wishlist-icon ']")
	private WebElement hearticon;
	
	@FindBy (xpath="//a[@class='goto-link']")
	private WebElement addtowishlist;
	
	public ProductPage2(WebDriver driver) 
	{
	     	PageFactory.initElements(driver, this);
	}
	
	public void bornToBeMen()
	{
		men.click();
	}
	public void vivid()
	{
		categories.click();
	}
	public void colour()
	{
		color.click();
	}
	public void bay()
	{
		hearticon.click();
	}
	public void onefineday()
	{
		addtowishlist.click();
	}
	
	}
	
	


