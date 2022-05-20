package StepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CartPage;
import pageObject.ContactUsPage;
import pageObject.HomePage;
import pageObject.SofaBeds;
import pageObject.SofaPage;
import pageObject.StoresPage;
import pageObject.WishListPage;
import resuable.WebDriverHelper;

public class Steps_AddToCart {

	WebDriverHelper helper;
    HomePage home;
	SofaBeds sofaBeds;
	StoresPage stores;
	SofaPage sofa;
	CartPage cart;
	WishListPage wishlist;
	ContactUsPage contact;
	String email;
	String pass;
	public Steps_AddToCart() throws IOException
	{
		helper=new WebDriverHelper();
		home=new HomePage();
		sofaBeds=new SofaBeds();
		stores=new StoresPage();
		sofa=new SofaPage();
		cart=new CartPage();
		wishlist=new WishListPage();
		contact =new ContactUsPage();
		email="yash10@gmail.com";
		pass="yash@123";
	}
	
	@When("Click On Malabar Sofa")
	public void click_on_malabar_sofa() {
		sofa.clickMalabarSofa();	    
	}

	@Then("Click On Add To Cart")
	public void click_on_add_to_cart() {
	    cart.clickAddToCart();
	}


}
