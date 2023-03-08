package testngsessions;

import org.testng.annotations.Test;

public class CRUDOperationTest 
{
  public void Createuser()
  {
	  System.out.println("create user");
  }
  public void getUser(int UserId)
  {
	  System.out.println("getUser:"+ UserId);
  }
  public void updateUser(int UserId)
  {
	  
  }
  public void deleteUser(int UserId)
  {
	 
  }
  @Test()
  public void createUserTest()
  {
	  Createuser();
  }
  public void getUserTest()
  {
	  Createuser();// post--123
	  getUser(123);// get
  }
  @Test()
  public void updateUserTest()
  {
	  Createuser();//post--123
	  getUser(123);// get
	  updateUser(123);// put
	  getUser(123);// get
  }
  @Test()
  public void deleteUserTest()
  {
	  Createuser();// post
	  getUser(123);//get
	  updateUser(123);// delete
	  getUser(123); //get
  }
  @Test()
  public void getUserTesting()
  {
	  int userId=123;// hard coded userid
	  getUser(userId);
  }
}
