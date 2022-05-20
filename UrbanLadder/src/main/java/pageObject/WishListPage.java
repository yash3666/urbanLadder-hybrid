package pageObject;

import java.io.IOException;

import resuable.WebDriverHelper;
import uistore.WishListUI;
import utilities.Logs;

public class WishListPage {

WebDriverHelper helper;
Logs logger;
	
	public WishListPage() throws IOException
	{
		helper=new WebDriverHelper();
		logger=new Logs(WishListPage.class.getSimpleName());
	}
	
	public void addToWishList() {
		helper.click(WishListUI.addToWishlist);
		logger.log.info("Item added to WishList");
	}
	
	public void wishList()
	{
		helper.click(WishListUI.wishlist);
		logger.log.info("Clicked On WishList Icon");
	}
	public boolean isElementIsAddedToWishlist()
	{
		if(helper.verifyElement(WishListUI.added))
		{
			logger.log.info("Item is added to wishlist");
			
		}
		else {
			logger.log.info("Item is not added to wishlist");
		}
		return helper.verifyElement(WishListUI.added);
	}
	
	public void removeFromWishList()
	{
		helper.hover(WishListUI.added);
		logger.log.info("Item is in present in WishList");
		
		helper.click(WishListUI.addedTowishlist);
		logger.log.info("Clicked On Added to WishList Icon");
		
		helper.click(WishListUI.wishlist);
		logger.log.info("Item is removed from WishList");
		
		if(isWishListEmpty())
		{
			logger.log.info("WishLIst Is Empty");
		}
		else {
			logger.log.info("WishLIst Is Not Empty");
		}
	}
	
	public boolean isWishListEmpty()
	{
		return helper.verifyElement(WishListUI.emptyWishlist);
	}
}
