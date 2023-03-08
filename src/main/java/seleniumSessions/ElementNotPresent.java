package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotPresent {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	By logoImg=	By.className("img-responsive");
	By Search=By.name("Search");
	
//	WE+ Action
	boolean flagImg=driver.findElement(logoImg).isDisplayed();
	// FE- throw NoSuch ElementException
	System.out.println(flagImg);
		

	}

}
