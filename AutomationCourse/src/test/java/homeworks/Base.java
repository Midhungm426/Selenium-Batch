package homeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
	{
		public WebDriver driver;
		public void initializeBrowser()
		{
			driver = new ChromeDriver();
			driver.get("https://www.selenium.dev");
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
