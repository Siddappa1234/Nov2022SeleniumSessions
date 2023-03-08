package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {
	public WebDriver driver;

	public boolean doLogin(String UserName, String Password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(UserName);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		String errormesg = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errormesg);
		if (errormesg.contains("No match for E-Mail Address and/or Password")) {
			return true;
		}
		return false;

	}

	@DataProvider
   public Object[][]getLoginNegativeData()
   {
	   return new Object[][]
    {
	{"abccc@gmail.com","test@123"},
	{"abct123@gmail.com","testttt@123"},
	{"abccc","testtttt@123"},
	{"testyyy@gmail.com","testttt"},
	{"#@#@#@#@@gmail.com","Samu"},
	  
       };
   }
	   @Test(dataProvider="getLoginNegativeData")
	   public void LoginTest(String userName,String password)
	   {
		   boolean flag= doLogin(userName,password);
		   Assert.assertTrue(flag);
	   }
	   @DataProvider
	   public Object[][] getRegTestData()
	   {
		   return new Object[][]
	   {
	   {"Samu","varsha","Darshan@gmail.com","9632908131","Samu@123"},
	   {"Samu1","varsha1","Darshan1@gmail.com","9632908133","Samu1@123"},
	   {"Samu2","varsha2","Darshan2@gmail.com","9632908134","Samu2@123"}
			   
	   
			   
	   };
	   }
	@Test(dataProvider = "getRegTestData", priority = 2)
	public void registerTest(String fn, String in, String email, String phone, String Password) {
		System.out.println(fn + in + email + phone + Password);
	}

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@AfterTest
	public void tearDown() {
		// driver.quit()
	}

}
