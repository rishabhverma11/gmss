package Keywords;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import gmail.gmail.com.Base;

public class OpenchromeAndWebpage extends Base {
	
	public OpenchromeAndWebpage(WebDriver driver) {
		this.driver = driver;
	}
	public void OpenBrowser() {
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		String titlepage = driver.getTitle();
		Assert.assertEquals("Gmail", titlepage);
	}

}
