package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {

	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		// 8 locators 
		// id, name, className,Xapth, CSS selector,Linktext, PartialLink Text, tagname
		
		// create a WebElement+perform action(click, Sendkeys, getText,isDisplayed---)
		// Create a WebElement:need a locator 
		
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// 1. id:--> Unique 
		//driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		
	//	2.name: Cannot be duplicate
	//	driver.findElement(By.name("email")).sendKeys("test@gmail.com");
	//	By emailId= By.name("email");
		
		//3.  ClassName: Cannot be duplicate  most of the time not recommended if its duplicate
		//   Use Classname only if it is unique 
		
		//   driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
		
		//4. Xpath: its not an attribute , its the address of the element in HTML DOM
		
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
//		By emailId= By.xpath("//*[@id=\\\"input-email\\\"]");
//		By password= By.xpath("//*[@id=\\\"input-password\\\"]");
//		By loginBtn=By.xpath("//*[@id=\\\"content\\\"]/div/div[2]/div/form/input");
//		
//		doSendkeys(emailId,"naveen@gmail.com");
//		doSendkeys(password,"naveen@123");
//		doclick(loginBtn);
	  
		
		//5. CSS Selector : not an Attribute
		
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		
		// 6.LinkText: only for links--->htmltag= a LinkText can be duplicate
		// its not an duplicate-- its the text of the link
		
//		driver.findElement(By.linkText("Register")).click();
//		By registerlink=By.linkText("Register");
//		doclick(registerlink);
		
		// 7.PartialLinkText: only for Links
		// Forgotten password
		// Forgotten userId
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8: tagName: HTML Tag
		
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
      
		//getText: links, headers, paragraph, footer 
				By payment = By.linkText("Recurring payments");
				String val = doElementGetText(payment);
				System.out.println(val);
				
				//click: button, checkboxes, radiobutton, images, links
				//sendKeys: textbox/textfield, dropdown, fileupload
	}
	public static WebElement getElement(By locator) 
	{
		return driver.findElement(locator);
	}

	public static void doclick(By locator)
	{
		getElement(locator).click();
	}	
	private static void doSendkeys(By locator, String value) 
	{
		getElement(locator).sendKeys(value);
		
	}
    public static String doElementGetText(By locator)
    {
    	return getElement(locator).getText();
    }
	
	}

