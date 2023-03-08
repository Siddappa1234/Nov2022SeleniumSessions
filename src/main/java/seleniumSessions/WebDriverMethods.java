package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https:Amazon.com");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("Amazon.com"))
		{
			System.out.println("PASS");
		}
		
		String PgSrc= driver.getPageSource();
		System.out.println();
		if(PgSrc.contains("Navyan Footer end"))
		{
			System.out.println("PASS");
		}
			driver.quit();	
				

	}

}
