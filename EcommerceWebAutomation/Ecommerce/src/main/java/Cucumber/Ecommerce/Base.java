package Cucumber.Ecommerce;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException 
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\NEHA KUMARI\\Desktop\\EcommerceWebAutomation\\Ecommerce\\src\\main\\java\\Cucumber\\Ecommerce\\data.properties");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver92\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		return driver;  
		
	}
}
