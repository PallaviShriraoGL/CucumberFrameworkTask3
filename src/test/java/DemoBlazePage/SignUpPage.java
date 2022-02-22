package DemoBlazePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.TestBase;

public class SignUpPage extends TestBase {
	private By signInLink = By.partialLinkText("Sign up");
	private By un = By.id("sign-username");
	private By pw = By.id("sign-password");
	private By signInBtn = By.xpath("//button[text()='Sign up']");
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage signUp(String uname, String pass) throws InterruptedException {
		driver.findElement(signInLink).click();

		driver.findElement(un).sendKeys(uname);
		driver.findElement(pw).sendKeys(pass);
		driver.findElement(signInBtn).click();
		Thread.sleep(3000);
		 driver.switchTo().alert().accept();
		return new LoginPage(driver);
	}
	
}