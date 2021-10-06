package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Cucumber.Ecommerce.Base;

public class MyAccountObjects extends Base {

	public WebDriver driver;
	
	public MyAccountObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By PersonalInfo = By.xpath("//*[@class='icon-user']");
	public WebElement PersonalInfo()
	{
		return driver.findElement(PersonalInfo);
	}
	
	By FirstName = By.xpath("//*[@id='firstname']");
	public WebElement FirstName()
	{
		return driver.findElement(FirstName);
	}
	By OldPassword = By.xpath("//*[@id='old_passwd']");
	public WebElement OldPassword()
	{
		return driver.findElement(OldPassword);
	}
	By SaveChange = By.xpath("//*[@name='submitIdentity']");
	public WebElement SaveChange()
	{
		return driver.findElement(SaveChange);	
	}
}
