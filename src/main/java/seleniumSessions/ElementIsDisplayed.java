package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logoImage = By.className("img-responsive");
		By Search = By.name("Search");
		By SearchIcon = By.cssSelector("#search > span > button");

		if(doElementIsDispalyed(logoImage))
			{
				System.out.println("Image is present -- PASS");
			}

			if(doElementIsDispalyed(Search)) {
				System.out.println("Search is present");
				doSendKeys(Search, "macbook");
				doclick(SearchIcon);
			}
	}
	        public static WebElement getElement(By locator)
	        {
		    return driver.findElement(locator);
	         }

		public  static boolean doElementIsDispalyed(By locator) {

			return getElement(locator).isDisplayed();
		}

		public static void doSendKeys(By locator, String value) {
			getElement(locator).sendKeys(value);

		}

		public static void doclick(By locator) {
			getElement(locator).click();
		}
}

