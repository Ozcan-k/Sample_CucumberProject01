@dbcreate
Feature: Create hotel test
  Background: Connecting to the database
#    We are not using DB Utils
    Given user connects to the database with DBUtils

    Scenario: Creating new hotel
#      Below scenario we use DBUtils
      Given user creates a new hotel with a new data
      Then verify if the hotel is created

#NOTE THAT WE SHOULD USE DB UTILS OBJECTS INT HE ENTIRE FEATURE FILE SO WE DON'T GET NULL POINTER EXCEPTION
