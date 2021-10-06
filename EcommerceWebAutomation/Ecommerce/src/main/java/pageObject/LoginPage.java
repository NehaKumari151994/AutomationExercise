package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Cucumber.Ecommerce.Base;

public class LoginPage extends Base {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Navigate() throws IOException
	{
		driver.get("http://automationpractice.com/index.php");
	}
	By signIn = By.xpath("//*[@class='login']");
	public WebElement signIn()
	{
		return driver.findElement(signIn);
	}
	By username = By.xpath("//*[@id='email']");
	public WebElement Username()
	{
		return driver.findElement(username);
	}
	By password = By.xpath("//*[@id='passwd']");
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	By submit = By.xpath("//*[@id='SubmitLogin']");
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}
	
}
