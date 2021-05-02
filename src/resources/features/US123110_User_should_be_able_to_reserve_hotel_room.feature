@dttables
Feature: Room Reservation
  Scenario: user should make a reservation
    Given user is on the log in page
    Then take the screenshot
    And user enters username and password
    |manager|Manager2!|
    And user clicks on the login button
    And user goes to room reservation page
    And enter all required fields and click save button
    |price|date_start|date_end  |adult|children|contact_name|contact_phone|contact_email |notes  |
    |400  |02/10/2021|02/14/2021|2    |3       |john        |9999999999   |test@email.com|Testing|
    Then verify the success message
    Then take the screenshot
    Then user closes the application


