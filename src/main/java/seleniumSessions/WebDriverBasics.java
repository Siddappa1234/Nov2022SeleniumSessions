package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) 
	{
		
		
		//1. Open the browser : chrome, FF
		//ChromeDriver driver= new ChromeDriver();
		
		String browser="Edge";
		WebDriver driver= null;
		
		// cross browser logic
		if(browser.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(browser.equals("Safari"))
		{
			driver= new SafariDriver();
		}
		else if(browser.equals("Edge"))
		{
			driver= new EdgeDriver();
		}
		else
		{
			System.out.println("Please pass the right browser--+ browser");
		}
		
		// 2.Enter the url
		driver.get("https://www.google.com");
		
		// 3.get the title
		String actTitle= driver.getTitle();
		System.out.println("page title:"+actTitle);
		
		// 4.Validation point/checkpoint
		if(actTitle.equals("google"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.quit();

	}

}
