@Suite @Login

Feature:Login As a business analyst I need to log in to
  the website with my access credentials.

  Scenario: 1- Log in successfully
    Given Since the user navigates to the login page
    When you enter the correct access credentials
    Then you should see the main page

    Scenario: 2- click on recruitment
      Given click on recruitment
      When click on recruitment and fill in the candidate's detail
      Then candidate data is saved

    Scenario: 3- fill out form
      Given writes names and dates

    Scenario: 4 - click saved
      Given saved information


