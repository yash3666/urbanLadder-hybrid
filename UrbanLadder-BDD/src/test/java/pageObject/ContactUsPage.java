package pageObject;

import java.io.IOException;

import resuable.WebDriverHelper;
import uistore.ContactUsUI;
import utilities.Logs;

public class ContactUsPage {

     WebDriverHelper helper;
     Logs logger;
	
	public ContactUsPage() throws IOException
	{
		helper=new WebDriverHelper();
		logger=new Logs(ContactUsPage.class.getSimpleName());
	}
	
	public void contactUS()
	{
		if(helper.verifyElement(ContactUsUI.contactUS))
		{
			logger.log.info("Landed on Contact Us Page");
		}
		else
		{
			logger.log.info("Landed on Wrong Page");
		}
	}
}
