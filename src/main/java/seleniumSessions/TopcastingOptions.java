package seleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopcastingOptions {

	public static void main(String[] args) 
	{
		// 1 : browser specific: cannot be used for browser specific 
		// ChromeDriver driver= new ChromeDriver();
		//FirefoxDriver driver= new FirefoxDriver()
		
		// 2. WD= new CD () -- valid top casting --> recommended local Execution 
		//  WebDriver driver= new ChromeDriver();
		
		// 3. SC = new CD ()   --- valid but not recommended 
		//    SearchContext driver= new ChromeDriver();
		
		// 4. RWD= new CD ()  ---valid top casting recommended --> local
		//      RemoteWebDriver driver= new ChromeDriver();
		
		// 5. WD= new Remote WebDriver();----valid top casting -- recommended ---> Grid --use for remote execution
		// WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		// 6. SC= new RWD();-----> valid but not recommended 
		 //    SearchContext driver= new RemoteWebDriver(remoteAddress, capabilities);
		
		   WebDriver driver= new ChromeDriver();
				   
	 }		   
		
		
		

	}


