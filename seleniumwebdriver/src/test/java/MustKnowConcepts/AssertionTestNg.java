package MustKnowConcepts;

import org.testng.annotations.*;
import org.testng.asserts.*;


public class AssertionTestNg
{
	
	@Test
	public void sampleAssertEq()
	{
		String str1 = "Validation";
		String str2 = "Verification";
			
		//Assert.assertEquals(str1, str2);	
		//Assert.assertNotEquals(str1,str2);
		//Assert.assertTrue(true);
		//Assert.assertTrue(1==2);
		//Assert.assertFalse(1==2);
		
		SoftAssert sftassert = new SoftAssert();	// Should create obj for SoftAssert class to use this
		sftassert.assertEquals(str1, str2);
		
		System.out.println("Soft assertion failed but executed next line");
		
		sftassert.assertAll();       // For soft assertion to work this method is mandatory
	}
	
	
	
	

}
