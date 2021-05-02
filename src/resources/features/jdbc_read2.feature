@dbread2
Feature: Read Data
  Scenario: Reading Hotel Reservations
    Given user connects to the database
#    Email = column name,    tHOTEL = Table name
    And user gets "Email" from "tHOTEL" table
    And user reads all rows in the "Email" column
    And users gets the value in row 2 in "Email" column and verifies the value is "email2"
#    verify is the 5th data in the price column is 470.0000 or not
    And users gets the value in row 5 in "Email" column and verifies the value is "test@testemail.com"