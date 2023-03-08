package testngsessions;

import org.testng.annotations.Test;

public class ExpectedConditionsConcept 
{
  @Test(expectedExceptions=ArithmeticException.class)
  public void LoginTest()
  {
	  System.out.println("Login Test");
	  int i=9/0;
  }
}
