package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport
{
	ExtentReports report;
	ExtentTest test;
	
	public void createReport()
	{
		Date d=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String date=dateFormat.format(d);
		String timeStamp=System.getProperty("user.dir")+"/reports/"+date.replaceAll("/","-").replaceAll(":", "-").replaceAll(" ","_")+"-report.html";
	    report=new ExtentReports(timeStamp,true);
	    report.loadConfig(new File(System.getProperty("user.dir")+"/src/main/resources/extent-config.xml"));
	}
	
	public void createTest(String testName)
	{
		test=report.startTest(testName);
		test.assignAuthor("Yash Dhiman");
	}
	
	public void logPass(String text)
	{
		test.log(LogStatus.PASS, text);
	}
	
	public void logFail(String text)
	{
		test.log(LogStatus.FAIL, text);
	}
	
	public void logInfo(String text)
	{
		test.log(LogStatus.INFO, text);
	}
	
	public void captureScreenshot(String path)
	{
		test.addScreenCapture(path);
		
	}
	
	public void closeTest()
	{
		report.endTest(test);
	}
	
	public void closeReport()
	{
		report.flush();
	}
}
