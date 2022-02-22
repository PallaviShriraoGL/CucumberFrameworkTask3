package DemoBlazePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Base.TestBase;

public class HomePage extends TestBase{
	
	private By link1 = By.xpath("//a[text()='Samsung galaxy s6']");
	
public HomePage(WebDriver driver) {
	this.driver = driver;
}

public AddToCartPage scrollToProduct()
{
	
	driver.findElement(link1).click();
	return new AddToCartPage(driver);
}
}