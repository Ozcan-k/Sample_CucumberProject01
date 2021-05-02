@regression
Feature: User should find related product on google search
  Background: going to the google home page
    Given user is on the google page

  Scenario: TC_01_iphone search
    When user search for "i love cucumber"
    Then verify the result has "i love cucumber"

  Scenario: TC_02_apple search
    When user search for "carrot"
    Then verify the result has "carrot"

  Scenario: TC_03_flower search
    When user search for "banana"
    Then verify the result has "banana"

  Scenario: TC_04_orange search
    When user search for "orange"
    Then verify the result has "orange"