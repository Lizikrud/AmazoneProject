Feature: Amazon Login

  @run
  Scenario: User should be able to login to AMAZONE with valid credentials
    Given user lands on Amazon Page
    When User enters username
    And clicks on continue button
    And User enters  password
    And clicks on Sign in button
    Then User should be able see home page

#  @negative
#  Scenario Outline: Negative testing
#    When User enters invalid username
#    And User enters password
#    And User click login button
#
#    Examples:
#      | username  | password   | errorMessage
#      | t62       | 1q2w3e4rt5 | Your username is incorrect