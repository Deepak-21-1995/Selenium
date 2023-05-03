package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());// Log4j

	// we use beforemethod instead of beforetest here is because of data provider,
	// it declares 2 value combination.

	@BeforeMethod
	public void Prerequiste() throws IOException {
		driver = inilitizeDriver(); // InilitizeDriver will return something, thats y we use driver here
		driver.manage().window().maximize();

		driver.get(prop.getProperty("url"));

		log.info("this is home page test case");

		// driver.get("http://www.qaclickacademy.com/");
	}

	@Test(dataProvider = "getData")
	public void basepageNavigation(String Username, String Password) {

		// page object- Landing Page
		LandingPage l = new LandingPage(driver);
		l.getlogin().click();// same as driver.findelement(by.xpath(""));

		// page object- Login Page
		LoginPage login = new LoginPage(driver);

		login.getEmail().sendKeys(Username);
		login.getPassword().sendKeys(Password);
		login.getLogin().click();

	}

	@DataProvider
	public Object[][] getData() {

		// row stands for how many different data types test should run(combination)
		// columns stands how many values u want to pass per test(values)

		Object[][] data = new Object[2][2];

		data[0][0] = "user1";
		data[0][1] = "password1";

		data[1][0] = "user2";
		data[1][1] = "password2";

		return data;

	}

	@AfterMethod
	public void broswerclose() {
		driver.close();
	}
}
