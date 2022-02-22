package StepDefinations;

import org.junit.Assert;

import Base.TestBase;
import DemoBlazePage.LoginPage;
import DemoBlazePage.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class aSignUpSteps extends TestBase{
	LoginPage l;
	SignUpPage sp;
	public aSignUpSteps() {
		super();
	}
@Given("user is on Main page")
public void user_is_on_main_page() throws InterruptedException {
	initialization();
	Thread.sleep(3000);
	 System.out.println(1);
    sp=new SignUpPage(driver); 
}


@When("^user enters \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\"$")
public void user_enters_sign_up_and(String uname, String pass) throws InterruptedException {
    l=sp.signUp(uname, pass);
     
}

@And("clicks on signUp button")
public void clicks_on_sign_up_button(){
	 //  Assert.assertEquals("STORE", driver.getTitle());
    
}

@Then("user is navigated to the Main page")
public void user_is_navigated_to_the_main_page() {

	driver.close();
}

}
