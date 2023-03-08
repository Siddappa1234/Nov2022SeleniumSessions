package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//BS---start DB connection
//BT---CreateUser
//BC---launchBrowser
//BM---loginToApp
//Home Page Search Test
//AM---logout
//BM---loginToApp
//Home Page Title Test
//AM---logout
//BM---loginToApp
//Home Page URL Test
//AM---logout
//AC---closeBrowser
//AT---deleteUser
//PASSED: HomePageSearchTest
//PASSED: HomePageTitle
//PASSED: HomePageURLTest
//AS---DisConnect with DB

public class HomePageTest
{
  @BeforeSuite
  public void startDBConnection()
  {
	  System.out.println("BS---start DB connection");
  }
  @BeforeTest
  public void CreateUser()
  {
	  System.out.println("BT---CreateUser");
  }
  @BeforeClass
  public void launchBrowser()
  {
	  System.out.println("BC---launchBrowser");
  }
  @BeforeMethod
  public void loginToApp()
  {
	  System.out.println("BM---loginToApp");
  }
  @Test
  public void HomePageTitle()
  {
	  System.out.println("Home Page Title Test");
  }
  @Test
  public void HomePageURLTest()
  {
	  System.out.println("Home Page URL Test");
  }
  @Test
  public void HomePageSearchTest()
  {
	  System.out.println("Home Page Search Test");
  }
  @AfterMethod
  public void logout()
  {
	  System.out.println("AM---logout");
  }
  @AfterClass
  public void closeBrowser()
  {
	  System.out.println("AC---closeBrowser");
  }
  @AfterTest
  public void deleteUser()
  {
	  System.out.println("AT---deleteUser");
  }
  @AfterSuite
  public void disConnectWithDB()
  {
	  System.out.println("AS---DisConnect with DB");
  }
}
