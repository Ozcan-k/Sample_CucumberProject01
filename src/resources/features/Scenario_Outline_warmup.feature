@smoke
Feature: search for multiple data
#  create ff
#  generate step defs
#  write the java code
#  London, Paris, Vienna, Berlin, Madrid

  Scenario Outline: searching the worlds capital
#    WE ALREADY HAVE READY STEP DEFS. NO NEED TO CREATE A NEW CODE!
    Given user is on the google page
    When user search for "<world capitals>"
    Then verify the result has "<world capitals>"
    Then user closes the application

  Examples: capitals
  |world capitals|
  |london        |
  |paris         |
  |vienna        |
  |madrid        |





