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

public class ePlaceOrderSteps extends TestBase {
	
	LoginPage l;
	HomePage h;
	AddToCartPage a;
	PlaceOrderPage p;
	FillFormPage ff;

	public ePlaceOrderSteps() {
		super();
	}
	@Given("user is on PlaceOrderPage")
	public void user_is_on_place_order_page() throws InterruptedException {
		initialization();
		l=new LoginPage(driver);
		h = l.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		a=h.scrollToProduct();
		p=a.addToCartProduct();
		ff = new FillFormPage(driver);
	}
	
	@When("clicks on Place Order button")
	public void clicks_on_place_order_button() throws InterruptedException {
		Thread.sleep(3000);
		ff = p.linkClick();
	}

	@Then("user is navigated to the FillForm page")
	public void user_is_navigated_to_the_fill_form_page() {
		driver.close();
	}

}
