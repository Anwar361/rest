package Assignment1.Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Assignment1.TestComponent.BaseTest;

public class SetNewResoluationTest extends BaseTest {
	
	public ForgotPasswordPage forgotpasswordofpage;
	public SetUrlResoluation setresoluation;	
	
	@Test
	public void setNewResoluation() throws IOException, InterruptedException
	{
		launchPage();
		loginpage.logIn(emailId);
		
		forgotpasswordofpage=loginpage.enterPassword(password);
		Thread.sleep(7000);
		forgotpasswordofpage.getTitleOfPage();
		setresoluation=forgotpasswordofpage.pageValidation();
		setresoluation.setResolution(newresolutionValue);
		
		terminateTest();
	}

}
