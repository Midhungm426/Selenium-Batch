package homeworks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends Base
{
	public void findElementFromDropdown()
	{
		String inputMenu = "Português (Brasileiro)";
		WebElement dropDownButton = driver.findElement(By.xpath("//div[@class=\"dropdown\"]//a[@role=\"button\"]"));
		dropDownButton.click();
		List<WebElement> dropDown= driver.findElements(By.xpath("//div[@class='dropdown']//li"));
		for(WebElement dropDownItem : dropDown)
		{
			String dropDownText = dropDownItem.getText();
			if(inputMenu.equals(dropDownText))
			{
				dropDownItem.click();
				break;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		FindElements findelements = new FindElements();
		findelements.initializeBrowser();
		findelements.findElementFromDropdown();
		findelements.browserQuit();
	}

}
