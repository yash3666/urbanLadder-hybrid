package StepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CartPage;
import pageObject.HomePage;
import resuable.WebDriverHelper;

public class Steps_RemoveFromCart 
{
	WebDriverHelper helper;
    HomePage home;
	CartPage cart;
	String email;
	String pass;
	public Steps_RemoveFromCart() throws IOException
	{
		helper=new WebDriverHelper();
		home=new HomePage();
		cart=new CartPage();
		email="yash10@gmail.com";
		pass="yash@123";
	}
	
	@When("Click On Cart Icon")
	public void click_on_cart_icon() {
	    home.clickCart();
	}

	@Then("Remove the Item From Cart")
	public void remove_the_item_from_cart() {
	    cart.removeItemFromCart();
	}

}
