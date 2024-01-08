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
	public void locators()
	{
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		WebElement className = driver.findElement(By.className("header-top"));
		
		WebElement linkText = driver.findElement(By.linkText("Checkbox Demo"));
		
		WebElement partialLinkText = driver.findElement(By.partialLinkText("Checkbox"));
		
		WebElement name = driver.findElement(By.name("description"));
		
		WebElement cssSelectorId = driver.findElement(By.cssSelector("button#button-one"));
		
		WebElement cssSelectorClass = driver.findElement(By.cssSelector("div.header-top"));
		
		WebElement cssSelectorTagAttribute = driver.findElement(By.cssSelector("button[id=button-one]"));
		
		WebElement xpath = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		
		WebElement tagName = driver.findElement(By.tagName("div"));
	}
	public static void main(String[] args) 
	{
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.navigationCommands();
		browsercommands.browserCommands();
		browsercommands.locators();
		browsercommands.browserQuit();
	}
}
