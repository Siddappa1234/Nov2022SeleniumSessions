package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJSAlertPopUp {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		Thread.sleep(2000);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();

	}

	public static Alert WaitForAlertpresence(int timeOut) {
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return Wait.until(ExpectedConditions.alertIsPresent());
	}

	public static String getAlert(int timeOut) {
		return WaitForAlertpresence(timeOut).getText();
	}

	public static void AcceptAlert(int timeOut) {
		WaitForAlertpresence(timeOut).accept();
	}

	public static void dismissAlert(int timeOut) {
		WaitForAlertpresence(timeOut).dismiss();
	}

	public static void AlertsendKeys(int timeOut, String Value) {
		WaitForAlertpresence(timeOut).sendKeys(Value);
	}

}
