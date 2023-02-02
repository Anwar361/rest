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

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "C:\\Users\\anand\\jar\\drive\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", url);
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		driver.navigate().to("https://in.search.yahoo.com/?fr2=inr");
		driver.navigate().back();

//		driver.switchTo().alert().dismiss();

//		File src=(File)((TakesScreenshot)driver).getScreenshotAs(OutputType, File);
//		FileUtils.copyFile(src, new File(""), true);

		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.get("https://in.search.yahoo.com/?fr2=inr");

		driver.findElement(By.cssSelector("div[title='Sign In']")).click();

		WebElement text1 = driver.findElement(By.cssSelector(".challenge-desc.signin-sub-title"));
		System.out.println(text1.getText());

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebElement feild1 = driver.findElement(By.cssSelector("#login-username"));

		Actions act = new Actions(driver);
		act.moveToElement(feild1).click().keyDown(Keys.SHIFT).sendKeys("Anwar Hussain").doubleClick().build().perform();

	//	driver.findElement(By.cssSelector("li.items-cont-1 #tpa-google-button")).click();

		driver.switchTo().window(parent);

//		WebElement fram = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(0);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
//		driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));

		a.dragAndDrop(source, target).build().perform();

	}

}
