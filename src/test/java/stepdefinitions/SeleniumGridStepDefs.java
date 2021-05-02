package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumGridStepDefs {
    WebDriver driver;

    @Given("user is on the application page on chrome")
    public void user_is_on_the_application_page_on_chrome() throws MalformedURLException {

        //1. Create hub url=porturl+ wd + hub. We can find this on the hub terminal
        String hubURL="http://192.168.1.72:4444/wd/hub";

        //2. Define Desired Capabilities
        DesiredCapabilities cap=new DesiredCapabilities();

        //3.Assign browser name and operating system
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        //cap.setPlatform(Platform.WINDOWS);//for windows

        //4. Merge Desired Capabilities
        ChromeOptions options=new ChromeOptions();
        options.merge(cap);

        //5. Create driver object using RemoteWebDriver
        //Create RemoteWebDriver for all driver types(chrome, gecko,...)
        driver=new RemoteWebDriver(new URL(hubURL),options);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        ReusableMethods.waitFor(3);

        //6. Write your test cases
        driver.get(ConfigReader.getProperty("qa_environment"));//going to the application page

    }

    @Then("verify the title included Crystalkey")
    public void verify_the_title_included_Crystalkey() {
        //7. Rest is regular selenium code. Verifying if the tile contains Crystalkey
        String title= driver.getTitle();
        Assert.assertTrue(title.contains("Crystalkey"));
        driver.quit();
    }


    @Given("user is on the application page on firefox")
    public void user_is_on_the_application_page_on_firefox() throws MalformedURLException {
        //I will configure this step definition to run on firefox
        //1. Create hub url=porturl+ wd + hub. We can find this on the hub terminal
        String hubURL="http://192.168.1.72:4444/wd/hub";

        //2. Define Desired Capabilities
        DesiredCapabilities cap=new DesiredCapabilities();

        //3.Assign browser name and operating system
        cap.setBrowserName("firefox");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        cap.setPlatform(Platform.WINDOWS);
        //cap.setPlatform(Platform.WINDOWS);//for windows


        //4. Merge Desired Capabilities
        FirefoxOptions options=new FirefoxOptions();//!!!!!!!!!!!!!!!!
        options.merge(cap);

        //5. Create driver object using RemoteWebDriver
        //Create RemoteWebDriver for all driver types(chrome, gecko,...)
        driver=new RemoteWebDriver(new URL(hubURL),options);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        ReusableMethods.waitFor(3);

        //6. Write your test cases
        driver.get(ConfigReader.getProperty("qa_environment"));//going to the application page

    }
}
