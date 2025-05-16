package MustKnowConcepts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener1 implements ITestListener 
{
	// executes only once before all the Tests get started
	public void onStart(ITestContext context) {
	    System.out.println("On Start");
	  }
	
	//executes before starting every Test method
	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Failure");
	  }
	
	public void onTestSkipped(ITestResult result) {
	    System.out.println("On Test Skipped");
	  }
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Failed with Success %");
	  }
	
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }
	
	// executes only once after all Tests complete
	public void onFinish(ITestContext context) {
		System.out.println("On Finish");
	  }

}
