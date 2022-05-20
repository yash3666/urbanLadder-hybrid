package StepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.*;
import pageObject.HomePage;
import pageObject.SofaPage;
import pageObject.WishListPage;
import resuable.WebDriverHelper;

public class Steps_AddToWishList
{
	
	WebDriverHelper helper;
    HomePage home;
	SofaPage sofa;
	WishListPage wishlist;
	String email;
	String pass;
	public Steps_AddToWishList() throws IOException
	{
		helper=new WebDriverHelper();
		home=new HomePage();
		sofa=new SofaPage();
		wishlist=new WishListPage();
		email="yash10@gmail.com";
		pass="yash@123";
	}

	@When("Log In with Valid Username and Password")
	public void log_in_with_valid_username_and_password() {
	    home.clickUserIcon();
	    home.clickLogIn();
	    home.LogInEmail(email);
	    home.LogInPassword(pass);
	    home.LogInSubmit();
	}

	@When("Click on Chelsea Sofa")
	public void click_on_chelsea_sofa() {
	    sofa.clickChelseaSofa();
	}

	@When("Click On Add to WishList Icon")
	public void click_on_add_to_wish_list_icon() {
	    wishlist.addToWishList();
	}

	@Then("Click On WishList Icon")
	public void click_on_wish_list_icon() {
	    home.clickwishList();
	}

	@Then("Verify the Item in Wishlist")
	public void verify_the_item_in_wishlist() {
	    wishlist.isElementIsAddedToWishlist();
	}
}
