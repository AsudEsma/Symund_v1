@wip
Feature: the user should be able to login with valid credentials
  @SYMU-1073
  Scenario: the user should be able to login with valid credentials by clicking on the Login Button
    Given the user logged in with valid credentials by clicking on the Login Button
    Then the user lands on the homepage

  @SYMU-1074
  Scenario: the user should be able to login with valid credentials by pressing on the Enter button on the keyboard
    Given the user logged in with valid credentials by pressing on the Enter button on the keyboard
    Then the user lands on the homepage

  @SYMU-1075
  Scenario: the user should not be able to login with an invalid username and a valid password
    Given the user puts an invalid username and a valid password
    Then the user gets the warning message