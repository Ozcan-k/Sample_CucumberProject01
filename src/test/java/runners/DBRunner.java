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
                "junit:target/xml-report/cucumber.xml"
        },
//        Path of features folder
        features = "./src/test/resources/features",
//        Path of step definitions folder
        glue = "database_stepdefinitions",
//        run only tagged scenarios in the features folder
        tags = "@dbcreate",
//      run the feature without browser.
        dryRun = false
)
public class DBRunner {

}
