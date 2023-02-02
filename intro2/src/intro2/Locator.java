package intro2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand\\jar\\drive\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		String username="Rahul";
		String password="annu@123";
		String email="anwar@gmail.com";
		String phon="9012692526";

		//print text
	
		Login1 log=new Login1(driver);
		log.pagename().getText();
		log.username().sendKeys(username);
		log.password().sendKeys(password);
		log.terms().click();
		log.signin().click();
		//print the error statment
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[normalize-space()='Forgot your password?']")));
		System.out.println(log.message().getText());
		driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']"));
		log.forgotpassword().click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h2[normalize-space()='Forgot password']")));
		driver.findElement(By.xpath("//h2[normalize-space()='Forgot password']"));
		//page2
		Password1 log1=new Password1(driver);
		System.out.println(log1.tite().getText());
		log1.name().sendKeys(username);
		log1.email().sendKeys(email);
		log1.phon().sendKeys(phon);
		log1.resetlogin().click();
				
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".infoMsg")));
		//store in a string array
		String[] set=driver.findElement(By.cssSelector(".infoMsg")).getText().split("'");
		password=set[1].split("'")[0];
		
		log1.goback().click();
		
		//page3
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#inputUsername")));
		driver.findElement(By.cssSelector("#inputUsername"));
		
		log.username().sendKeys(username);
		log.password().sendKeys(password);
		log.terms().click();
		log.signin().click();
		
		driver.close();
	}
	

}
