package intro1;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="C:\\Users\\anand\\jar\\drive\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", url);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.manage().deleteAllCookies();
//		driver.switchTo().alert().dismiss();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-link-accountList")));
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		
		WebElement firstMove=driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
		System.out.println(firstMove.getText());
		
		WebElement secondMove=driver.findElement(By.cssSelector("input[type='text']"));
		act.moveToElement(secondMove).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.get("https://www.google.com/");
//		String text=driver.findElement(By.xpath("//*[@data-ved='0ahUKEwjwvc3S9OX5AhVk2DgGHbwHA-UQ4dUDCA0']")).getText();
		driver.switchTo().window(parent);
		
		secondMove.sendKeys("Amazon");
		
//		File src=(File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("C:\\Users\\anand\\Screenshort.png"), true);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("Window.scrollBy(0, 1000)");
	}

}
