package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//      html: type of report, target: folder name, folder under target:default-cucumber-reports
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/json-report/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/FailedRerun.txt"
        },
//        Path of  the FaildRerun.txt file
        features = "@target/FailedRerun.txt",
//        Path of step definitions folder
        glue = "src/test/stepdefinitions",
//

//      run the feature without browser.
        dryRun = false
)
// the point of this runner is to run only one file :FailedRerun.txt
public class FailedRunner {
}
