package StepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ContactUsPage;
import pageObject.HomePage;
import resuable.WebDriverHelper;

public class Steps_ContactUs 
{

	WebDriverHelper helper;
    HomePage home;
	ContactUsPage contact;
	
	public Steps_ContactUs() throws IOException
	{
		helper=new WebDriverHelper();
		home=new HomePage();
		contact =new ContactUsPage();

	}
	
	@When("Click On Contact Us")
	public void click_on_contact_us() {
	    home.clickContactUs();
	}

	@Then("Verify Contact Us Page")
	public void verify_contact_us_page() {
	    contact.contactUS();
	}
}


