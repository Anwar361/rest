package maven1.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mavem1.Test1.AbstractMethod.AbsMethod;

public class ProductCatalog extends AbsMethod {

	WebDriver driver;
	public ProductCatalog(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	By product=By.cssSelector(".mb-3");
	
//	List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
//	WebElement prod=products.stream().filter(product->product.findElement(By.tagName("b")).getText().equals(productname)).findFirst().orElse(null);
//	prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	
	public List<WebElement> getProductList()
	{
		waitForElement(product);
		return products;		
	}
	
	public WebElement getProductName(String productName)
	{
		WebElement prod=getProductList().stream().filter(product->
		product.findElement(By.tagName("b")).getText().equals(productName)).findFirst().orElse(null);
		
		return prod;
	}
	
	
}
