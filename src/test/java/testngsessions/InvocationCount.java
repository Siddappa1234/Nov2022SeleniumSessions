package testngsessions;

import org.testng.annotations.Test;

public class InvocationCount 
{
   @Test(invocationCount=5)
   public void createuserTest()
   {
	   System.out.println("createUser");
   }
}
