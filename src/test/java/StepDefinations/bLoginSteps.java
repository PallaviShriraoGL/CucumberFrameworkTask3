package StepDefinations;


import Base.TestBase;
import DemoBlazePage.HomePage;
import DemoBlazePage.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bLoginSteps extends TestBase{
	LoginPage l;
	HomePage h;
	public bLoginSteps() {
		super();
	}
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		initialization();
		l=new LoginPage(driver);
		h=l.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		 System.out.println(1);
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println(1);
		
		driver.close();
		 
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println(1);
		 
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println(1);
		 
	}
}
