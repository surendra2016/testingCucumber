package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
//@CucumberOptions(features="resources/features", glue= {"classpath:src/main/java/stepDefinitions"})
@CucumberOptions(features="resources/features", glue= "stepDefinitions")
public class TestRunner_HomePage {

}
