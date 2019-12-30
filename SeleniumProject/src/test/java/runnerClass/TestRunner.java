/*
 Author : Thirukumaran 


*/
package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue = {"StepDefinitions", "DriverClass"},
		features = "src/test/resources/Features", 
		dryRun = false,
		monochrome = true,
		plugin = { "pretty","html:target/htmlreport", "json:target/Jsonreport.json" }
		)
 
public class TestRunner {

	public TestRunner() {
		
	
	}

}
