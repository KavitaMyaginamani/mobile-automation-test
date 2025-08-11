Feature: Login functionality
@smoke
  Scenario: User can Successfully login with valid credentials
  Given user is on the login page
  When user enters valid credentials
  Then user is navigated to the OTP verification screen
  When user enters the OTP
  And user taps the continue button
  Then user should be redirected to dashboard

