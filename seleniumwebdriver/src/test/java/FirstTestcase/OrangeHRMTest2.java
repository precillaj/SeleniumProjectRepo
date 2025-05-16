package FirstTestcase;

import org.testng.annotations.*;

public class OrangeHRMTest2 
{
	
	//--------------------------SUITE Level -----------------------------------------------------------------------------------//
	
	@BeforeSuite 	// -> gets executed onetime before every <suite name='Suite1'>
	void bs()
	{
		System.out.println("Before Suite");
	}	
	
	@AfterSuite	// -> gets executed onetime after completing every <suite name='Suite1'>
	void as()
	{
		System.out.println("After Suite");
	}
	
	//---------------------------TEST Level----------------------------------------------------------------------------------//
	
	@BeforeTest 	// -> gets executed onetime before every <test name='Test1'>
	void bt()
	{
		System.out.println("Before Test");
	}	
	
	@AfterTest	// -> gets executed onetime after completing every <test name='Test1'>
	void at()
	{
		System.out.println("After Test");
	}
	
	
	//---------------------------CLASS Level----------------------------------------------------------------------------------//
	
	@BeforeClass 	// -> gets executed onetime before every single <class name="FirstTestcase.TestcaseOne"/>, <class name="FirstTestcase.TestcaseTwo"/>...
	void bc()
	{
		System.out.println("Before Class");
	}	
	
	@AfterClass	// -> gets executed onetime after completing every single <class name="FirstTestcase.TestcaseOne"/>, <class name="FirstTestcase.TestcaseTwo"/>...
	void ac()
	{
		System.out.println("After Class");
	}
		
	
	//---------------------------METHOD Level----------------------------------------------------------------------------------//
	
	@BeforeMethod 	// -> gets executed onetime before every @Test annotation
	void bm()
	{
		System.out.println("Before Method");
	}	
	
	@AfterMethod	// -> gets executed onetime after completing every @Test annotation test execution
	void am()
	{
		System.out.println("After Method");
	}
	
	
	//-------------------------------------------------------------------------------------------------------------//
	
	@Test(priority=1)	
	void simpleSearch()
	{
		System.out.println("Simple Search");
	}
	
	@Test(priority=2)	
	void advSearch()
	{
		System.out.println("Advanced Search");
	}
	
	
	
	
	

}
