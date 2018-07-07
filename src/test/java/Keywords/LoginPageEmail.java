package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import gmail.gmail.com.Base;

public class LoginPageEmail extends Base {
	public LoginPageEmail(WebDriver driver) {
		this.driver = driver;
	}
	By email = By.xpath("//input[@type = 'email']");
	By clickwww = By.xpath("//div[@id='identifierNext']");
	public void getEMail(String emailid) {
		WebDriverWait wait = new WebDriverWait(driver ,30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(email)));
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(clickwww).click();
		driver.findElement(email).clear();
	}
	public String URL() {
		return driver.getCurrentUrl();
	}
	


}
