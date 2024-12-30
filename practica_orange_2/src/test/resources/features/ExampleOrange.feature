
Feature:Login As a business analyst I need to log in to
  the website with my access credentials.

  Scenario: Log in successfully
  Since the user navigates to the login page
    When you enter the correct access credentials
    Then you should see the main page