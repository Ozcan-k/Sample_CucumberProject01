package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import pages.DefaultPage;
import pages.LoginPage;
import pages.RoomReservationPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class RoomReservationStepDefinition {
    LoginPage loginPage=new LoginPage();
    DefaultPage defaultPage=new DefaultPage();
    RoomReservationPage roomReservationPage=new RoomReservationPage();
    @Given("user is on the log in page")
    public void user_is_on_the_log_in_page() {
        Driver.getDriver().get(ConfigReader.getProperty("qa_environment_login_page"));
    }

    @Given("user enters username and password")
    public void user_enters_username_and_password(DataTable credentials) {
//        DATA TABLES
        List<String> loginData=credentials.row(0);//Getting the first row data as List of string
        loginPage.username.sendKeys(loginData.get(0));//Getting the first column data
        loginPage.password.sendKeys(loginData.get(1));//Getting the second column data
    }

    @Given("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.loginButton.click();
    }

    @Given("user goes to room reservation page")
    public void user_goes_to_room_reservation_page() {
        defaultPage.hotelManagement.click();
        defaultPage.roomReservations.click();
    }

    @Given("enter all required fields and click save button")
    public void enter_all_required_fields_and_click_save_button(DataTable credentials) throws InterruptedException {
        Thread.sleep(1000);
        roomReservationPage.addRoomReservationButton.click();
        Select idUser=new Select(roomReservationPage.idUser);
        idUser.selectByIndex(2);
        Select idHotel=new Select(roomReservationPage.idHotelRoom);
        idHotel.selectByIndex(3);
        List<String> testData=credentials.row(1);//row 2
        roomReservationPage.price.sendKeys(testData.get(0));//column 1
        roomReservationPage.dateStart.sendKeys(testData.get(1));//column 2
        roomReservationPage.dateEnd.sendKeys(testData.get(2));//column 3
        roomReservationPage.adultAmount.sendKeys(testData.get(3));//column 4
        roomReservationPage.childrenAmount.sendKeys(testData.get(4));
        roomReservationPage.nameAndSurname.sendKeys(testData.get(5));
        roomReservationPage.contactPhone.sendKeys(testData.get(6));
        roomReservationPage.contactEmail.sendKeys(testData.get(7));
        roomReservationPage.notes.sendKeys(testData.get(8));
        roomReservationPage.approved.click();
        roomReservationPage.isPaid.click();
        Thread.sleep(1000);
        roomReservationPage.saveButton.click();
    }

    @Then("verify the success message")
    public void verify_the_success_message() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(roomReservationPage.actualSuccessMessage.getText().contains("success"));
    }

    @Then("take the screenshot")
    public void take_the_screenshot() throws IOException {
//       I use this code to take a screenshot when needed
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
    }

}
