Feature: Amazon Login

  Scenario: Positive testing
    Given user lands on Amazon Page
    When User enters username
    And User enters password
    And User click login button
    Then User should be able see home page

  Scenario: Nagative testing
    Given user lands on Amazon Page
    When User enters invalid username
    And User enters password
    And User click login button
    Then User should be able see home page
