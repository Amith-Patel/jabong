package genericlibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionLib {
	
	public WebDriver driver;
	
	public void moveToElement(WebDriver driver,WebElement target)
	{
		Actions a =new Actions(driver);
		a.moveToElement(target).perform();
	}
	
	

}
