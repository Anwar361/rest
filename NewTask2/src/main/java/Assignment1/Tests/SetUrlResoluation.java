package Assignment1.Tests;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import Assignment1.ReUse.ReUsableMethod;

public class SetUrlResoluation extends ReUsableMethod{
	WebDriver driver;
	
	public SetUrlResoluation(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setResolution(String resolutionValue)
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("resolution", resolutionValue);
//		ChromeOptions option= new ChromeOptions();
//		Map<String,Object> perf=new HashMap<String,Object>();
//		perf.put("Download.defaultDirectory", "");
//		option.setExperimentalOption("pref", perf);
	}
	
}
