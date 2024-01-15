package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FindElements extends Base
{
	public void findElementsSample()
	{
		String inputMenu ="Checkbox Demo";
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='list-group list-group-flush']//li"));
		for (WebElement menuItem : menu) 
		{
			String menuText=menuItem.getText();
			if(inputMenu.equals(menuText))
			{
				menuItem.click();
				break;
			}
			
		}
	}
	
	public void selectClassSample()
	{
			driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
			WebElement dropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
			Select select = new Select(dropDown);
			select.selectByVisibleText("Red");
			select.selectByValue("Yellow");
			select.selectByIndex(3);
		}

	public static void main(String[] args) 
	{
		FindElements findelements = new FindElements();
		findelements.initializeBrowser();
		findelements.findElementsSample();
		//findelements.selectClassSample();
		//findelements.browserQuit();

	}

}
