package pageObject;

import resuable.WebDriverHelper;
import uistore.SofaUI;
import utilities.Logs;

public class SofaPage {

	WebDriverHelper helper;
	Logs logger;
	
	public SofaPage()
	{
		helper=new WebDriverHelper();
		logger=new Logs(SofaPage.class.getSimpleName());
	}
	public void clickMalabarSofa()
	{
		helper.click(SofaUI.malabarSofa);
		logger.log.info("Clicked Malabar Sofa");
	}
	
	public void clickChelseaSofa()
	{
		helper.click(SofaUI.chelseaSofa);
		logger.log.info("Clicked On Chelsea Sofa");
	}
	public void clickLewisSofa()
	{
		helper.click(SofaUI.LewisSofa);
		logger.log.info("Clicked On Lewis Sofa");
	}
	
	public void verifyEMIOption()
	{
		if(helper.verifyElement(SofaUI.emiOption))
		{
			logger.log.info("EMI option is available");
		}
		else
			logger.log.info("EMI option is not available");
	}
}
