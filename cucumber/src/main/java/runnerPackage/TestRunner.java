package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				  features = "C:\\Users\\MONU KUMAR\\eclipse-workspace\\cucumber\\src\\main\\java\\feature\\dealsMap.feature"
				  ,glue={"stepDefinition"}
				  ,format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}
				  , dryRun= false
				  , monochrome = true
				  )

public class TestRunner {
	
	

}
