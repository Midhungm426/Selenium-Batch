package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public WebDriver driver;
	public void initializeBrowser()
	{
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\MIDHUN GM\\eclipse-workspace\\AutomationCourse\\src\\main\\resources\\resorces\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}
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
