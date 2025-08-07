package runner;

import io.cucumber.testng.CucumberOptions;
import stepdefinition.BaseClass;


@CucumberOptions(features = "src/main/java/features/Login1.feature",glue={"stepdefinition"},monochrome = true,publish = true)
public class RunnerClass extends BaseClass {
	
}
