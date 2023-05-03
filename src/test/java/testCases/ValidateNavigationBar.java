package testCases;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

import resources.Base;

public class ValidateNavigationBar extends Base {
	public WebDriver driver;
	public static Logger log= LogManager.getLogger(Base.class.getName());
	

	@BeforeTest
	public void Prerequiste() throws IOException {
		driver= inilitizeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		log.info("navigationbartitle");
		log.info("obejct is present");
		log.error("object is not present");
		//driver.get("http://www.qaclickacademy.com/");
	}
	
	@Test
	public void basepageNavigation(){
				
		LandingPage l= new LandingPage(driver);
	
	AssertJUnit.assertTrue(l.getNavigationBar().isDisplayed());
		
}
	@AfterTest
	public void broswerclose() {
		driver.close();
	}

}