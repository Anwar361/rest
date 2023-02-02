package intro1;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
//import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

//import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Brokenlink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		String url="C:\\Users\\anand\\jar\\drive\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", url);
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		driver.navigate().to("https://rahulshettyacademy.com/documents-request");
		driver.navigate().back();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.cssSelector("#name")).sendKeys("Rahul");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("#name")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		driver.switchTo().alert().dismiss();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='radio2']")));
		
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		
	/*	List<WebElement> ele1=driver.findElements(By.xpath("//label/input[@type='radio']"));
		
		for(int i=0;i<ele1.size();i++)
		{
			String radio=ele1.get(i).getText();
			if(radio.contains("Radio2"))
			{
				ele1.get(i).click();
				System.out.println(radio);
			}
		} */
		
		
		driver.findElement(By.id("autocomplete")).sendKeys("mo");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-menu-item-wrapper")));
		List<WebElement> ele2=driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
		for(int j=0; j<ele2.size();j++)
		{
			String auto=ele2.get(j).getText();
			if(auto.contains("Monaco"))
			{
				ele2.get(j).click();
				System.out.println(auto);
			}
		}
		
		driver.findElement(By.id("dropdown-class-example")).click();
		WebElement statlist=driver.findElement(By.id("dropdown-class-example"));
		
		Select drop=new Select(statlist);
		drop.selectByIndex(2);
		
		driver.findElement(By.cssSelector("#checkBoxOption3")).click();
		
		driver.findElement(By.cssSelector("#show-textbox")).click();
		
		if(driver.findElement(By.cssSelector("#show-textbox")).getAttribute("value").contains("Show"))
			System.out.println("Visiable");
		else
			System.out.println("nonVisiable");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
//		js.executeScript("document.qureySelector('.Tablefixe').scrollTop=5000");
		
		List<WebElement> list=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/td[3]"));
		int sum=0;
		for(int k=0; k<list.size(); k++)
		{
			int tablenum=Integer.parseInt( list.get(k).getText());
			sum=sum+tablenum;
		}
		System.out.println("Sum of all the value"+sum);
		
//		File src=(File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(src, new File("c:\\"));
		
		WebElement s1=driver.findElement(By.cssSelector("#mousehover"));
		
		Actions a=new Actions(driver);
		a.moveToElement(s1).click().build().perform();
		
		js.executeScript("window.scrollBy(0,10000)");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td/ul/li/a")));
		
		driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		
		List<WebElement> first=driver.findElements(By.xpath("//table/tbody/tr/td/ul/li/a"));
		
		for(int l=0; l<first.size(); l++)
		{
			String cntrolkey=Keys.chord(Keys.CONTROL, Keys.ENTER);
			first.get(l).sendKeys(cntrolkey);			
		}
		
				
		Set<String> web=driver.getWindowHandles();
		Iterator<String> it=web.iterator();
		
		while(it.hasNext())
		{
			it.next();
			System.out.println(driver.getTitle());
		}
		
		List<WebElement> list2=driver.findElements(By.xpath("//table/tbody/tr/td/ul/li/a"));
		
		for(WebElement list1 : list2)
		{
			String url1=list1.getAttribute("href");
			HttpsURLConnection con=(HttpsURLConnection)new URL(url1).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int respcode=con.getResponseCode();
			System.out.println(respcode);
		}
		
	}

}
