package intro1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Windo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String url="C:\\Users\\anand\\jar\\drive\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", url);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		
		WebElement staticdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown= new Select(staticdropdown);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption());
		dropdown.selectByVisibleText("USD");
		dropdown.selectByValue("INR");
		
		driver.findElement(By.cssSelector(".paxinfo")).click();
		for(int i=0; i<4; i++)
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		
		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("in");
		
		List<WebElement> place=driver.findElements(By.cssSelector(".ui-menu-item a"));
		for(WebElement places : place)
		{
			if(places.getText().equalsIgnoreCase("india"))
			{
				places.click();
				break;				
			}
		}
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		if(driver.findElement(By.cssSelector("#Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("its Enables");			
		}
		else
		{
			System.out.println("its Disables");
		}
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		driver.findElement(By.cssSelector("#glsctl00_mainContent_ddl_originStation1_CTNR a[value='DEL']")).click();
		
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("(//li/a[@value='MAA'])[2]")).click();
		
		driver.findElement(By.xpath("(//td/a[text()='14'])[1]")).click();
		
		driver.findElements(By.cssSelector("div#discount-checkbox input[type='checkbox']")).size();
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
	}

}
