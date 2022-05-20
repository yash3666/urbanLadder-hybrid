package resuable;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utilities.BaseClass;

public class WebDriverHelper extends BaseClass
{	
	public void click(By element)
	{
		driver.findElement(element).click();
	}
	
	public void enterText(By element, String text)
	{
		driver.findElement(element).sendKeys(text);
	}
	
	public void hover(By element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(element)).perform();
	}
	
	public String getText(By element)
	{
		return driver.findElement(element).getText();
	}
	
	public boolean verifyElement(By element)
	{
		return driver.findElement(element).isDisplayed();
	}
	
	public void back()
	{
		driver.navigate().back();
	}
	public void switchHandles(int idx)
	{
		ArrayList<String> handles=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handles.get(idx));
	}
}
