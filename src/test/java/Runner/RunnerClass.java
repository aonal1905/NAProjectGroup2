package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/FeautureFiles",
        tags = {"@test"},
        glue = {"StepDefinition","StepDefinition/*"}
)
class RunnerClass {

}
