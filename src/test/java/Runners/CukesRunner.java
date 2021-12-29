package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = {
				"pretty", 
				"html: target/default-cucumber-reports",
				"json: target/cucumber.json"
		}, 
		features = "src/test/resources/features", 
		glue = "StepDefinitions", 
		dryRun = false, 
		tags = ""
)

public class CukesRunner {
}
