package StepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.*;
import pageObject.HomePage;
import pageObject.SofaPage;
import resuable.WebDriverHelper;

public class Steps_EMIOption {

	WebDriverHelper helper;
	HomePage home;
	SofaPage sofa;

	public Steps_EMIOption() throws IOException {
		helper = new WebDriverHelper();
		home = new HomePage();
		sofa = new SofaPage();

	}

	@When("Click On Sofa Under Living Section")
	public void click_on_sofa_under_living_section() {
		home.hoverLiving();
		home.clickSofa();
	}

	@When("Click Lewis Sofa")
	public void click_lewis_sofa() {
		sofa.clickLewisSofa();
	}

	@Then("Verify the EMI Option")
	public void verify_the_emi_option() {
		sofa.verifyEMIOption();
	}
}
