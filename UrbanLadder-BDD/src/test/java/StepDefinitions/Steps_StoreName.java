package StepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.StoresPage;
import resuable.WebDriverHelper;

public class Steps_StoreName {

	WebDriverHelper helper;
    HomePage home;
	StoresPage stores;
	
	public Steps_StoreName() throws IOException
	{
		helper=new WebDriverHelper();
		home=new HomePage();
		stores=new StoresPage();
		
	}
	
	@When("Click On Stores in TopLink Bar")
	public void click_on_stores_in_top_link_bar() {
	    home.clickStores();
	}

	@Then("Verify the Name of the Store of Noida")
	public void verify_the_name_of_the_store_of_noida() {
	   
		stores.getStoreByName();
	}
}
