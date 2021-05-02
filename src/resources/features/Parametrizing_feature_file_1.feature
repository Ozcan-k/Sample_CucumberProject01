@regression
Feature:user should add data
  Scenario: TC_01_data tables 1
    Given user is on the datatables page
    And use clicked on the new button
    When user enters the firstname "john"
    When user enters the lastname "carrey"
    When user enters the position "teacher"
    When user enters the office "newyork"
    When user enters the extension "123"
    When user enters the startdate "2021-03-20"
    When user enters the salary "500000"
    And user clicks on the create button
    And user search for the firstname "john"
    Then verify the name field contains the firstname "john"

    Scenario: TC_02_testing with new test data
      Given user is on the datatables page
      And use clicked on the new button
      When user enters the firstname "safiye"
      When user enters the lastname "buyukbayraktar"
      When user enters the position "sdet"
      When user enters the office "manhattan"
      When user enters the extension "435"
      When user enters the startdate "2021-03-20"
      When user enters the salary "500000"
      And user clicks on the create button
      And user search for the firstname "safiye"
      Then verify the name field contains the firstname "safiye"

     Scenario: TC_03_testing with the new data
       Given user is on the datatables page
       And use clicked on the new button
       When user enters the firstname "badsfb"
       When user enters the lastname "bdfb"
       When user enters the position "sbdnn"
       When user enters the office "ndghm"
       When user enters the extension "657"
       When user enters the startdate "2021-03-20"
       When user enters the salary "56474567"
       And user clicks on the create button
       And user search for the firstname "badsfb"
       Then verify the name field contains the firstname "badsfb"

  Scenario: TC_04_testing with the new data
    Given user is on the datatables page
    And use clicked on the new button
    When user enters the firstname "Sam"
    When user enters the lastname "waltom"
    When user enters the position "boss"
    When user enters the office "benton"
    When user enters the extension "788"
    When user enters the startdate "2021-03-20"
    When user enters the salary "9000000"
    And user clicks on the create button
    And user search for the firstname "Sam"
    Then verify the name field contains the firstname "Sam"