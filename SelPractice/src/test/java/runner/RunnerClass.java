package runner;



import org.junit.jupiter.api.Tag;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles/OpenHrmLogin.feature",glue="stepDefinitions")
public class RunnerClass {

	
	//it should combine feature file and step definition
	
}
