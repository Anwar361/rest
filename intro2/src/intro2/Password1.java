package intro2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Password1 {
	
	WebDriver driver;
	public Password1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By tite=By.xpath("//h2[normalize-space()='Forgot password']");
	By name=By.cssSelector("input[placeholder='Name']");
	By email=By.cssSelector("input[placeholder='Email']");
	By phon=By.cssSelector("input[placeholder='Phone Number']");
	By resetlogin=By.xpath("//*[normalize-space()='Reset Login']");
	By goback=By.cssSelector(".go-to-login-btn");
	
	public WebElement tite()
	{
		return driver.findElement(tite);
	}
	
	public WebElement name()
	{
		return driver.findElement(name);
	}
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	
	public WebElement phon()
	{
		return driver.findElement(phon);
	}
	
	public WebElement resetlogin()
	{
		return driver.findElement(resetlogin);
	}
	
	public WebElement goback()
	{
		return driver.findElement(goback);
	}
}
