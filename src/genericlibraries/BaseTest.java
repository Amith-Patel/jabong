package genericlibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constant{
	public static WebDriver driver;
	
      @BeforeMethod   
		  public void openApp()
		    {
			System.setProperty(key,value);
			driver=new ChromeDriver();
	        String url=Excel.getdata("Sheet1",1,2);
	        driver.get(url);
	
	        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    }
      
      @AfterMethod
      public void closeApp(ITestResult test)
      {
    	  String name=test.getName();  
    	  int status=test.getStatus();
    	  if(status == 2)
    	  {
    		  Photo.getPhoto(driver, photopath, name);
    	  }
          driver.quit();
      }
      

}
