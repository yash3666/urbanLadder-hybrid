package uistore;

import org.openqa.selenium.By;

public class HomeUI 
{
	public static By popUpClose = By.xpath("//*[@id='authentication_popup'] //*[contains (text(),'Close')]");
	public static By popUp=By.xpath("//*[@id='authentication_popup']");
	public static By searchBox=By.id("search");
	public static By searchButton=By.id("search_button");
	
	public static By goToHome=By.xpath("//figure[@class='header__topBar_logo']");
	
	//logIN & signUP 
	public static By Cart=By.xpath("//div[@id='cart-badge']");
	public static By wishlist=By.id("shortlist-badge");
	public static By userIcon=By.xpath("//*[@class='header-icon-link user-profile-icon']");
	public static By logIn=By.xpath("//a[@class='login-link authentication_popup']");
	public static By signUp=By.xpath("//a[@class='signup-link authentication_popup']");
	public static By signUpEmail=By.xpath("//form[@id='signup_form']//input[@id='spree_user_email']");
	public static By signUpPassword=By.xpath("//form[@id='signup_form']//input[@type='password']");
	public static By signUpSubmit=By.xpath("//input[@value='Sign Up']");
	public static By logInEmail=By.xpath("//form[@id='login_form']//input[@type='email']");
	public static By logInPassword=By.xpath("//form[@id='login_form']//input[@type='password']");
	public static By logInSubmit=By.xpath("//input[@value='Log In']");
	public static By logOut=By.xpath("//a[@id='logout']");
	public static By error=By.xpath("//label[@class='error']");

	public static By living=By.xpath("//li[@class='topnav_item livingunit']");
	public static By sofa=By.xpath("//a[@href='/sofa?src=g_topnav_living_sofas-recliners_sofas']");
	public static By sofaBedsLiving=By.xpath("//li[@class='topnav_item livingunit']//*[contains (text(),'Sofa Bed')]");
	
	public static By stores=By.xpath("//a[@href='../../furniture-stores?src=header']");

	public static By contactUs=By.xpath("//a[@href='/help/contact-us?src=g_footer']");
}
