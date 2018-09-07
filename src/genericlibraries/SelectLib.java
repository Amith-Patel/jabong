package genericlibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectLib {
	public WebDriver driver;
	
	public static void  select(WebElement ele,int i)
	{
		Select s = new Select(ele);
		s.selectByIndex(i);
	}

}
