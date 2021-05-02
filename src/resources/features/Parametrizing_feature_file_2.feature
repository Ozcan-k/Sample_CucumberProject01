@regression
Feature:user should add data
  Scenario Outline: data tables 1
    Given user is on the datatables page
    And use clicked on the new button
    When user enters the firstname "<firstname>"
    When user enters the lastname "<lastname>"
    When user enters the position "<position>"
    When user enters the office "<office>"
    When user enters the extension "<extension>"
    When user enters the startdate "<startdate>"
    When user enters the salary "<salary>"
    And user clicks on the create button
    And user search for the firstname "<firstname>"
    Then verify the name field contains the firstname "<firstname>"

    Examples: This is used to pass the test data
    |firstname|lastname|position|office |extension|startdate |salary|
    |john     |carrey  |teacher |newyork|123      |2021-03-20|50000 |
    |safiye   |buyukbayraktar|sdet|manhattan|435  |2021-03-20|120000|
    |badsfb   |bdfb      |sbdnn   |ndghm   |657  |2021-03-20 |56474567|
    |Sam      |waltom    |boss   |benton  |788 |2021-03-20 |9000000|