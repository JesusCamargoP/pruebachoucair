package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features="src/test/java/feature",
        glue = ("Seleniumgleucode")
)

public class testrunner {
}
