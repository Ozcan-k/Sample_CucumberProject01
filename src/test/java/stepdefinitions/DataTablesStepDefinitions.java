package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DTPages;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepDefinitions {
    DTPages dtPages = new DTPages();
    @Given("user is on the datatables page")
    public void user_is_on_the_datatables_page() {
        Driver.getDriver().get(ConfigReader.getProperty("dt_url"));
    }
    @Given("use clicked on the new button")
    public void use_clicked_on_the_new_button() {
        dtPages.newButton.click();
    }
    @When("user enters the firstname")
    public void user_enters_the_firstname() {
        dtPages.firstName.sendKeys("John");
    }
    @When("user enters the lastname")
    public void user_enters_the_lastname() {
        dtPages.lastName.sendKeys("Walker");
    }
    @When("user enters the position")
    public void user_enters_the_position() {
        dtPages.position.sendKeys("SDET");
    }
    @When("user enters the office")
    public void user_enters_the_office() {
        dtPages.office.sendKeys("Los Angles");
    }
    @When("user enters the extension")
    public void user_enters_the_extension() throws InterruptedException {
        Thread.sleep(1000);
        dtPages.extension.sendKeys("4532");
    }
    @When("user enters the startdate")
    public void user_enters_the_startdate() {
        dtPages.startDate.sendKeys("2021-03-01");
    }
    @When("user enters the salary")
    public void user_enters_the_salary() {
        dtPages.salary.sendKeys("100000");
    }
    @When("user clicks on the create button")
    public void user_clicks_on_the_create_button() {
        dtPages.createButton.click();
    }
    @When("user search for the first name")
    public void user_search_for_the_first_name() {
        dtPages.searchBox.sendKeys("John");
    }
    @Then("verify the name field contains the firstname")
    public void verify_the_name_field_contains_the_firstname() {
        String name=dtPages.nameField.getText();
        Assert.assertTrue(name.contains("John"));
    }

    @When("user enters the firstname {string}")
    public void user_enters_the_firstname(String string) {
        dtPages.firstName.sendKeys(string);
    }

    @When("user enters the lastname {string}")
    public void user_enters_the_lastname(String string) {
        dtPages.lastName.sendKeys(string);
    }

    @When("user enters the position {string}")
    public void user_enters_the_position(String string) {
        dtPages.position.sendKeys(string);
    }

    @When("user enters the office {string}")
    public void user_enters_the_office(String string) {
        dtPages.office.sendKeys(string);
    }

    @When("user enters the extension {string}")
    public void user_enters_the_extension(String string) {
        dtPages.extension.sendKeys(string);
    }

    @When("user enters the startdate {string}")
    public void user_enters_the_startdate(String string) {
        dtPages.startDate.sendKeys(string);
    }

    @When("user enters the salary {string}")
    public void user_enters_the_salary(String string) {
        dtPages.salary.sendKeys(string);
    }

    @When("user search for the firstname {string}")
    public void user_search_for_the_firstname(String string) {
        dtPages.searchBox.sendKeys(string);
    }

    @Then("verify the name field contains the firstname {string}")
    public void verify_the_name_field_contains_the_firstname(String string) {
        String name=dtPages.nameField.getText();
        Assert.assertTrue(name.contains(string));
    }

}
