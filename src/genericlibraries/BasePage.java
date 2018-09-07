package genericlibraries;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	public void elementPresent(WebDriver driver,WebElement element)
	{
		try
		{
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not present");
			Assert.fail();
		}
	}
	
	public void elementIsClickable(WebDriver driver,WebElement element)
	{
		try
		{
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.elementToBeClickable(element));
		Reporter.log("element is clickable",true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not clickable");
			Assert.fail();
		}
	}
	
	}


