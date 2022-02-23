@SYMU-1083
Feature: the user should be able to login with valid credentials only

  @SYMU-1073
  Scenario: the user should be able to login with valid credentials by clicking on the Login Button
    Given the user logged in with valid credentials
    Then the user lands on the homepage

  @SYMU-1074
  Scenario: the user should be able to login with valid credentials by pressing on the Enter button on the keyboard
    Given the user logged in with valid credentials by pressing on the Enter button on the keyboard
    Then the user lands on the homepage

  @SYMU-1075
  Scenario Outline: the user should not be able to login with an invalid username and a valid password <username>
    Given the user puts an invalid "<username>" and a valid password
    Then the user gets the notice message wrong id or pw
    Examples:
      | username    |
      | employee81  |
      | asdf        |
      | symund      |

  @SYMU-1076
  Scenario Outline: the user should not be able to login with a valid username and an invalid password <password>
    Given the user puts a valid username and an invalid "<password>"
    Then the user gets the notice message wrong id or pw
    Examples:
      | password    |
      | employee123 |
      | asdf        |
      | symund      |

  @SYMU-1077
  Scenario: the user should not be able to login with a blank username and a valid password
    Given the user puts a blank username and a valid password
    Then the user gets the notice message blank

  @SYMU-1078
  Scenario: the user should not be able to login with a valid username and a blank password
    Given the user puts a valid username and a blank password
    Then the user gets the notice message blank

  @SYMU-1079 @asd
  Scenario: the user can see the password in a form of dots by default
    Given the user enters valid credentials
    Then the user sees the password in a form of dots by default

  @SYMU-1080 @wrt
  Scenario: the user can see the password explicitly if needed
    Given the user enters valid credentials
    And the user clicks on eye button
    Then the user sees the password explicitly

  @SYMU-1081
  Scenario: the user can see the "Forgot password?" link and can see the "Reset Password" button
  after clicking forgot password button
    Given the user sees forgot password link
    And the user clicks forgot password button
    Then the user sees reset password button

  @SYMU-1082
  Scenario: the user can see valid placeholders on Username and Password fields
    Given the user can see valid username placeholder
    Then the user can see valid password placeholder

