package intro2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login1 {

	WebDriver driver;
	public Login1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By pagename=By.xpath("//form/h1");
	By username=By.xpath("//input[contains(@id,'input')]");
	By password=By.cssSelector("input[name*='input']");
	By terms=By.xpath("//input[contains(@value,'agree')]");
	By signin=By.xpath("//button[normalize-space()='Sign In']");
	By message=By.cssSelector((".error"));
	By forgotpassword=By.xpath("//a[normalize-space()='Forgot your password?']");
	
	public WebElement pagename()
	{
		return driver.findElement(pagename);
	}
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement terms()
	{
		return driver.findElement(terms);
	}
	
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement message()
	{
		return driver.findElement(message);
	}
	
	public WebElement forgotpassword()
	{
		return driver.findElement(forgotpassword);
	}

}
