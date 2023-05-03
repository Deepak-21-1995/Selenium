
package stepDefination;

import java.io.IOException;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

@RunWith(Cucumber.class)
public class StepDefination  extends Base{

@Given("Inilitize the browser with chrome")
public void inilitize_the_browser_with_chrome() throws IOException {
	driver= inilitizeDriver();
	driver.manage().window().maximize();
  
}
@Given("navigate to {string} site")
public void navigate_to_site(String string) {
	
	driver.get(string);
  
}
@Given("Click on Login link in home page to land on secure sign in page")
public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() {
	
	LandingPage l= new LandingPage(driver);
	l.getlogin().click();

}

@When("^Enter (.+) and (.+) and gets log in$")
public void enter_and_and_gets_log_in(String username, String password) throws Throwable {
   
	LoginPage login= new LoginPage(driver);
	
	login.getEmail().sendKeys(username);
	login.getPassword().sendKeys(password);
	login.getLogin().click();
  
}
@Then("Verify the user is successfully logged in")
public void verify_the_user_is_successfully_logged_in() {
	
	System.out.println("user successfully logged in");
  
}
@And("^close broswer$")
public void close_broswer() throws Throwable {
   driver.quit();
}
}
