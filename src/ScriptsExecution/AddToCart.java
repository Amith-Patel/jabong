package ScriptsExecution;	
import org.testng.annotations.Test;

import genericlibraries.BaseTest;

	import genericlibraries.Excel;
	import pom.HomePage;
	import pom.LoginPage;
	import pom.ProductDetailsPage0;
	import pom.ProductPage0;
	import pom.ViewBagPage0;

	public class AddToCart extends BaseTest{
	    
	        @Test
	        public void actualExecution() throws InterruptedException
	        {
	        LoginPage l=new LoginPage(driver);
	        l.signinbutton();      
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
	       
	       ProductPage0 p=new  ProductPage0(driver);
	       p.selectedProduct();
	       
	       ProductDetailsPage0 pdp=new ProductDetailsPage0(driver);
	       pdp.productDetails();
	       pdp.addToCart();
	       
	       ViewBagPage0 v= new  ViewBagPage0(driver);
	       Thread.sleep(3000);
	       v.viewBag();
	        }
	       
	} 



