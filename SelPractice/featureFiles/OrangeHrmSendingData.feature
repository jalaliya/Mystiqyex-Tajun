Feature: Login Feature for OrangeHRM
Scenario:To validate the login feature by giving the username and the  password
Given browser is the open
And User is on login page of the OrangeHRM
When User enters valid username "Admin" and password "password"
And clicks the login button
Then User should be taken to  thehomePage