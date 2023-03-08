package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVSClose {

	public static void main(String[] args)
	{
		// SID-- Selenium session ID
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");//123
		String Title=driver.getTitle();// 123
		System.out.println(Title);// 123
		
		System.out.println(driver.getCurrentUrl());//123
		driver.quit();//123
		
		// SID== null
		// No SuchSessionException:invalid session id
		// SID== 123--- invalid
		
		 driver= new ChromeDriver();// SID==456
		 driver.get("https://www.google.com");//456
		 System.out.println(driver.getTitle());// null
		 // NoSuchsession Exception:session ID is null using WebDriver after calling quit()

	}

}
