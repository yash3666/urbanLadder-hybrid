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

public class Steps_SignUp extends BaseClass
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
	public Steps_SignUp() throws IOException
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
	
	@Given("Navigate to Url")
	public void navigate_to_url() throws IOException 
	{
		
		initializeDriver();
	    navigateUrl();
	}

	@When("Click on User Icon")
	public void click_on_user_icon() 
	{
		home.clickUserIcon();
		
	}

	@When("Select Sign Up")
	public void select_sign_up() 
	{
		home.clickSignUp();
	    
	}

	@When("Enter Sign Up Username and Password")
	public void enter_sign_up_username_and_password()
	{

		home.SignUpEmail(email);
	    home.SignUpPassword(pass);
	}

	@Then("Click Sign Up")
	public void click_sign_up() 
	{
		home.SignUpSubmit();	
	}

	@Then("Close Browser")
	public void close_browser() {
	    closeDriver();
	}
}
