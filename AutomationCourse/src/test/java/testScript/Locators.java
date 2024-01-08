package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base
{
	public void locators()
	{
		WebElement id = driver.findElement(By.id("button-one"));
		WebElement id2 = driver.findElement(By.id("message-one"));
		WebElement id3 = driver.findElement(By.id("value-a"));
		WebElement id4 = driver.findElement(By.id("value-b"));
		WebElement id5 = driver.findElement(By.id("message-two"));
		
		WebElement className = driver.findElement(By.className("clearfix"));
		WebElement className2 = driver.findElement(By.className("header-top"));
		WebElement className3 = driver.findElement(By.className("mb-sec"));
		WebElement className4 = driver.findElement(By.className("clearfix"));
		WebElement className5 = driver.findElement(By.className("top-logo"));
		
		WebElement name = driver.findElement(By.name("viewport"));
		WebElement name2 = driver.findElement(By.name("description"));
		WebElement name3 = driver.findElement(By.name("keywords"));
		WebElement name4 = driver.findElement(By.name("viewport"));
		WebElement name5 = driver.findElement(By.name("author"));
		
		WebElement linkText =driver.findElement(By.linkText("Simple Form Demo"));
		WebElement linkText2 = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement linkText3 = driver.findElement(By.linkText("Select Input"));
		WebElement linkText4 = driver.findElement(By.linkText("Ajax Form Submit"));
		WebElement linkText5 = driver.findElement(By.linkText("Jquery Select2"));
		
		WebElement partialLinkText = driver.findElement(By.partialLinkText("Simple Form"));
		WebElement partialLinkText2 = driver.findElement(By.partialLinkText("Checkbox"));
		WebElement partialLinkText3 = driver.findElement(By.partialLinkText("Select In"));
		WebElement partialLinkText4 = driver.findElement(By.partialLinkText("Jquery Se"));
		WebElement partialLinkText5 = driver.findElement(By.partialLinkText("Ajax For"));
		
		WebElement cssSelectorId = driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssSelectorId2 = driver.findElement(By.cssSelector("button#button-two"));
		WebElement cssSelectorId3 = driver.findElement(By.cssSelector("input#value-b"));
		WebElement cssSelectorId4 = driver.findElement(By.cssSelector("input#value-a"));
		WebElement cssSelectorId5 = driver.findElement(By.cssSelector("input#single-input-field"));
		
		WebElement cssSelectorClass = driver.findElement(By.cssSelector("div.header-top"));
		WebElement cssSelectorClass2 = driver.findElement(By.cssSelector("div.top-logo"));
		WebElement cssSelectorClass3 = driver.findElement(By.cssSelector("div.mb-sec"));
		WebElement cssSelectorClass4 = driver.findElement(By.cssSelector("a.navbar-brand"));
		WebElement cssSelectorClass5 = driver.findElement(By.cssSelector("button.navbar-toggler"));
		
		WebElement cssSelectorTagAttribute = driver.findElement(By.cssSelector("button[id='button-one']"));
		WebElement cssSelectorTagAttribute2 = driver.findElement(By.cssSelector("div[class='mb-sec']"));
		WebElement cssSelectorTagAttribute3 = driver.findElement(By.cssSelector("a[class='navbar-brand']"));
		WebElement cssSelectorTagAttribute4 = driver.findElement(By.cssSelector("input[id='single-input-field']"));
		WebElement cssSelectorTagAttribute5 = driver.findElement(By.cssSelector("button[id='button-two']"));
		
		WebElement xpath = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		WebElement xpath2 = driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		WebElement xpath3 = driver.findElement(By.xpath("//a[@href='select-input.php']"));
		WebElement xpath4 = driver.findElement(By.xpath("//div[@id='message-two']"));
		WebElement xpath5 = driver.findElement(By.xpath("//input[@id='value-a']"));
		
		WebElement tagName = driver.findElement(By.tagName("div"));
		WebElement tagName2 = driver.findElement(By.tagName("input"));
		WebElement tagName3 = driver.findElement(By.tagName("button"));
		WebElement tagName4 = driver.findElement(By.tagName("a"));
		WebElement tagName5 = driver.findElement(By.tagName("span"));		
			
	}

	public static void main(String[] args) 
	{
		Locators locator = new Locators();
		locator.initializeBrowser();
		locator.locators();
		locator.browserQuit();

	}

}
