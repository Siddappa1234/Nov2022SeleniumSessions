package testngsessions;

import org.testng.annotations.Test;

public class TestDependency 
{
 @Test
 public void SearchTest()
 {
	 System.out.println("Search Test");
	// int i=9/0;
 }
 @Test(dependsOnMethods="SearchTest")
 public void AddToCart()
 {
	 System.out.println("Add ToCart");
	 int i=9/0;
 }
 @Test(dependsOnMethods="AddToCart")
 public void Makepayment()
 {
	 System.out.println("Make Payment");
 }
}
