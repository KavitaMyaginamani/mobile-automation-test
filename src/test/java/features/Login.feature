Feature: Login functionality
@smoke
  Scenario: Successful login with valid credentials
    Given user is on login page
    When user enters valid credentials
    Then user is on otp verification screen
    And user enters the OTP
    When user taps on continue button
    Then  user should be redirected to dashboard
   # And user logoff
