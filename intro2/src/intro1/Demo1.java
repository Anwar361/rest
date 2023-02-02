package intro1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import intro2.Demo2;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="C:\\Users\\anand\\jar\\drive\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", url);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Demo2 test=new Demo2(driver);
		test.username().sendKeys("Anwar");

		test.password().sendKeys("annu@123");
		
		test.signin().click();
		

	}

}
