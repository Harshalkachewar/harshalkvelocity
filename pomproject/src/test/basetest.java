package test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.loginpage;
import mainjava.pimpage;
public class basetest {
	public static WebDriver driver;
	protected loginpage loginpage;
	protected pimpage pimpage;
    
	@BeforeClass
	public void lauchbroweser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		driver.manage().timeouts().getImplicitWaitTimeout();
	}
	
	@BeforeClass
	public void pageobjects() {
	loginpage = new loginpage(driver);
	pimpage =new pimpage(driver);
		 
	}
	
	@AfterClass
	public void teardownEnviornment() {
		driver.close();
		
	}
	
	 
}
