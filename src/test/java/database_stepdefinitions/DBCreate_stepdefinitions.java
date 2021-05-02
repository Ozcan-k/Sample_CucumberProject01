package database_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

public class DBCreate_stepdefinitions {

    @Given("user connects to the database with DBUtils")
    public void user_connects_to_the_database_with_DBUtils() {
//        Connecting to the database using ready codes from DBUtils class that we created
        DBUtils.createConnection();
    }

    @Given("user creates a new hotel with a new data")
    public void user_creates_a_new_hotel_with_a_new_data() {
        //INSERT INTO table_name (column1, column2, column3, ...) VALUES (value1, value2, value3, ...);

        //table_name = tHOTEL
        String create="INSERT INTO tHOTEL (Code,       Name,           Address,       Phone,     Email,              CreateDate,       CreateUser) " +
                                 "VALUES ('1000', 'TEST HOTEL', 'new address', '7347377', 'test@testemail.com', '2020-12-11 13:38:47.597',4)";

//        Executind the query using ready codes from DBUtils class that we created
        DBUtils.executeQuery(create);

    }

    @Then("verify if the hotel is created")
    public void verify_if_the_hotel_is_created() {

        //We are going to verify if teh hotel we just created is actually being created

        //Read the table and check if the Name column in the Hotel table contains NEW BEST HOTEL

        //1. Read the Name from the Hotel table

//        QUERY
        String read="SELECT Name FROM tHOTEL";

        //2. get that Name column data. We have this in our DBUtils class

        //Let's get all Name column data

//        Getting Name column Data in the List of object, and checking if the list has "NEW BEST HOTEL" value
        Assert.assertTrue(DBUtils.getColumnData(read,"Name").toString().contains("TEST HOTEL"));


    }

}
