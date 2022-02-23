@SYMU-1020
Feature: The user should be able to log out and land on the login page

  Background:
    Given the user logged in with valid credentials

  @SYMU-1018
  Scenario: The user can log out and ends up on the login page
    And the user clicks on the avatar icon
    When the user clicks on logout button in the dropdown menu
    Then the user logged out and returns to the login page

  @SYMU-1019
  Scenario: The user can not go to the homepage by clicking on the back button after successfully logged out
    And the user clicks on the avatar icon
    When the user clicks on logout button in the dropdown menu
    And the user clicks on the back button after logout
    Then the user can not go to the home page after successfully logged out