@smoke
Feature: Login functionality

  Scenario: User can Successfully login with valid credentials
    Given user is on the login page
    When user enters valid credentials
    Then user is navigated to the OTP verification screen
    When user enters the OTP
    And user taps the continue button
    Then user should be redirected to dashboard
    And the user logged out of the app

  Scenario Outline: Verify error message for invalid credentials
    Given user is on the login page
    When the user enters <username_status> username and <password_status> password
    Then the user should see the appropriate error message
    And the user restarts the app
    Examples:
      | username_status | password_status |
      | invalid         | valid           |
      | valid           | invalid         |
      | invalid         | invalid         |

  Scenario: User should be navigates to the Register page and back to the Login page
    Given user is on the login page
    When user sees Register Link on the Login page
    And the user clicks on Register link
    Then the Register Page should be displayed
    When the user clicks the Back button on the Register Page
    Then the Login Page should be displayed

  Scenario: User toggles password visibility on the Login Page
    Given user is on the login page
    When the user enters a password in the password field
    Then the password should be masked
    When the user clicks the eye icon
    Then the password should be visible