package runner;

import java.io.IOException;

import org.testng.annotations.*;
import pageObject.*;
import resuable.WebDriverHelper;
import utilities.BaseClass;
import utilities.ExtentReport;
import utilities.Screenshot;

public class TestRunner extends BaseClass
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
	ExtentReport reports;
	Screenshot scrnshot;
	
	@BeforeTest
	public void beforeTest() throws IOException
	{
		helper=new WebDriverHelper();
		home=new HomePage();
		sofaBeds=new SofaBeds();
		stores=new StoresPage();
		sofa=new SofaPage();
		cart=new CartPage();
		wishlist=new WishListPage();
		contact =new ContactUsPage();
		email="yash000@gmail.com";
		pass="yash@123";
		
		reports=new ExtentReport(); 
	    reports.createReport();
		reports.createTest("Urban Ladder Web Application");
	}
	
	@BeforeMethod
	public void Beforemethod() throws IOException
	{
		initializeDriver();
		reports.logPass("Browser Launched successfully");
		navigateUrl();
		reports.logPass("Navigated to URL");
	}

	@Test(priority=0)
	public void test1_SignUp()
	{
		//test1
		home.clickUserIcon();
		home.clickSignUp();
		home.SignUpEmail(email);
		home.SignUpPassword(pass);
		home.SignUpSubmit();
	    reports.logPass("Sign Up Successfully");
	}

	@Test(priority=1)
	public void test2_LogIn()
	{
		
	    //test2
		home.clickUserIcon();
		home.clickLogIn();
		home.LogInEmail(email);
		home.LogInPassword(pass);
		home.LogInSubmit();
		reports.logPass("Log In Successfully");
		
	}
	
	
	@Test(priority=2)
	public void test3_SofaBed() throws IOException
	{
		home.clickUserIcon();
		home.clickLogIn();
		home.LogInEmail(email);
		home.LogInPassword(pass);
		home.LogInSubmit();
		reports.logPass("Log In Successfully");
		//test3
		home.hoverLiving();
		home.clickSofaBeds();
		sofaBeds.verifySofaBed();
		reports.captureScreenshot(Screenshot.takeScreenshot());
		reports.logPass("Sofa Beds are verified on Sofa Beds Page");
		

	}
	
	@Test(priority=3)
	public void test4_StoreName()
	{
		home.clickStores();
		reports.logPass("Clicked On Stores & Store Name is retrieved");
		stores.getStoreByName();
		reports.logPass("Store Name is Logged Successfully");
	}
	
	@Test(priority=4)
	public void test5_EmiOption()
	{
		home.hoverLiving();
		home.clickSofa();
		sofa.clickLewisSofa();
		sofa.verifyEMIOption();
		reports.logPass("EMI Option is Verified Successfully");
		
	}
	
	@Test(priority=5)
	public void test6_AddToWishList() throws IOException
	{
		home.clickUserIcon();
		home.clickLogIn();
		home.LogInEmail(email);
		home.LogInPassword(pass);
		home.LogInSubmit();
		reports.logPass("Log In Successfully");
		
		home.hoverLiving();
		home.clickSofa();
		sofa.clickChelseaSofa();
		wishlist.addToWishList();
		reports.logPass("Item Added to WishList");
		wishlist.wishList();
		wishlist.isElementIsAddedToWishlist();
		reports.captureScreenshot(Screenshot.takeScreenshot());
		reports.logPass("Item is present in WishLiSt");
	}
	
	@Test(priority=6)
	public void test7_RemoveFromWishList() throws IOException
	{
		home.clickUserIcon();
		home.clickLogIn();
		home.LogInEmail(email);
		home.LogInPassword(pass);
		home.LogInSubmit();
		reports.logPass("Log In Successfully");
		
		//test7
		home.clickwishList();
		wishlist.removeFromWishList();
        reports.captureScreenshot(Screenshot.takeScreenshot());
		reports.logPass("Item removed from Wishlist Successfully");
	}
	
	@Test(priority=7)
	public void test8_AddToCart() throws IOException
	{
		home.clickUserIcon();
		home.clickLogIn();
		home.LogInEmail(email);
		home.LogInPassword(pass);
		home.LogInSubmit();
		reports.logPass("Log In Successfully");
		
		//test8
		home.hoverLiving();
		home.clickSofa();
		sofa.clickMalabarSofa();
		cart.clickAddToCart();
		reports.captureScreenshot(Screenshot.takeScreenshot());
		reports.logPass("Item added to Cart Successfully");
	}
	
	@Test(priority=8)
	public void testRemove9_FromCart() throws IOException
	{
		home.clickUserIcon();
		home.clickLogIn();
		home.LogInEmail(email);
		home.LogInPassword(pass);
		home.LogInSubmit();
		reports.logPass("Log In Successfully");
		
		//test9
		home.clickCart();
		cart.removeItemFromCart();
		reports.captureScreenshot(Screenshot.takeScreenshot());
		reports.logPass("Item removed from Cart Successfully");
	}

	@Test(priority=9)
	public void test10_ContactUs() throws IOException
	{
		home.clickContactUs();
		contact.contactUS();
		reports.captureScreenshot(Screenshot.takeScreenshot());
		reports.logPass("Contact US page Verified Successfully");
	}

	@AfterMethod
	public void terminateDriver()
	{
		closeDriver();
		reports.closeTest();
		reports.closeReport();
	}
	
}
