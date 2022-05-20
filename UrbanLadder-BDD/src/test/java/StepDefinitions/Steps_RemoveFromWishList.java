package StepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import pageObject.HomePage;
import pageObject.WishListPage;
import resuable.WebDriverHelper;

public class Steps_RemoveFromWishList {
	WebDriverHelper helper;
    HomePage home;
	WishListPage wishlist;
	String email;
	String pass;
	public Steps_RemoveFromWishList() throws IOException
	{
		helper=new WebDriverHelper();
		home=new HomePage();
		wishlist=new WishListPage();
		email="yash10@gmail.com";
		pass="yash@123";
	}
	@Then("Remove Item From WishList")
	public void remove_item_from_wish_list() {
	    wishlist.removeFromWishList();
	}
}
