package cucumberRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Feature/test1.feature",
		glue="stepDefinations",
		dryRun =false
		)
public class Runner {

	
}
