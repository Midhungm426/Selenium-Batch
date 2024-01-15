package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base
{

	public void singleInputField()
	{
		String input = "Hiii";
		String expectedOutput = "Your Message : "+input;
		WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputField.sendKeys(input);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		WebElement yourMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String messageText = yourMessageText.getText();
		if (messageText.equals(expectedOutput))
		{
			System.out.println("Test Passed"); 
		}
		else
		{
			System.out.println("Test Failed");
		}
		String backgroundColorOfShowMessageButton = showMessageButton.getCssValue("background-color");
		System.out.println("Background color = "+backgroundColorOfShowMessageButton);
		String fontWeightOfShowWeightButton = showMessageButton.getCssValue("font-weight");
		System.out.println("Font weight = "+fontWeightOfShowWeightButton);
		String fontColorOfShowMessageButton = showMessageButton.getCssValue("color");
		System.out.println("Font color = "+fontColorOfShowMessageButton);
		String classNameOfShowMessageButton=showMessageButton.getAttribute("class");
		boolean isShowMessageButtonDisplayed=showMessageButton.isDisplayed();
	}
	
	public void twoInputField()
	{
		int inputA =10;
		int inputB =15;
		String expectedTotal = "Total A + B : "+(inputA + inputB);
		WebElement valueA = driver.findElement(By.id("value-a"));
		valueA.sendKeys(String.valueOf(inputA));
		WebElement valueB = driver.findElement(By.id("value-b"));
		valueB.sendKeys(String.valueOf(inputB));
		WebElement getTotalButton =driver.findElement(By.id("button-two"));
		getTotalButton.click();
		WebElement total = driver.findElement(By.id("message-two"));
		String sum = total.getText();		
		if(expectedTotal.equals(sum))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		String borderRadiusOfGetTotalButton = getTotalButton.getCssValue("border-radius");
		System.out.println("Border radius = "+borderRadiusOfGetTotalButton);
	}
	
	public static void main(String[] args)
	{
		WebElementCommands webelementcommands = new WebElementCommands();
		webelementcommands.initializeBrowser();
		webelementcommands.singleInputField();
		webelementcommands.twoInputField();
		webelementcommands.browserQuit();
	}
}
