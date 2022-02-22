package DemoBlazePage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.TestBase;

public class FillFormPage extends TestBase {

	private By name1 = By.id("name");
	private By country1 = By.id("country");
	private By city1 = By.id("city");
	private By card1 = By.id("card");	
	private By month1 = By.id("month");
	private By year1 = By.id("year");
	private By purchaseBtn1 = By.xpath("//button[text()='Purchase']");
	private By purchaseMessage1 = By.xpath("//div[10]//h2");
	private By okBtn1 = By.xpath("//button[text()='OK']");
			
	public FillFormPage(WebDriver driver) {
		this.driver = driver;
		
	}
	public FillFormPage fillForm() {
		driver.findElement(name1).sendKeys("a");
		driver.findElement(country1).sendKeys("a");
		driver.findElement(city1).sendKeys("a");
		driver.findElement(card1).sendKeys("a");
		driver.findElement(month1).sendKeys("a");
		driver.findElement(year1).sendKeys("a");
		driver.findElement(purchaseBtn1).click();
		return new FillFormPage(driver);
		}
	public boolean validatePurchaseMessage() {
		String text = driver.findElement(purchaseMessage1).getText();
		String expectedText = "Thank you for your purchase!";
		if (text.equalsIgnoreCase(expectedText))
			return true;
		else
			return false;
	}

	public boolean validateTitle() {
		String title = driver.getTitle();

		String expectedTitle = "STORE";
		if (title.equalsIgnoreCase(expectedTitle))
			return true;
		else
			return false;
	}

	public void clickOk() {
		driver.findElement(okBtn1).click();

	}
	public static void takeSnapShot(WebDriver webdriver) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("ScreenShot.png");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }

}
