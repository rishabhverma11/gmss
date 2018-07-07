package Keywords;

import org.openqa.selenium.WebDriver;

import gmail.gmail.com.Base;

public class CloseBrowser extends Base {
	public CloseBrowser(WebDriver driver) {
		this.driver = driver;
	}
	public void action() {
		driver.close();
	}
	
}
