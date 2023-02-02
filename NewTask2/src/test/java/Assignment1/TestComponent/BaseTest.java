package Assignment1.TestComponent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import Assignment1.Tests.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public String emailId;
	public String password;
	public String resolutionValue;
	public LoginPage loginpage;
	public String wrongEmailId;  //=anwar3617@gmail.com
	public String wrongPassword;   //=Annu@1223
	public String newresolutionValue;
	
	
	public WebDriver data() throws IOException
	{
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Assignment1\\Resource\\GlobalData.properties");
		prop.load(fis);
		String brouserName=prop.getProperty("brouser");
		emailId=prop.getProperty("emailId");
		password=prop.getProperty("password");
		resolutionValue=prop.getProperty("resolutionValue");
		wrongEmailId=prop.getProperty("wrongEmailId");   //=anwar3617@gmail.com
		wrongPassword=prop.getProperty("wrongPassword");   //=Annu@1223
		newresolutionValue=prop.getProperty("newresolutionValue");
		
	//	prop.setProperty(resolutionValue, newresolutionValue);
		System.out.println(emailId+"******"+password);
		
		if(brouserName.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(brouserName.equalsIgnoreCase("FireFox"))
		{
			
		}
		else if(brouserName.equalsIgnoreCase("edge"))
		{
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	

	public LoginPage launchPage() throws IOException
	{
		driver = data();
		loginpage=new LoginPage(driver);
		loginpage.goToPage();
		return loginpage;
	}
	
//	public List<HashMap<String,String>> getJsonData() throws IOException
//	{
//		String jsonFile=FileUtils.readFileToString(new File(System.getProperty("user.dir")+"\\src\\main\\java\\Assignment1\\Resource\\newData.json"),
//				StandardCharsets.UTF_8);
//		ObjectMapper mapper=new ObjectMapper();
//		List<HashMap<String,String>> data= mapper.readValue(jsonFile, new TypeReference<List<HashMap<String, String>>>(){
//		});
//		return data; 
//	}
	
	public String getScreenshort(String string, WebDriver driver2) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File  source=ts.getScreenshotAs(OutputType.FILE);
		File target= new File(System.getProperty("user.dir")+"\\reports.png");
		FileUtils.copyFile(source, target);
		return string;
		
	}
	
	public void terminateTest()
	{
		driver.close();
	}

}
