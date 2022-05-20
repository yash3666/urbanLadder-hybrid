package uistore;

import org.openqa.selenium.By;

public class WishListUI {

	public static By addToWishlist=By.xpath("//span[@class='icofont icofont-heart_outline_thick wishicon']");
	public static By wishlist=By.id("shortlist-badge");
	public static By added=By.xpath("//span[@class='icofont wishicon icofont-heart_fill selected']");
	public static By addedTowishlist=By.xpath("//span[@class='wishtext']");
	public static By emptyWishlist=By.xpath("//div[@class='message']");
}
