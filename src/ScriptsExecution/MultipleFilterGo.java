package ScriptsExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericlibraries.BaseTest;
import genericlibraries.Constant;
import genericlibraries.Excel;
import genericlibraries.ScrollbarLib;
import genericlibraries.SelectLib;
import pom.BlankPage2;
import pom.BlankPage22;
import pom.HomePage2;
import pom.LoginPage;
import pom.ProductDetailsPage2;
import pom.ProductPage2;

public class MultipleFilterGo extends BaseTest {

	@Test
	public  void multiplefilter() throws InterruptedException {
        
        LoginPage l=new LoginPage(driver);
        l.signinbutton();
        Thread.sleep(3000);
        String username=Excel.getdata("Sheet1", 3, 2);
        l.emailtb(username);
        String password=Excel.getdata("Sheet1", 4, 2);
        l.passwordtb(password);
        l.loginbtn();
        
 //scrollbar 
     
        HomePage2 h=new HomePage2(driver);
        Thread.sleep(3000);
//        ScrollbarLib s= new ScrollbarLib();
        ScrollbarLib.Scrollbar(driver,0,500);
        Thread.sleep(3000);
//        for(int i=0;i<5;i++)
//        {
//        s.Scrollbar(driver, 0,300);
//        }
        h.searchTextBox();
        
        ProductPage2 p=new ProductPage2(driver);
        p.bornToBeMen();
        p.vivid();
        p.colour();
        p.bay();
        p.onefineday();
        
        ProductDetailsPage2 pp=new ProductDetailsPage2(driver);
        pp.theSize();
        Thread.sleep(3000);
        pp.addToBag();
      
        BlankPage2 b=new BlankPage2(driver);
        Thread.sleep(3000);
        b.viewBag();
        
        BlankPage22 bb=new BlankPage22(driver);
        Thread.sleep(3000);
        bb.logOut();
      
        
	}
}
        		
        
        		
        
        		
        		
		
		
