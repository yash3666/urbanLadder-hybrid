package pageObject;

import resuable.WebDriverHelper;
import uistore.StoresUI;
import utilities.Logs;

public class StoresPage {
	WebDriverHelper helper;
	Logs logger;
	
	public StoresPage()
	{
		helper=new WebDriverHelper();
		logger=new Logs(StoresPage.class.getSimpleName());
	}
	
	public void getStoreByName() 
	{
		String storeName=helper.getText(StoresUI.noidaStore);
		logger.log.info("Urban Ladder Store in Noida :: "+storeName);
	}

}
