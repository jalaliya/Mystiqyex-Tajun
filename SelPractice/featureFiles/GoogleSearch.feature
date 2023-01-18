Feature: Google search functionality
Scenario: Validate Google Search is Working

Given browser is open
And User is on Google Page
when the User types in search box
and clicks search button
Then Search results are displayed


