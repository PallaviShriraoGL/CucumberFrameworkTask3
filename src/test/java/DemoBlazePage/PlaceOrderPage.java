package DemoBlazePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.TestBase;

public class PlaceOrderPage extends TestBase {
	private By placeOrderbtn = By.xpath("//button[text()='Place Order']");

	public PlaceOrderPage(WebDriver driver) {
		this.driver = driver;
	}
public FillFormPage linkClick() throws InterruptedException {
	Thread.sleep(3000);
		driver.findElement(placeOrderbtn).click();
		return new FillFormPage(driver);
	}
}
