package MustKnowConcepts;

import org.testng.Assert;
import org.testng.annotations.*;

//@Listeners(MustKnowConcepts.MyListener1.class)
public class DependencyMethodsTestNg 
{
	@Test(groups = {"sanity"})
	void openapp()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(priority = 2, dependsOnMethods = {"openapp"}, groups = {"sanity"} )
	void login()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(priority = 3, dependsOnMethods = {"login"}, groups = {"functionalTests","sanity"} )
	void simpleSearch()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(priority = 4, dependsOnMethods = {"login","simpleSearch"}, groups = {"functionalTests"} )
	void advancedSearch()
	{
		Assert.assertTrue(true);		
	}
		
	
	@Test(priority = 5, dependsOnMethods = {"login"},groups = {"sanity"} )
	void logout()
	{
		Assert.assertTrue(true);
	}

}
