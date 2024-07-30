package org.cucumberproject1;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/sample1.feature", glue="org.cucumberproject1", monochrome=true, dryRun=true)

public class testrunclass {

}
