package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import gmail.gmail.com.Base;

public class Inbox extends Base {
	public Inbox(WebDriver driver) {
		this.driver=driver;
	}
	 
	 By clickoncompose=By.xpath("//*[@id=\":ir\"]/div/div");
	By To = By.className("wO nr l1");
	By Sub = By.id(":fw");
	By body = By.id(":h0");
	By send = By.id(":fl");
	
	
	public void composemail(String to , String sub, String text) {
		WebDriverWait wait = new WebDriverWait(driver , 150);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(clickoncompose)));
//		
//		String title = driver.getTitle();
//		Assert.assertEquals(title, "Inbox (13,085) - vermarishabh2011@gmail.com - Gmail");
		driver.findElement(clickoncompose).click();
		driver.findElement(To).sendKeys(to);
		driver.findElement(Sub).sendKeys(sub);
		driver.findElement(body).sendKeys(text);
		driver.findElement(send).click();
		
	}

}
