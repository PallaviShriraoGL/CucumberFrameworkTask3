package StepDefinations;

import Base.TestBase;
import DemoBlazePage.AddToCartPage;
import DemoBlazePage.HomePage;
import DemoBlazePage.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cHomeSteps extends TestBase{
	LoginPage l;
	HomePage h;
	AddToCartPage a;
	public cHomeSteps() {
		super();
	}

@Given("user is on home page")
public void user_is_on_home_page() throws InterruptedException {
	initialization();
	Thread.sleep(3000);
	l=new LoginPage(driver);
	h = l.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(3000);
	 System.out.println(1);
	a=new AddToCartPage(driver); 
     
}

@When("user scrollTo Product")
public void user_scroll_to_product() throws InterruptedException {
	Thread.sleep(3000);
	a=h.scrollToProduct();
	Thread.sleep(3000);
	 driver.close();
}

@And("clicks on ProductLink")
public void clicks_on_product_link() {
    
	System.out.println(1); 
}

@Then("user is navigated to the AddToCart page")
public void user_is_navigated_to_the_add_to_cart_page() {
   
	System.out.println(1);
}



}
