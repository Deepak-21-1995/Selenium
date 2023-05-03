package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver inilitizeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"//Users//deepaksaini//eclipse-workspace//E2EProject//src//main//java//resources//data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			// execute this in chrome
			System.setProperty("webdriver.chrome.driver", "/Users/deepaksaini/Downloads/Selenium/chromedriver");
				driver = new ChromeDriver();
		}

		/*
		 * else if(browserName.equals("firefox")) { //execute this in firefox
		 * System.setProperty("webdriver.chrome.driver",
		 * "/Users/deepaksaini/Downloads/Selenium/geckodriver"); driver=new
		 * FirefoxDriver(); } else if(browserName.equals("IE")) { //execute this in IE
		 * System.setProperty("webdriver.chrome.driver",
		 * "/Users/deepaksaini/Downloads/Selenium/chromedriver"); driver=new
		 * InternetExplorerDriver(); }
		 */

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;// because so that this driver can we reuse

	}

	public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "/reports/" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
}
