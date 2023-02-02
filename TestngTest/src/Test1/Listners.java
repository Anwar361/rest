package Test1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("hi i got success   "+result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("hi i got fail");
	}
}
