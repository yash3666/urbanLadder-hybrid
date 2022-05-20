package pageObject;

import java.io.IOException;

import resuable.WebDriverHelper;
import uistore.SofaBedsUI;
import utilities.Logs;

public class SofaBeds {
	WebDriverHelper helper;
	Logs logger;

	public SofaBeds() throws IOException {
		helper = new WebDriverHelper();
		logger=new Logs(SofaBeds.class.getSimpleName());
	}

	public void verifySofaBed()
	{
		if(helper.verifyElement(SofaBedsUI.sofaBeds))
			logger.log.info("Sofa Bed Is Displayed");
		else
			logger.log.info("Sofa Bed Is Not Displayed");
	}
	
}
