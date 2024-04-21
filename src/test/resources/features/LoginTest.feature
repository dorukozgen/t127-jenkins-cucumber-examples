Feature: As a user, I should be able to login to the website.

  Scenario: User logs in with correct credentials
    Given User opens the website
    When User enters correct username and password
    Then User should be logged in successfully

  @smoke
  Scenario: User logs in with incorrect credentials
    Given User opens the website
    When User enters incorrect username and password
    Then User should not be logged in successfully