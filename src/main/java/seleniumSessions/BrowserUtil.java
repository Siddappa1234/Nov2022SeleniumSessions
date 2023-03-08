package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	private WebDriver driver;

	/**
	 * 
	 * @param browserName
	 * @return
	 */
	public WebDriver initDriver(String browserName)
    {
    	System.out.println("browsername is :"+browserName);
    	switch(browserName.toLowerCase().trim())
    	{
    	case "chrome":
    	driver= new ChromeDriver();
    	break;
    	
    	case "Firefox":
        	driver= new FirefoxDriver();
        	break;
        	
    	case "Safari":
        	driver= new SafariDriver();
        	break;	
        	
    	case "Edge":
        	driver= new EdgeDriver();
        	break;	
        	
    	default:
    	
    	 System.out.println("Please pass the right browser--+BrowserName");
    	break;
    	}
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    	return driver;
    }

	// https:// www.amazon.com
	public void launchUrl(String Url)
	{
	if(Url== null)
	{
		System.out.println("Url cannot be null");
	}
	if(Url.indexOf("https")==0)
	{
		driver.get(Url);
	}
	
}
	public String getPageTitle()
	{
		String title= driver.getTitle();
		System.out.println("Page title :"+title);
		return title;
	}
	public String  getPageUrl()
	{
		String url= driver.getCurrentUrl();
		System.out.println("Page current url:"+url);
		return url;
	}
	public void closeBrowser()
	{
		if(driver !=null)
		{
			driver.close();
		}
	}
	public void quitBrowser()
	{
		if(driver != null)
		{
			driver.quit();
		}
	}
}
