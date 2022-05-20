package StepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.SofaBeds;
import resuable.WebDriverHelper;

public class Steps_SofaBedVerify {
	
	WebDriverHelper helper;
    HomePage home;
	SofaBeds sofaBeds;
	
	public Steps_SofaBedVerify() throws IOException
	{
		helper=new WebDriverHelper();
		home=new HomePage();
		sofaBeds=new SofaBeds();
		
	}

	@When("Click On Sofa Beds Under Living Section")
	public void click_on_sofa_beds_under_living_section() {
	    home.hoverLiving();
	    home.clickSofaBeds();
	}

	@Then("Verify the Sofa Beds Page")
	public void verify_the_sofa_beds_page() {
	    sofaBeds.verifySofaBed();
	}
}
