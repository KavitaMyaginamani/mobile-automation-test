Feature: Login functionality
  @smoke
  Scenario: User can Successfully login with valid credentials
    Given user is on the login page
    When user enters valid credentials
    Then user is navigated to the OTP verification screen
    When user enters the OTP
    And user taps the continue button
    Then user should be redirected to dashboard
    And the user restarts the app

  @smoke
  Scenario Outline: Display error message for invalid username input
    Given user is on the login page
    When the user enters <username_status> username and <password_status> password
    Then the user should see the appropriate error message
    And the user restarts the app
    Examples:
      | username_status | password_status |
      | invalid         | valid           |
      | valid           | invalid         |
      | invalid         | invalid         |






