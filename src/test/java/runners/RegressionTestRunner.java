package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports2",
                "json:target/json-report/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"
        },
        features = "./src/test/resources/features",
        glue = "src/test/stepdefinitions",
        tags = "@regression",
        dryRun = false
)
public class RegressionTestRunner {
}