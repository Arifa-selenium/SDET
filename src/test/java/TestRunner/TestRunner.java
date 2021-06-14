package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature",
		glue={"stepDefinition","utilities"},
		//tags= {"@register"},
		monochrome = true,
		plugin = {"pretty", "html:reports/" , "json:reports/jsonreport.json", "junit:reports/xmlreport.xml"}
 )

public class TestRunner {

}
