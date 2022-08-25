package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class logintest extends basetest {
	
	@Test
	public void logintest() {
	   loginpage.loginmethod();
	   Assert.assertEquals(pimpage.titlepage(),"PIM");
	   pimpage.titlepage();
	}
	   
	   @Test(priority=0)
	   public void verifyloginpage() {
		   Assert.assertEquals(loginpage.titleloginpage()," Login ");
		   
	   }
	   
	   @Test(priority=-1)
	   public void verifyurlpage() {
		   Assert.assertEquals(loginpage.currenturl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   }
	}
	

