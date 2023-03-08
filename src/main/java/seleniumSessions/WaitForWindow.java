package seleniumSessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {

	public static void main(String[] args)
	{
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		By twitter = By.xpath("//a[contains[@href,'twitter']");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.clickwhenReady(10, twitter);
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//
//		Set<String> handles = driver.getWindowHandles();
//		Iterator<String> it = handles.iterator();
//
//		String parnetWindowId = it.next();
//
//		System.out.println("Parnet WindowID:" + parnetWindowId);
//
//		String ChildWindowId = it.next();
//
//		System.out.println("Child Window Id:" + ChildWindowId);
//
//		// switching to window
//		driver.switchTo().window(ChildWindowId);
//
//		System.out.println("Child window Url:" + driver.getCurrentUrl());
//
//		driver.close();// close the child window

//		driver.switchTo().window(parnetWindowId);
//
//		System.out.println("parent Window url:" + driver.getCurrentUrl());
//
//	}
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		By twitter = By.xpath("//a[contains(@href,'twitter')]");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickWhenReady(10, twitter);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();
		System.out.println("parent window id : " + parentWindowId);

		String childWindowId = it.next();
		System.out.println("child window id : " + childWindowId);

		// switching to window:
		driver.switchTo().window(childWindowId);
		System.out.println("child window url : " + driver.getCurrentUrl());

		driver.close();// close the child window

		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url : " + driver.getCurrentUrl());

	}

}
