package Assignment1.Tests;

import java.io.IOException;

import org.junit.Before;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Assignment1.TestComponent.BaseTest;

public class WrongCredentialTest extends BaseTest {
	
	public ForgotPasswordPage forgotpasswordofpage;
	
	@Test
	public void wrongCridential() throws IOException, InterruptedException
	{
		launchPage();
		loginpage.logIn(wrongEmailId);
		
		forgotpasswordofpage=loginpage.enterPassword(wrongPassword);
//		Thread.sleep(5000);
//		forgotpasswordofpage.getTitleOfPage();
//		forgotpasswordofpage.pageValidation();
//		terminateTest();
		
	}
	
	@Test(dependsOnMethods= {"wrongCridential"})
	public void check() throws InterruptedException
	{
		Thread.sleep(5000);
		forgotpasswordofpage.getTitleOfPage();
		forgotpasswordofpage.pageValidation();
		terminateTest();
	}
}
