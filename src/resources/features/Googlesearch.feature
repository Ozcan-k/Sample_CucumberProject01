#every feature file must start with feature key word
@googlesearch
Feature: user should find the related products on google search
  Background:
    Given user is on the google page

  @iphone
  Scenario: TC_01_iphone search
    When user search for iPhone
    Then verify the result has iPhone

  Scenario: TC_02_tea pot search
    When user search for tea pot
    Then verify the result has tea pot

  @flower
  Scenario: TC_03_flower search
    When user search for flower
    Then verify the result has flower

  @iphone @flower
  Scenario: TC_04_bmw search
    When user search for bmw
    Then verify the result bmw