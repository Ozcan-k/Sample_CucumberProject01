package database_stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.sql.*;

public class DBRead_StepDefinititions {
    String url = "jdbc:sqlserver://184.168.194.58:1433;databaseName=crystalkeyhotels2;user=Ahmet_User;password=Ahmet123!";
    String username="Ahmet_User";
    String password="Ahmet123!";
    Connection connection;//To connect to the database
    Statement statement;//Will be user to write the queries
    ResultSet resultSet;//Will be used to get the data

    @Given("user connects to the database")
    public void user_connects_to_the_database() throws SQLException {
        connection= DriverManager.getConnection(url,username,password);
    }

    @Given("user gets {string} from {string} table")
    public void user_gets_from_table(String string, String string2) throws SQLException {
//      Create the statement to write the query
        statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//        write the query to get the data
//                                 SELECT Prices FROM tHOTELROOM;
        resultSet=statement.executeQuery("SELECT "+string+" FROM "+string2);

    }

    @Given("user reads all rows in the {string} column")
    public void user_reads_all_rows_in_the_column(String string) throws SQLException {
//        Now that we have results on the resultSet object, we can use that data
//        Skipping the first row
        resultSet.next();
//        Skipping the second row
        resultSet.next();

//        Getting the data on the current cell as an object
//        resultSet.getObject("Prices");
        Object object1=resultSet.getObject(string);
        System.out.println(object1);
        resultSet.next();
//        resultSet.getString("Price")
        String string1=resultSet.getString(string);
        System.out.println(string1);

        resultSet.next();
        String string2=resultSet.getString(string);
        System.out.println(string2);

//        resultSet.absolute(5);//GO TO ROW 5
//        resultSet.absolute(10);//GO TO ROW 10
//        resultSet.first();//GO TO FIRST ROW
//        resultSet.last();//GO TO LAST ROW


//      This runs while there is a data in the next row
        while(resultSet.next()){
            Object obj=resultSet.getObject(string);
            System.out.println(obj);
        }

    }

    @Given("users gets the value in row {int} in {string} column and verifies the value is {string}")
    public void users_gets_the_value_in_row_in_column_and_verifies_the_value_is(Integer int1, String string, String string2) throws SQLException {
//        System.out.println(int1);//2
//        System.out.println(string);//Price
//        System.out.println(string2);//4000.0000

//        Go to the row=int1
        resultSet.absolute(int1);
//        get teh data on that row
        Object dataInRow2=resultSet.getObject(string);
//        Assert if row2 data equals my expected data=string2
        Assert.assertEquals(string2,dataInRow2.toString());

    }
}
