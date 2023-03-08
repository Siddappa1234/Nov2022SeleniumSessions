package seleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) 
	{
		// WebDriver Wait----->Fluent Wait----->Wait 
		
		driver= new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By freetrial=By.cssSelector("a[title='Free Trial']");
		
//		Wait<WebDriver>Wait= new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//		        .ignoring(NoSuchElementException.class)
//		        .ignoring(StaleElementReferenceException.class)
//		        .pollingEvery(Duration.ofSeconds(2))
//		        .withMessage("---element is not found on the page---");
		        
//		 WebElement freetrialEle=Wait.until(ExpectedConditions.presenceOfElementLocated(freetrial));
//		 freetrialEle.click();
		 WaitForElementpresencewithFluentWait(10,2,freetrial).click();
	}

	public static WebElement WaitForElementpresencewithFluentWait(int timeOut,int pollingTime,By locator)
	{
		Wait<WebDriver>Wait= new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(10))
                 .ignoring(NoSuchElementException.class)
                 .ignoring(StaleElementReferenceException.class)
                 .pollingEvery(Duration.ofSeconds(2))
                 .withMessage("---element is not found on the page---");
                 
                 return Wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
	}

	public static void  WaitForAlertwithFluentWait(int timeOut, int pollingtime) 
	{
		Wait<WebDriver>Wait= new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("---Alert is not found on the page---");
                
                 Wait.until(ExpectedConditions.alertIsPresent());
               		 
	}

}
