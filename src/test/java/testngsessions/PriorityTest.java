package testngsessions;

import org.testng.annotations.Test;

public class PriorityTest 
{
  @Test()
  public void A_test()
  {
	  System.out.println("A Test");
  }
  @Test()
  public void B_test()
  {
	  System.out.println(" B Test");
  }
  @Test()
  public void C_test()
  {
	  System.out.println("C Test");
  }
  @Test(priority=2)
  public void D_test()
  {
	  System.out.println(" D Test");
  }
  @Test(priority=1)
  public void E_test()
  {
	  System.out.println(" E Test");
  }
}
