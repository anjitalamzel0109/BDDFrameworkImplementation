package testStepsDefinition;

import java.io.IOException;
import appCommonMethods.CommonMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageAction.HomePageAction;

public class AppLoginTestSteps {
	
	CommonMethods objCommonMethods = new CommonMethods();
	HomePageAction objHomePageAction = new HomePageAction();


	@Given("^I enter the App url$")
	public void i_enter_the_App_url() throws IOException {

		objCommonMethods.launchURL();
	//	System.out.println("I enter App Url");
		
	}

	
	@And("^I land to Homepage$")
	public void i_land_to_Homepage(){
	
		objHomePageAction.verifyHomePageTitle();
	}

	
	
	@And("^I enter valid username$")
	public void i_enter_valid_username()  {
		
		objHomePageAction.enterUsername();

	}

	@And("^I enter valid password$")
	public void i_enter_valid_password() {
		objHomePageAction.enterPassword();
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() {
		objHomePageAction.clickLoginButton();
		
	}
	   

	@Then("^I should land to Dashboard page$")
	public void i_should_land_to_Dashboard_page() {
		
		objHomePageAction.verifyDashboardPage();
	}


}
