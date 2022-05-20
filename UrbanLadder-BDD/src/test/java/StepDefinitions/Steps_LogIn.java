package StepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.*;
import pageObject.CartPage;
import pageObject.ContactUsPage;
import pageObject.HomePage;
import pageObject.SofaBeds;
import pageObject.SofaPage;
import pageObject.StoresPage;
import pageObject.WishListPage;
import resuable.WebDriverHelper;
import utilities.BaseClass;

public class Steps_LogIn extends BaseClass
{ 
	
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
	public Steps_LogIn() throws IOException
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
	@When("Select Log In")
	public void select_log_in() 
	{
	    home.clickLogIn();
	}

	@When("Enter Log In Username and Password")
	public void enter_log_in_username_and_password() {
	    home.LogInEmail(email);
	    home.LogInPassword(pass);
	}
	@Then("Click On Log In")
	public void click_on_log_in() {
	    home.LogInSubmit();
	}
}
