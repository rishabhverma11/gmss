package Keywords;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import gmail.gmail.com.Base;

public class MyTest {
	WebDriver driver;
	OpenchromeAndWebpage objj;
	LoginPageEmail login;
	LoginPagePaww pass;
	CloseBrowser exit;
	Inbox in ; 
	@BeforeClass
	public void callBase() {
		Base obj = new Base();
		
		driver = obj.getDriver();
		OpenchromeAndWebpage objj = new OpenchromeAndWebpage(driver);
		objj.OpenBrowser();
		login = new LoginPageEmail(driver);
		pass = new LoginPagePaww(driver);
		exit = new CloseBrowser(driver);
		in = new Inbox(driver);
	}
	@Test(priority = 1)
	public void Wrongemail() {
		login.getEMail("wedrrajji");
		Assert.assertTrue(login.URL().contains("/signin/v2/identifier?"));
	}
//	@Test(priority = 2)
//	public void Blankemail() {
//		login.getEMail(" ");
//		Assert.assertTrue(login.URL().contains("/signin/v2/identifier?"));
//	}
	@Test(priority = 3)
	public void correctemail() {
		login.getEMail("vermarishabh2011@gmail.com");
		Assert.assertTrue(login.URL().contains("/signin/v2/identifier?"));
	}
	@Test(priority = 4)
	public void wrongpass() {
		pass.getPass("wewdawevs");
		Assert.assertTrue(login.URL().contains("/signin/v2/sl/pwd?"));			
	}	
//	@Test(priority = 5)
//	public void BlankPass() {
//		pass.getPass("      ");
//		Assert.assertTrue(login.URL().contains("/signin/v2/sl/pwd?"));
//	}
	@Test(priority = 6)
	public void CorrectPass() {
		pass.getPass("");
		Assert.assertTrue(login.URL().contains("/signin/v2/sl/pwd?"));
	}
	@Test(priority = 7)
	public void writeemail() {
		in.composemail("vibhavsingh9415@gmail,com", "Testing se aaya hai ye msg", "Bidi kam piya kro bc");
	}
	public void close() {
		exit.action();
	}


	

}
