package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserCommands extends Base
{
	public void navigationCommands()
	{
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
	}
	public void browserCommands()
	{
		String tittle = driver.getTitle();
		String url = driver.getCurrentUrl();
		String pageSource = driver.getPageSource();
	}
	
			public static void main(String[] args) 
	{
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.navigationCommands();
		browsercommands.browserCommands();
		browsercommands.browserQuit();
	}
}
