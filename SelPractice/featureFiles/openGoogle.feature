Feature: This is to test Google search

  Scenario: Google Search Scenario
    Given user is entering google.co.in
    When user is typing the search term
    And enters the return Key
    Then the user should see the search results
