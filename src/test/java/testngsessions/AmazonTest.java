package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest
{
//     WebDriver driver;
//     
//     @BeforeTest
//     public void setup()
//     {
//    	 driver= new ChromeDriver();
//    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    	 driver.manage().deleteAllCookies();
//    	 driver.manage().window().maximize();
//    	 driver.get("https://www.amazon.com/");
//     }
     
     //Not valid Format
//     public class AmazonTest extends BaseTest ()
//     {
//    	 System.out.println("Checking title----");
//    	 String title=driver.getTitle();
//    	 System.out.println("Page title:"+title);
//    	 Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
//    	 System.out.println("checking Search-----");
//    	 
//    	 boolean flag= driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
//    	 Assert.assertTrue(flag);
//    	 
//    	 System.out.println("Checking help----");
//    	 boolean flag1=driver.findElement(By.linkText("Help")).isDisplayed();
//    	 Assert.assertTrue(flag1);
//     } 
    	 //TCS Should be independent
    	 @Test
    	 public void titleTest()
    	 {
    		 String title=driver.getTitle();
    		 System.out.println("Page title :"+title);
    		 Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
    		 
    	 }
    	 @Test
    	 public void SearchExistTest()
    	 {
    		 boolean flag= driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
    		 Assert.assertTrue(flag);
    	 }
    	 @Test
    	 public void isHelpExistTest()
    	 {
    		 boolean flag= driver.findElement(By.linkText("Help")).isDisplayed();
    		 Assert.assertTrue(flag);
    	 }
    	 @AfterTest
    	 public void teardown()
    	 {
    		 driver.quit();
    	 }
     }

