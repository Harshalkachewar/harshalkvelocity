package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.basetest;

public class loginpage extends basetest {

	//all the locator of page
	@FindBy(xpath="//*[@name='username']")
	WebElement username; 
	
	@FindBy(xpath="//*[@name='password']")
	WebElement password; 
	
	@FindBy(xpath="//*[text()=' Login ']")
	WebElement  btnLogin ; 
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement  txtLogin ; 
	
	
	//initialize of locater/var
	public loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);		
		
	}
	//test steps
	
	public void loginmethod() {
		 username.sendKeys("Admin");
		 password.sendKeys("admin123");
		 btnLogin.click();
	}
		 
		 public String titleloginpage() {
			 return txtLogin.getText();
			 
		 }
		 public String currenturl() {
			 
			 return driver.getCurrentUrl();
			 
		 }
	
}
