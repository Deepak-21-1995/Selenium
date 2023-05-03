package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By Login=By.xpath("//a[@href='https://rahulshettyacademy.com/sign_in/']");
	By Title=By.xpath("//h2[normalize-space()='Featured Courses']");//xpath of feature courses
	By NavigationBar= By.xpath("//a[normalize-space()='Courses']");
	
	public LandingPage(WebDriver driver) {	
	this.driver=driver;// left side driver is the driver which is declared at the top and right side driver is the constructer driver
	
	//when we want to use the global variable which is "driver" in our local variable which is "driver", then we use "this keyword"
	}

	public WebElement getlogin()// return type should be their, here i import this return type becuase login is a webelement that is declaed at above steps
	{
	 return driver.findElement(Login);
	}
	
public WebElement getTitle()// return type should be their, here i import this return type becuase login is a webelement that is declaed at above steps
	{
	 return driver.findElement(Title);
	}
public WebElement getNavigationBar()// return type should be their, here i import this return type becuase login is a webelement that is declaed at above steps
{
 return driver.findElement(NavigationBar);
}

}
