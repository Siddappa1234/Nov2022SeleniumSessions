package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrameElement {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");

		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//		Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));

		WaitForFrameAndSwitchToItByFrameElement(10, driver.findElement(By.xpath("//frame[@src='top.html']")));

		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);

	}

	public static void WaitForFrameAndSwitchToITByIDOrName(int timeOut, String idOrName) {
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}

	public static void WaitForFrameAndSwitchToITByIDORName(int timeOut, int frameindex) {
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameindex));
	}

	public static void WaitForFrameAndSwitchToItByFrameElement(int timeOut, WebElement frameElement) {
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}

	public static void WaitForFrameAndSwitchToITByframelocator(int timeOut, By framelocator) {
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
	}
}
