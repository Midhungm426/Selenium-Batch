package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public WebDriver driver;
	@BeforeMethod
	public void initializeBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void browserQuit()
	{
		driver.quit();
		//driver.close();

	}
	public static void main(String[] args)
	{
		Base base = new Base();
		base.initializeBrowser();	
		base.browserQuit();
	}

}
