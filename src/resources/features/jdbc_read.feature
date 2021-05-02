@dbread
Feature: Read Data
  Scenario: Reading Hotel Reservations
    Given user connects to the database
#    Prices = column name,    tHORELROOM = database name
    And user gets "Price" from "tHOTELROOM" table
    And user reads all rows in the "Price" column
    And users gets the value in row 2 in "Price" column and verifies the value is "4000.0000"
#    verify is the 5th data in the price column is 470.0000 or not
    And users gets the value in row 5 in "Price" column and verifies the value is "470.0000"