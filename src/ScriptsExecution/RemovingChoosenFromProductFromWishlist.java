package ScriptsExecution;

import org.testng.annotations.Test;

import genericlibraries.BaseTest;
import genericlibraries.Excel;
import pom.HomePage;
import pom.LoginPage;
import pom.ProductDetailsPage1;
import pom.ProductPage1;
import pom.Remove;
import pom.ViewBagPage1;

public class RemovingChoosenFromProductFromWishlist extends BaseTest{
	 @Test
	    public  void addtocartandremove() throws InterruptedException {
     
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
     
     ProductPage1 p=new  ProductPage1(driver);
     p.selectedProduct();
     
     ProductDetailsPage1 pdp=new ProductDetailsPage1(driver);
     pdp.productDetails();
     pdp.addToCart();
     
     ViewBagPage1 v= new  ViewBagPage1(driver);
     Thread.sleep(3000);
     v.viewBag();
     
     Remove r= new Remove(driver);
     r.removeButton();
	 }

}
