package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BasePage;

public class LoginPage extends BasePage{
	@FindBy (id="signin-model-wishlist")
	private WebElement signbtn;
	
	@FindBy (id ="login-email")
	private WebElement emailaddresstb;
	
	@FindBy (id ="login-pwd")
	private WebElement passtb;
	
	@FindBy (id ="btn-login")
	private WebElement login;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void signinbutton()
	{
		signbtn.click();
	}
	public void emailtb(String us)
	{
		emailaddresstb.sendKeys(us);
	}
	public void passwordtb(String pwd)
	{
		passtb.sendKeys(pwd);
	}
	public void loginbtn()
	{
		login.click();
	}
	
	
	

}
