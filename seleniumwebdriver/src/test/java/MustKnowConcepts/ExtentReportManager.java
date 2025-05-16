package MustKnowConcepts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
	public ExtentSparkReporter exsparkReporter;		//UI of the Report
	public ExtentReports exReport ;		// 	populate common info on the report
	public ExtentTest exTest ;	//	create testcase entries in the report and update status of Test methods
	
	// executes only once before all the Tests get started
	public void onStart(ITestContext context) 
	{
		exsparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/ExtentReportsFolder/myExtentReport.html"); // specify location for report file
		exsparkReporter.config().setDocumentTitle("AutomationReport");
		exsparkReporter.config().setReportName("Functional Testing");
		exsparkReporter.config().setTheme(Theme.DARK);
		
		exReport = new ExtentReports();
		exReport.attachReporter(exsparkReporter);
		
		exReport.setSystemInfo("Computername", "localhost");
		exReport.setSystemInfo("Environment","QA");
		exReport.setSystemInfo("TesterName","Precilla");
		exReport.setSystemInfo("OS","Windows11");
		exReport.setSystemInfo("BrowserName","Chrome");
	}
		

	public void onTestSuccess(ITestResult result) 
	{
		exTest =  exReport.createTest(result.getName()); 	// create new entry in the report
		exTest.log(Status.PASS, "Testcase that got Passed is :- " + result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		exTest =  exReport.createTest(result.getName()); 	// create new entry in the report
		exTest.log(Status.FAIL, "Testcase that got FAILED is :- " + result.getName());
		exTest.log(Status.FAIL, "Cause of Failure :- " + result.getThrowable());
	  }
	
	public void onTestSkipped(ITestResult result) {
	    exTest =  exReport.createTest(result.getName()); 	// create new entry in the report
	    exTest.log(Status.SKIP, "Testcase that got Skipped is :- " + result.getName());
	}
	
	public void onFinish(ITestContext context) 
	{
		exReport.flush();
	}
	
}
