package StepDefinations;

import Base.TestBase;
import DemoBlazePage.AddToCartPage;
import DemoBlazePage.HomePage;
import DemoBlazePage.LoginPage;
import DemoBlazePage.PlaceOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dAddToCartSteps extends TestBase{
	LoginPage l;
	HomePage h;
	AddToCartPage a;
	PlaceOrderPage p;
	public dAddToCartSteps() {
		super();
	}

@Given("user is on AddToCart page")
public void user_is_on_add_to_cart_page() throws InterruptedException {
	initialization();
	l=new LoginPage(driver);
	h = l.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(3000);
	a=h.scrollToProduct();
	p=new PlaceOrderPage(driver);
}

@When("clicks on addToCartLink")
public void clicks_on_add_to_cart_link() {
	System.out.println(1);
}

@And("handles the alert")
public void handles_the_alert() {
	System.out.println(1);
}

@Then("user is navigated to the PlaceOrderpage")
public void user_is_navigated_to_the_place_orderpage() throws InterruptedException {
	Thread.sleep(3000);
	p=a.addToCartProduct();
	Thread.sleep(3000);
	driver.close();
}

}
