package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_HomePage {
	
	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() throws Throwable {
	   System.out.println("Launch Chrome browser");
	}

	@When("^I open Google Homepage$")
	public void i_open_Google_Homepage() throws Throwable {
		System.out.println("Open google"); 
	}

	@Then("^I verify that the page displays search text box$")
	public void i_verify_that_the_page_displays_search_text_box() throws Throwable {
		System.out.println("Check search box");
	}

}
