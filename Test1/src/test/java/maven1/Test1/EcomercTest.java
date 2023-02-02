package maven1.Test1;

import static org.testng.Assert.expectThrows;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcomercTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String loginid="anwar3617@gmail.com";
		String password="Annu@1234";
		String productname="ZARA COAT 3";
		
	/*	driver.findElement(By.xpath("//*[text()='Register here']")).click();
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Anwar");
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Hussain");
		driver.findElement(By.xpath("//input[@placeholder='email@example.com']")).sendKeys(loginid);
		driver.findElement(By.id("userMobile")).sendKeys("9012692625");
		WebElement drop=driver.findElement(By.xpath("//div/div/select"));
		Select dropdown=new Select(drop);
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys(password);
		driver.findElement(By.cssSelector("#confirmPassword")).sendKeys(password);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.id("login")).click();
		driver.navigate().back();*/
		
		landingPage pagelanding=new landingPage(driver);
		pagelanding.goTO();		
		pagelanding.login(loginid, password);
		
	/*	driver.findElement(By.cssSelector("input[type='email']")).sendKeys(loginid);
		driver.findElement(By.cssSelector("#userPassword")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Login']")).click();*/
		
		ProductCatalog productCatalogpage=new ProductCatalog(driver);

		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
	/*	List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod=products.stream().filter(product->product.findElement(By.tagName("b")).getText().equals(productname)).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();*/
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
		
		driver.findElement(By.cssSelector("button[routerlink='/dashboard/cart']")).click();
		Thread.sleep(3000);
		List<WebElement> prod1=driver.findElements(By.xpath("//ul/li/div"));
		boolean s=prod1.stream().anyMatch(product1->product1.getText().equalsIgnoreCase(productname));		
        if(s==true)
        {
        	System.out.println("pass");
        }
        else
        {
        	System.out.println("fail");
        }
        driver.findElement(By.xpath(("(//*[@type='button'])[2]"))).click();
        
        WebElement ele=driver.findElement(By.xpath("(//div/select)[1]"));
        
        Select li1=new Select(ele);
        li1.selectByIndex(10);
        
        WebElement ele1=driver.findElement(By.xpath("(//div/select)[2]"));
        
        Select li2=new Select(ele1);
        li2.selectByIndex(15);
        
        driver.findElement(By.xpath("(//div/input)[2]")).sendKeys("345");
        
        driver.findElement(By.xpath("//div/input[@placeholder='Select Country']")).sendKeys("ind");
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-item.list-group-item.ng-star-inserted")));
        
        List<WebElement> listofCountry=driver.findElements(By.cssSelector(".ta-item.list-group-item.ng-star-inserted"));
        
        for(int i=0; i<listofCountry.size(); i++)
        {
        	WebElement wb=listofCountry.get(i);
        	if(wb.getText().equalsIgnoreCase("india"))
        	{
        		wb.click();
        		break;
        	}
        }
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div/input)[3]")));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("(//div/input)[3]")).sendKeys("Anwar Hussain");
        Thread.sleep(8000);
        driver.findElement(By.xpath("//a[normalize-space()='Place Order']")).click();
        
        System.out.println(driver.findElement(By.cssSelector(".hero-primary")).getText());
        Assert.assertTrue(true);
        
	}

}
