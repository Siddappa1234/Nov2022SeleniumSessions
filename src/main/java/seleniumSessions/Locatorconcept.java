package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorconcept {

	static WebDriver driver;

	public static void main(String[] args) {
		// create a WebElement+perform action(click,Sendkeys,getText,isDisplayed--)
		// create a WebElement :need a locator

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1 .id
		// 1 st

		// driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("naveen@123");

		// 2.nd

//		WebElement emailID=driver.findElement(By.id("input-email"));
//		WebElement password=driver.findElement(By.id("input-password"));
//		
//		emailID.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@123");

		// 3rd By Locator
//		By emailId=By.id("input-email");
//		By password=By.id("input-password");
//		
//		WebElement eld= driver.findElement(emailId);
//		WebElement pwd=driver.findElement(password);
//		
//		eld.sendKeys("naveen@gmail.com");
//		pwd.sendKeys("naveen@123");

		// 4th. By locator+generic method for WebElement
//		By emailId=By.id("input-email");
//		By password=By.id("input-password");
//		
//		getElement(emailId).sendKeys("naveen@gmail.com");
//		getElement(password).sendKeys("naveen@123");
//		
		// 5. By locator +generic methods for WebElement and Actions

//		By emailId=By.id("input-email");
//		By password=By.id("input-password");
//		
//		dosendKeys(emailId,"naveen@gmail.com");
//		dosendKeys(password,"naveen@123");

		// 6.th By locator +generic methods for webElement and actions in a Element Util
		// class
		By emailId = By.id("input-email");
		By password = By.id("input-password");

		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendKeys(emailId, "naveen@gmail.com");
		eleutil.doSendKeys(password, "naveen@123");

	}

	private static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	private static void dosendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

}
