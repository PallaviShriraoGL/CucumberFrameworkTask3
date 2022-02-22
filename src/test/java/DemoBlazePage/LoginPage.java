package DemoBlazePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.TestBase;

public class LoginPage extends TestBase {

	
	private By logInBtn = By.id("login2");
	private By un = By.id("loginusername");
	private By pw = By.id("loginpassword");
	private By innerLogInBtn = By.xpath("//button[text()='Log in']");
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage login(String unm, String pass) {
		driver.findElement(logInBtn).click();
		driver.findElement(un).sendKeys(unm);
		driver.findElement(pw).sendKeys(pass);
		driver.findElement(innerLogInBtn).click();
		return new HomePage(driver);
	}
}
