package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue="StepDefinitions",
		dryRun=false,monochrome=true,
		plugin={"pretty","html:Reports/Cucumber.html"},
		publish=true)

public class TestRunner {

}