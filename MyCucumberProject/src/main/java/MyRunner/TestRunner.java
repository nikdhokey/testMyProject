package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\main\\java\\Features\\", //the path of the feature file
		glue={"stepDefinition"}, //the path of the step definition file	
		plugin= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"} //to generate report
		)

public class TestRunner 
{
	
}
