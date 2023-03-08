package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestWithBM 
{  
//	WebDriver driver;
//    
//    @BeforeTest
//    public void setup()
//    {
//   	 driver= new ChromeDriver();
//   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//   	 driver.manage().deleteAllCookies();
//   	 driver.manage().window().maximize();
//   	 driver.get("https://www.amazon.com/");
//    }
//   // TCS Should be indepenedent
//    // AAA Rule
//    // AAA stands -- Arrange, Act, Assert
//    // TC--->1 Assert
//    
//    @Test(priority=1)
//    public void titleTest()
//    {
//    	String title=driver.getTitle();
//    	System.out.println("Page title:"+title);
//    	Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
//    }
//    @Test(priority=2)
//    public void SearchExisttTest()
//    {
//    	boolean flag= driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
//    	Assert.assertTrue(flag);
//    }
//    @Test(priority=3)
//    public void isHelpExisttTest()
//    {
//    	boolean flag= driver.findElement(By.linkText("Help")).isDisplayed();
//    	Assert.assertTrue(flag);
//    }
//    @AfterMethod
//    public void tearDown()
//    {
//    	driver.quit();
//    }
	
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	}

	// tcs should be independent
	//AAA Rule
	//AAA stands for: Arrange, Act, Assert
	//1 tc --> 1 assert
	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title:" + title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}

	@Test(priority = 2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void isHelpExistTest() {
		boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
