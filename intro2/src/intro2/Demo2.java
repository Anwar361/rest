package intro2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {
	;
	WebDriver driver;

	public Demo2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.cssSelector("#login1");
	By password=By.cssSelector("#password");
	By signin=By.name("proceed");
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	
	public WebElement username()
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(username));
		return driver.findElement(username);
	}
	public WebElement password()
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(password));
		return driver.findElement(password);
	}
	public WebElement signin()
	{
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(signin));
		return driver.findElement(signin);
	}
	

}
