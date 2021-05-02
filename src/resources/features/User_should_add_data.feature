@dt
Feature:user should add data
  Scenario: data tables 1
    Given user is on the datatables page
    And use clicked on the new button
    When user enters the firstname
    When user enters the lastname
    When user enters the position
    When user enters the office
    When user enters the extension
    When user enters the startdate
    When user enters the salary
    And user clicks on the create button
    And user search for the first name
    Then verify the name field contains the firstname
    Then user closes the application