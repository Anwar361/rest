package Assignment1.TestComponent;

import java.io.IOException;
import java.io.ObjectInputFilter.Status;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import Assignment1.Resource.ExtentReportsFile;

public class Listeners extends BaseTest implements ITestListener {
	ExtentTest test;
	ExtentReports extent = ExtentReportsFile.getReportObject();
	
	@Override
	public void onTestStart(ITestResult result)
	{
		 test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Name of the test pass"+result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		test.fail(result.getThrowable());
//		String filePath=null;
//		try {
//			filePath =getScreenshort(result.getMethod().getMethodName(),driver);
//		}
//		catch(IOException e)
//		{
//			e.printStackTrace();	
//		}
//		test.addScreenCaptureFromPath(filePath);
		System.out.println("Name of the test Fail"+result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
//		extent.flush();
		System.out.println("Name of the test skip"+result.getName());
	}
	
}
