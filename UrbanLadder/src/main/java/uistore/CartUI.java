package uistore;

import org.openqa.selenium.By;

public class CartUI 
{

	public static By addToCart=By.xpath("//button[@id='add-to-cart-button']");
	public static By checkOut=By.xpath("//button[@id='checkout-link']");
	public static By pinCode=By.id("order_ship_address_attributes_zipcode");
	public static By address=By.id("order_ship_address_attributes_address1");
	public static By firstName=By.id("order_ship_address_attributes_firstname");
	public static By lastName=By.id("order_ship_address_attributes_lastname");
	public static By mobile=By.id("order_ship_address_attributes_phone");
	public static By saveContinue=By.id("address-form-submit");
	public static By placeOrder=By.xpath("//input[@value='Place Order']");
	public static By cancel=By.xpath("//a[@class='delete-item']");
	public static By cartEmpty=By.xpath("//p[@class='empty_msg']");
}
