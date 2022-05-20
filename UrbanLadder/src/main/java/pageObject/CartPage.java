package pageObject;

import java.io.IOException;

import resuable.WebDriverHelper;
import uistore.CartUI;
import utilities.Logs;

public class CartPage {

WebDriverHelper helper;
Logs logger;
	
	public CartPage() throws IOException
	{
		helper=new WebDriverHelper();
		logger=new Logs(CartPage.class.getSimpleName());
	}
	
	public void clickAddToCart()
	{
		helper.click(CartUI.addToCart);
		logger.log.info("Item Added to Cart");
	}
	
	public void removeItemFromCart()
	{
		helper.click(CartUI.cancel);
		if(isCartEmpty()) {
			logger.log.info("Item removed from cart & Cart Is Empty");
		}
		else {
			logger.log.info("Cart Is Not Empty");
		}
	}
	
	public boolean isCartEmpty()
	{
		return helper.verifyElement(CartUI.cartEmpty);
	}
}
