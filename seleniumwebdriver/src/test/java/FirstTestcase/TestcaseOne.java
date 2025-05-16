package FirstTestcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

/*
 1. Launch application
 2. Login
 3. Logout  
 */


public class TestcaseOne 
{
	@Test(priority=1)
	void launchapp() 
	{
		System.out.println("Launch");		
	}
	
	@Test(priority=2)
	void login()
	{
		System.out.println("Login");
	}
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logout");
	}
	
	
}
