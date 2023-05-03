package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By Email=By.xpath("//input[@id='user_email']");
	By Password= By.xpath("//input[@id='user_password']");
	
	By Login=By.xpath("//input[@name='commit']");
	
	public LoginPage(WebDriver driver) {	
	this.driver=driver;// left side driver is the driver which is declared at the top and right side driver is the constructer driver
	}
	
	public WebElement getEmail()// return type should be their, here i import this return type becuase login is a webelement that is declaed at above steps
	{
	 return driver.findElement(Email);
	}
	
	public WebElement getPassword()// return type should be their, here i import this return type becuase login is a webelement that is declaed at above steps
	{
	 return driver.findElement(Password);
	}
	
	public WebElement getLogin()// return type should be their, here i import this return type becuase login is a webelement that is declaed at above steps
	
	{
	 return driver.findElement(Login);
	}

}
