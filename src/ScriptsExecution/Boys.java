package ScriptsExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericlibraries.BaseTest;
import genericlibraries.Constant;
import genericlibraries.Excel;
import pom.HomePage;
import pom.LoginPage;
import pom.ProductDetailsPage3;
import pom.ProductDetailsPage4;
import pom.ProductPage3;
import pom.ProductPage4;
import pom.ViewBagPage3;
import pom.ViewBagPage4;

public class Boys extends BaseTest{

	@Test
	public  void boys() throws InterruptedException {
        
        LoginPage l=new LoginPage(driver);
        l.signinbutton();
        Thread.sleep(3000);
        String username=Excel.getdata("Sheet1", 3, 2);
        l.emailtb(username);
        String password=Excel.getdata("Sheet1", 4, 2);
        l.passwordtb(password);
        l.loginbtn();
       
       HomePage h=new HomePage(driver);
       String search=Excel.getdata("Sheet1", 6, 2);
       Thread.sleep(3000);
       h.searchTextBox(search);
       h.searchIcon();
       
       ProductPage4 p=new  ProductPage4(driver);
       p.selectedProduct();
       
       ProductDetailsPage4 pdp=new ProductDetailsPage4(driver);
       pdp.productDetails();
       pdp.addToCart();
       
       ViewBagPage4 v= new  ViewBagPage4(driver);
       Thread.sleep(3000);
       v.viewBag();
       
      


	}

}
