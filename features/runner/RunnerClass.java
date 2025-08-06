package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features/Login1.feature",glue="stepdefinition")
public class RunnerClass extends AbstractTestNGCucumberTests {
	
}
