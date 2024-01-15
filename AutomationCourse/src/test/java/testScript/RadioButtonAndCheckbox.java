package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonAndCheckbox extends Base
{
	public void radioButton()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleButton.click();
		boolean isMaleButtonSelected=maleButton.isSelected();
		WebElement showSelectedValueButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValueButton.click();
		WebElement radioButtonMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessage=radioButtonMessageText.getText();
		String expectedMessage = "Radio button 'Male' is checked";
		if(actualMessage.equals(expectedMessage))
		{
			System.out.println("Male");
		}
		else
		{
			System.out.println("Female");
		}
	}
	
	public void checkBox()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement singleCheckBox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singleCheckBox.click();
		boolean isSingleCheckBoxSelected = singleCheckBox.isSelected();
		WebElement checkBoxMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessageText = checkBoxMessageText.getText();
		String expectedMessageText ="Success - Check box is checked";
		if(expectedMessageText.equals(actualMessageText))
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is not selected");
		}
	}
		
	public static void main(String[] args) 
	{
		RadioButtonAndCheckbox radiobuttonandcheckbox = new RadioButtonAndCheckbox();
		radiobuttonandcheckbox.initializeBrowser();
		radiobuttonandcheckbox.radioButton();
		radiobuttonandcheckbox.checkBox();
		radiobuttonandcheckbox.browserQuit();
	}

}
