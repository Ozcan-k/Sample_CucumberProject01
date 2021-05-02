package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumgridStepDef {
    WebDriver driver;
    @Given("user in on the application page on chrome")
    public void user_in_on_the_application_page_on_chrome() throws MalformedURLException {
        //1.create hub url=porturl+wd+hub
        String hubURL="http://192.168.1.72:4444/wd/hub";

        //2. Define Desire Capabilities
        DesiredCapabilities cap= new DesiredCapabilities();

        //3.Assign Browser name ad operating system
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);

        //4.Merge Desire capabilities
        ChromeOptions options=new ChromeOptions();
        options.merge(cap);

        //5. Create driver object using RemoteWebDriver
         driver=new RemoteWebDriver(new URL(hubURL),options);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //6. Write your test case
        driver.get(ConfigReader.getProperty("qa_environment"));





    }

    @Then("verify the title include Crystalkey")
    public void verify_the_title_include_Crystalkey() {

    }

}
