package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/Features", // path of feature file
		glue={"stepDefination"}) // package name of stepdefination

public class TestRunner extends AbstractTestNGCucumberTests {
	

}
