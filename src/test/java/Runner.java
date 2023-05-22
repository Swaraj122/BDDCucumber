

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/SW20466288/eclipse-workspace/BDDCucumber/src/main/java/BDD/petstore.feature", glue = {
		"BDDBinding" }, tags=("@three"))
public class Runner {

}
