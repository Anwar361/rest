package maven1.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class landingPage {
	
	WebDriver driver;
	public landingPage(WebDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="userEmail")
	WebElement username;
	@FindBy(css="#userPassword")
	WebElement password1;
	@FindBy(css="input[value='Login']")
	WebElement login;
	
	
	public void goTO()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	public void login(String loginid, String password)
	{
		username.sendKeys(loginid);
		password1.sendKeys(password);
		login.click();
	}

}
