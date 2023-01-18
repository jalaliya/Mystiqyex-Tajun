Feature: To test login functionality

  Scenario: To validate whether login is successful
    Given browser is the open condition
    And User is on Login Page
    When User  the enters username "Tajun" and password "12345"
    And clicks Login button
    Then user is navigated to home page
