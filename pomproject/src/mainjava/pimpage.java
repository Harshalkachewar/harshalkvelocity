package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.basetest;

public class pimpage extends basetest {
	@FindBy(xpath="//h6[text()='PIM']")
	WebElement txtpage;
	
	
	public pimpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public String titlepage() {
		return txtpage.getText();
		
	}
private void Syso() {
         

}
		

}
	


