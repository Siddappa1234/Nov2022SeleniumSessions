package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailID = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");

//		WebDriverWait Wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement email_ele= Wait.until(ExpectedConditions.presenceOfElementLocated(emailID));
//		email_ele.sendKeys("test@gmail.com");

		waitForElementPresence(emailID, 10).sendKeys("test@gmail.com");
		getElement(password).sendKeys("test@123");
		getElement(loginBtn).click();

	}

	private static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	private static WebElement WaitForElementVisible(By locator, int timeOut) {
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return Wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
