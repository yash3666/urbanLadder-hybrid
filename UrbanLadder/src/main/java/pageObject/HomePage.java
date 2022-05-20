package pageObject;

import java.io.IOException;

import resuable.WebDriverHelper;
import uistore.HomeUI;
import utilities.Logs;

public class HomePage
{
	WebDriverHelper helper;
	Logs logger;
	
	public HomePage() throws IOException
	{
		helper=new WebDriverHelper();
		logger=new Logs(HomePage.class.getSimpleName());
	}
	
	// User Login & sign Up
	public void clickUserIcon()
	{
		helper.click(HomeUI.userIcon);
		logger.log.info("Clicked On User Icon");
	}
	public void clickSignUp()
	{
		helper.click(HomeUI.signUp);
		logger.log.info("Clicked On Sign Up");
	}
	public void SignUpEmail(String email)
	{
		helper.enterText(HomeUI.signUpEmail,email);
		logger.log.info("Entered Sign Up email");
	}
	public void SignUpPassword(String pass)
	{
		helper.enterText(HomeUI.signUpPassword, pass);
		logger.log.info("Entered Sign up password");
	}
	public void SignUpSubmit()
	{
		helper.click(HomeUI.signUpSubmit);
		logger.log.info("Submitted Sign Up");
	}
	
	public void clickLogIn()
	{
		helper.click(HomeUI.logIn);
		logger.log.info("Clicked On Log In");
	}
	public void LogInEmail(String email)
	{
		helper.enterText(HomeUI.logInEmail,email);
		logger.log.info("Entered Log In Email");
	}
	public void LogInPassword(String pass)
	{
		helper.enterText(HomeUI.logInPassword, pass);
		logger.log.info("Entered Log In password");
	}
	public void LogInSubmit()
	{
		helper.click(HomeUI.logInSubmit);
		logger.log.info("Log In");
	}
	
	public void clickCart()
	{
		helper.click(HomeUI.Cart);
		logger.log.info("Clicked On Cart Icon");
	}
	
	public void goTOHomePage()
	{
		helper.click(HomeUI.goToHome);
		logger.log.info("Directed to homepage");
	}
	public void clickLogOut()
	{
		helper.click(HomeUI.logOut);
		logger.log.info("Clicked On Log Out");
	}
	// top Navigation Living
	
	public void hoverLiving()
	{
		helper.hover(HomeUI.living);
		logger.log.info("CLicked on Living in Top bar");
	}
	public void clickSofaBeds()
	{
		helper.click(HomeUI.sofaBedsLiving);
		logger.log.info("Clicked On SofaBeds in Living Section");
	}
	public void clickSofa() {
		helper.click(HomeUI.sofa);
		logger.log.info("Clicked On Sofa in Living Section");
	}
	
	public void clickStores()
	{
		helper.click(HomeUI.stores);
		logger.log.info("Clicked On Stores on Top of the Page");
	}
	
	public void clickContactUs()
	{
		helper.click(HomeUI.contactUs);
		logger.log.info("Clicked On Contact Us in Last Of The Page");
	}
	
	public void clickwishList()
	{
		helper.click(HomeUI.wishlist);
		logger.log.info("Clicked On WishList Icon");
	}
	
	public void closePopUp() {
		helper.click(HomeUI.popUpClose);
		logger.log.info("PopUp is Closed");
	}
	
	public boolean isPopUp()
	{
		return helper.verifyElement(HomeUI.popUp);
	}
}
