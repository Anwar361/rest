package intro2;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="C:\\Users\\anand\\jar\\drive\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", url);
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		String[] itemToADD= {"Cucumber","Brocoli","Carrot"};
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	//	driver.navigate().to("https://www.google.com/");
	//	driver.navigate().back();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".brand.greenLogo")));
		
		System.out.println(driver.findElement(By.cssSelector(".brand.greenLogo")).getText());
		
		List<WebElement> items=driver.findElements(By.cssSelector("h4.product-name"));
		
		List<String> itemselect= Arrays.asList(itemToADD);
		
		for(int i=0; i<items.size(); i++)
		{
			String itemName=items.get(i).getText().split(" ")[0].trim();
			int k=0;
			
			if(itemselect.contains(itemName))
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".product-action button")));
				k++;
				driver.findElements(By.cssSelector(".product-action button")).get(i).click();
			}
			if(k==3)
				break;
		}
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='PROCEED TO CHECKOUT']")));
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Place Order']")));
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

		
		
	}

}
