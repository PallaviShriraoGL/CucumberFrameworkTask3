package StepDefinations;

import Base.TestBase;
import DemoBlazePage.AddToCartPage;
import DemoBlazePage.FillFormPage;
import DemoBlazePage.HomePage;
import DemoBlazePage.LoginPage;
import DemoBlazePage.PlaceOrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FillFormSteps extends TestBase{
	LoginPage l;
	HomePage h;
	AddToCartPage a;
	PlaceOrderPage p;
	FillFormPage ff;
	public FillFormSteps() {
		super();
	}


@Given("user is on FillForm page")
public void user_is_on_fill_form_page() throws InterruptedException {
	initialization();
	l = new LoginPage(driver);
	h = l.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(3000);
	a = h.scrollToProduct();
	p = a.addToCartProduct();
	ff = new FillFormPage(driver);
}
@When("user enters Name and Country and City and CreditCard and Month and Year")
public void user_enters_name_and_country_and_city_and_credit_card_and_month_and_year() throws InterruptedException {
	ff=p.linkClick();
	Thread.sleep(3000);
	ff=ff.fillForm();
}
@When("clicks on purchase button")
public void clicks_on_purchase_button() throws Exception {
	Thread.sleep(2000);
	FillFormPage.takeSnapShot(driver);
	Thread.sleep(2000);
	ff.validateTitle();
	Thread.sleep(2000);
	System.out.println("Soft Assertion -> 1st site name assertion executed.");
ff.validatePurchaseMessage();
Thread.sleep(2000);
	System.out.println("Soft Assertion -> 2nd validatePurchaseMessage assertion executed.");
	ff.clickOk();
	
   Thread.sleep(3000);
}
@Then("user is navigated to the Thank Message Page")
public void user_is_navigated_to_the_thank_message_page() {
	driver.close();
}
}
