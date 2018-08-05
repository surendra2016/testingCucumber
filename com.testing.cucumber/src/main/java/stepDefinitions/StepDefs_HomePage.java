package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.HomePage;
import seleniumPages.Page_HomePage;
import util.TestBase;

public class StepDefs_HomePage extends TestBase {
	Page_HomePage homePage = new Page_HomePage();
	//HomePage hmPage = new HomePage(driver); 
	
	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() throws Throwable {
	   System.out.println("Launch Chrome browser");
	   homePage.launchBrowser();
	   //TestBase.initialization();
	}

	@When("^I open Homepage$")
	public void i_open_Homepage() throws Throwable {
		System.out.println("Open Home Page"); 
		homePage.openAdoptionPetURL();
	
	}

	@Then("^I verify that the page displays search text box$")
	public void i_verify_that_the_page_displays_search_text_box() throws Throwable {
		System.out.println("Check search box");
		homePage.checkSearchBoxIsDisplayed();
		//boolean textBoxFlag = hmPage.verifyTextBoxPresent();
		//System.out.println("textBoxFlag is : "+ textBoxFlag);
		//Assert.assertEquals(true, textBoxFlag);
		
	}
	
	@When("^I open adoption homepage$")
	public void i_open_adoption_homepage() throws Throwable {
		System.out.println("Open home page"); 
		homePage.openAdoptionPetURL();
	}

	@Then("^I type my name$")
	public void i_type_my_name() throws Throwable {
		System.out.println("Type my name");
		homePage.typeMyName();
		//hmPage.typeName();
	}

	@And("^verify my name$")
	public void verify_my_name() throws Throwable {
		System.out.println("Verifying my name");
		homePage.verifyMyName();
	}
	
	@And("^I click continue button$")
	public void i_click_continue_button() throws Throwable {
		System.out.println("Clicking continue..");
		homePage.clickOnContinueButton();
	}
	
	@And("^select an animal to adopt$")
	public void select_an_animal_to_adopt() throws Throwable {
		System.out.println("Select an animal..");
		homePage.selectAnAnimal();

	}
	
	@And("^I verify the confirmation text$")
	public void i_verify_the_confirmation_text() throws Throwable {
		System.out.println("Showing the confirmation text..");
		homePage.verifyConfirmation();
	}
	
	@And("^close the browser$")
	public void close_the_browser() throws Throwable {
		System.out.println("Closing the browser");
		homePage.closeTheBrowser();
		//TestBase.tearDown();
	}

}
