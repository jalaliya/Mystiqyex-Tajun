Feature: To test login functionality

  Scenario Outline: 
    To validate whether login is successful the

    Given browser is the open condition the
    And User is on Login Page the
    When User  the enters <username> and <password> the
    And clicks Login button the
    Then user is navigated to home page the

    Examples: 
      | username | password |
      | Tajun    |    12345 |
      | Hasna    |    12345 |
      | haaniya  |    12345 |
      | sana     |    12345 |
