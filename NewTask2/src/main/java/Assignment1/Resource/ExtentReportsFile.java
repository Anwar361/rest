package Assignment1.Resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsFile {
	
	public static ExtentReports getReportObject()
	{
		String path=System.getProperty("user.dir");
		ExtentSparkReporter reports=new ExtentSparkReporter(path);
		reports.config().setReportName("Web Automation");
		reports.config().setDocumentTitle("Test Result");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reports);
		extent.setSystemInfo("Tester", "Anwar Hussain");
		extent.createTest(path);
		return extent;
	}

	

}
