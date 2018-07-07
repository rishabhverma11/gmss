package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import gmail.gmail.com.Base;

public class LoginPagePaww extends Base {
	public LoginPagePaww(WebDriver driver) {
		this.driver = driver;
	}
	By user_password = By.xpath("//input[@type='password']");
	By clickkkkk =  By.xpath("//div[@id='passwordNext']");
	public void getPass(String pa) {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(user_password)));
		driver.findElement(user_password).sendKeys(pa);
		driver.findElement(clickkkkk).click();
		driver.findElement(user_password).clear();
		
	}

}
