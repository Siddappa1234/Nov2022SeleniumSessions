package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// Dropdowndown--->html tag---> Select---->
		// Use select class in Selenium

		// WebElement country_ele = driver.findElement(country);

		// Select select = new Select(country_ele);
		// select.selectByIndex(5);
		// select.selectByValue("Belgium");// Value attribute
		// select.selectByVisibleText("India");// text of the option

		By country = By.id("Form_getForm_Country");

		// doSelectDropDownByindex(country, 5);
		Thread.sleep(2000);
		// doSelectDropDownByValue(country, "Belgium");
		Thread.sleep(2000);
		doSelectDropDownByVisibleText(country, "Japan");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	private static void doSelectDropDownByindex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	private static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}

	private static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);

	}

}
