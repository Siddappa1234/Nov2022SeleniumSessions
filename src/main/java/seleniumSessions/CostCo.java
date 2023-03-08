package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CostCo {

	static WebDriver driver;
	// 2 Multilevel menu items
	
	public static void main(String[] args) 
	{
		driver= new ChromeDriver();
		driver.get("https://www.costco.com/");
		By shopByCat=By.id("navigation-dropdown");
		multiLevelMenuHandling(shopByCat, "Baby", "Baby Care & Safety", "Baby Monitors");
	}
		
		public static WebElement getElement(By locator)
		{
			return driver.findElement(locator);
		}
		public static void multiLevelmenHandling(By ParnetMenu,String l1,String l2,String l3)
		Actions act= new Actions(driver);
		act.moveToElement(getElement(ParnetMenu)).click().build().perform();
		WebElement l2Ele=driver.findElement(By.xpath("//a[text()='Baby']/parnet::/li"));
		Action action=act.moveToElement(l2Ele).moveToElement(l2Ele).build();
		action.perform();
		
		Action action1= act.moveToElement(driver.findElement(By.xpath("//a[text()='Baby Care  and Safety ']/parnet::/li"))).build();
		action1.perform();
		Thread.sleep(1500);
		driver.findElement(By.linkText(l3)).click();

	}

}
