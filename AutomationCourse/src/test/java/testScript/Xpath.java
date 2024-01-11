package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base
{
	public void xpaths()
	{
		WebElement xpath = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		WebElement xpath2 = driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		WebElement xpath3 = driver.findElement(By.xpath("//a[@href='select-input.php']"));
		WebElement xpath4 = driver.findElement(By.xpath("//div[@id='message-two']"));
		WebElement xpath5 = driver.findElement(By.xpath("//input[@id='value-a']"));
		
		WebElement contains = driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
		WebElement contains2 = driver.findElement(By.xpath("//button[contains(@id,'button-t')]"));
		WebElement contains3 = driver.findElement(By.xpath("//div[contains(@class,'top-l')]"));
		WebElement contains4 = driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		WebElement contains5 = driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
		
		WebElement starts = driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement starts2 = driver.findElement(By.xpath("//div[starts-with(@id,'message-t')]"));
		WebElement starts3 = driver.findElement(By.xpath("//div[starts-with(@class,'mb-s')]"));
		WebElement starts4 = driver.findElement(By.xpath("//a[starts-with(@class,'navbar-b')]"));
		WebElement starts5 = driver.findElement(By.xpath("//div[starts-with(@id,'collapsibleN')]"));
		
		WebElement text = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement text2 = driver.findElement(By.xpath("//label[text()='Enter Message']"));
		WebElement text3 = driver.findElement(By.xpath("//label[text()='Enter value A']"));
		WebElement text4 = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement text5 = driver.findElement(By.xpath("//label[text()='Enter value B']"));
		
		WebElement or = driver.findElement(By.xpath("//button[text()='Show Message' or @id='button-one']"));
		WebElement or2 = driver.findElement(By.xpath("//label[text()='Enter value A' or @ id='value-a']"));
		WebElement or3 = driver.findElement(By.xpath("//label[text()='Enter Message' or @ id='single-input-field']"));
		WebElement or4 = driver.findElement(By.xpath("//button[text()='Get Total' or @ class='my-2']"));
		WebElement or5 = driver.findElement(By.xpath("//label[text()='Enter value B' or @ id='value-b']"));
		
		WebElement and = driver.findElement(By.xpath("//button[text()='Show Message' and @id='button-one']"));
		WebElement and2 = driver.findElement(By.xpath("//input[@class=\"form-control\" and @ id='value-b']"));
		WebElement and3 = driver.findElement(By.xpath("//input[@class=\"form-control\" and @ id='value-a']"));
		WebElement and4 = driver.findElement(By.xpath("//div[@id='message-two' and @class='my-2']"));
		WebElement and5 = driver.findElement(By.xpath("//div[@id='message-one' and @class='my-2']"));
		
		WebElement child = driver.findElement(By.xpath("//button[@id='button-one']// parent :: form"));
		WebElement child2 = driver.findElement(By.xpath("//button[@id='button-two']// parent :: form"));
		WebElement child3 = driver.findElement(By.xpath("//input[@id='value-b']// parent :: div"));
		WebElement child4 = driver.findElement(By.xpath("//input[@id='value-a']// parent :: div"));
		WebElement child5 = driver.findElement(By.xpath("//div[@id='message-one']// parent :: form"));
		
		WebElement ancestor = driver.findElement(By.xpath("//button[@id='button-one']//ancestor::form"));
		WebElement ancestor2 = driver.findElement(By.xpath("//button[@id='button-two']//ancestor::form"));
		WebElement ancestor3 = driver.findElement(By.xpath("//a[@href='jquery-select.php']//ancestor::ul[@class='list-group list-group-flush']"));
		WebElement ancestor4 = driver.findElement(By.xpath("//a[@href='jquery-select.php']//ancestor::li[@class='list-group-item']"));
		WebElement ancestor5 = driver.findElement(By.xpath("//a[@href='select-input.php']//ancestor::div[@class='card']"));
		
		WebElement following = driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		WebElement following2 = driver.findElement(By.xpath("//button[@id='button-two']//following::div[@id='message-two']"));
		WebElement following3 = driver.findElement(By.xpath("//div[@class='card-header']//following::button[@id='button-one']"));
		WebElement following4 = driver.findElement(By.xpath("//input[@id='single-input-field']//following::button[@id='button-one']"));
		WebElement following5 = driver.findElement(By.xpath("//input[@id='value-a']//following::button[@id='button-two']"));
		
		WebElement preceding = driver.findElement(By.xpath("//button[@id='button-one']//preceding::input[@id='single-input-field']"));
		WebElement preceding2 = driver.findElement(By.xpath("//button[@id='button-one']//preceding::label[@for='inputEmail4']"));
		WebElement preceding3 = driver.findElement(By.xpath("//div[@id='message-one']//preceding::input[@id='single-input-field']"));
		WebElement preceding4 = driver.findElement(By.xpath("//div[@id='message-two']//preceding::input[@id='single-input-field']"));
		WebElement preceding5 = driver.findElement(By.xpath("//div[@id='message-two']//preceding::input[@id='value-b']"));
		
		WebElement descendant = driver.findElement(By.xpath("//div[@class='form-group']//descendant::label[@for='inputEmail4']"));
		WebElement descendant2 = driver.findElement(By.xpath("//div[@class='form-group']//descendant::input[@id='single-input-field']"));
		WebElement descendant3 = driver.findElement(By.xpath("//div[@class='card-body']//descendant::div[@id='message-one']"));
		WebElement descendant4 = driver.findElement(By.xpath("//div[@class='card-body']//descendant::button[@id='button-one']"));
		WebElement descendant5 = driver.findElement(By.xpath("//div[@class='card-body']//descendant::button[@id='button-two']"));
		
		WebElement followingSibling = driver.findElement(By.xpath("//label[@for='inputEmail4']//following-sibling::input[@class='form-control']"));
		WebElement followingSibling2 = driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div[@id='message-one']"));
		WebElement followingSibling3 = driver.findElement(By.xpath("//div[@class='form-group']//following-sibling::input[@id='value-a']"));
		WebElement followingSibling4 = driver.findElement(By.xpath("//div[@class='form-group']//following-sibling::input[@id='value-b']"));
		WebElement followingSibling5 = driver.findElement(By.xpath("//button[@id='button-two']//following-sibling::div[@id='message-two']"));
		
	}
	public static void main(String[] args) 
	{
		Xpath xpath = new Xpath();
		xpath.initializeBrowser();
		xpath.xpaths();
		xpath.browserQuit();
	}
}
