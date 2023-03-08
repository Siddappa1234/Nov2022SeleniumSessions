package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {
		String browserName = "Chrome";

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String title = brUtil.getPageTitle();
		System.out.println(title);

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastName");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmpassword = By.id("input-confirmpassword");

		ElementUtil eleUtil = new ElementUtil(driver);

		eleUtil.doSendKeys(firstName, "Samu");
		eleUtil.doSendKeys(lastName, "Singh");
		eleUtil.doSendKeys(email, "Amrit@gmail.com");
		eleUtil.doSendKeys(telephone, "9972343218");
		eleUtil.doSendKeys(password, "Amrita@123");
		eleUtil.doSendKeys(confirmpassword, "Amrit@123");
		
		
	}

}
