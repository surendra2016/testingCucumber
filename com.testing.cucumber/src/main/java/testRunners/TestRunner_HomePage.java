package testRunners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
//@CucumberOptions(features="resources/features", glue= {"classpath:src/main/java/stepDefinitions"})
@CucumberOptions(features="resources/features", glue= "stepDefinitions")
public class TestRunner_HomePage {
	/*static WebDriver driver;
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\study\\Apium\\chromedriver_win32\\chromedriver.exe");
		System.out.println("entered into the setup method..");
	}
	
	@AfterClass
	public static void endDriver() {
		driver.close();
	}*/
}
