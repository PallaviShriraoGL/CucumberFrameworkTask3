package DemoBlazePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class AddToCartPage extends TestBase{
	
	private By addToCartLink = By.partialLinkText("Add");
	private By placeOrderLink = By.partialLinkText("Place");
	private By cartLink = By.partialLinkText("Cart");
	
	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
	}
	public PlaceOrderPage addToCartProduct() throws InterruptedException {
		driver.findElement(addToCartLink).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(cartLink).click();
		return new PlaceOrderPage(driver);
	}
	
}