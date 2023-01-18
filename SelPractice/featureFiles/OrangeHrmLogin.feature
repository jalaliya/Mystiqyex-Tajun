Feature: Login Feature for OrangeHRM
Scenario:To validate the login feature by giving username and password
Given browser is open
And User is on login page of OrangeHRM
When User enters valid username  and password 
And clicks ogin button
Then User should be taken to homePage


