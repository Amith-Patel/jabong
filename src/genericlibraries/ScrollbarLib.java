package genericlibraries;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollbarLib {
	public  static void Scrollbar(WebDriver driver,int x,int y)
	{
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
	}

}
