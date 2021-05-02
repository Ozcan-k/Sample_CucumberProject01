@seleniumgrid
Feature: Verify the application title
  Scenario: Verify the title on chrome
    Given user is on the application page on chrome
    Then verify the title included Crystalkey

#    RUN THE CODE IN FIREFOX
#    MY DESIRED CAPABILITIES CONFIGURATION WILL BE FOR FIREFOX
  Scenario: Verify the tile on firefox
    Given user is on the application page on firefox
    Then verify the title included Crystalkey