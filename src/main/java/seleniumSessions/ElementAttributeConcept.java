package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		String Ph=driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		System.out.println(Ph);

//		String Srcval=driver.findElement(By.className("img-responsive")).getAttribute("Src");
//		String titleVal=driver.findElement(By.className("img-responsive")).getAttribute("title");

//		System.out.println(Srcval+" -->"+titleVal);

		By fn = By.name("firstname");
		By logo = By.className("img-responsive");

		String Ph = getElementAttribute(fn, "placeholder");
		String Srcval = getElementAttribute(logo, "Src");
		String titleVal = getElementAttribute(logo, "title");

		System.out.println(Ph);
		System.out.println(Srcval);
		System.out.println(titleVal);
	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static String getElementAttribute(By locator, String AttrName) {

		return getElement(locator).getAttribute(AttrName);
	}
}
