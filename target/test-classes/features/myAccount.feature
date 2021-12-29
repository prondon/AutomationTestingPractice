Feature: My Account Log-in Functionality
  This feature file contains scenarios that test the log-in functionality on the My Account page

Background: Open the browser and take the User to the My Account page
Given User opens the browser
When User navigates to “http://practice.automationtesting.in/”
And clicks on the My Account menu tab

Scenario: Log-in with valid username and password.

Given User enters registered username in username textbox
And enters password in password textbox
And clicks on login button
Then User must successfully login to the web page
    
Scenario Outline: Log-in with incorrect username and incorrect password.

Given User enters incorrect username <username> in username textbox
And enters incorrect password <password> in password textbox.
And clicks on login button
Then proper error <error> must be displayed (ie Invalid username) and prompt to enter login again

Examples:
|username|password|error|
|"xyzmouse"|"kitten"|"Invalid username"|

Scenario Outline: Log-in with correct username and empty password.

Given User enters registered username in username textbox
And enters empty password <password> in the password textbox
And clicks on login button
Then proper error <error> must be displayed (ie Invalid password) and prompt to enter login again


Examples:
|username|password|error|
||""|"Password is required"|
  
Scenario Outline: Log-in with empty username and valid password.

Given User enters empty username <username> in username textbox
And enters password in password textbox
And clicks on login button
Then proper error <error> must be displayed (ie Invalid username) and prompt to enter login again

Examples:
|username|password|error|
|""||"Username is required"|
  
Scenario Outline: Log-in with empty username and empty password.

Given User enters empty username <username> in username textbox
And enters empty password <password> in the password textbox
And clicks on login button
Then proper error <error> must be displayed (ie required username) and prompt to enter login again

Examples:
|username|password|error|
|""|""|"Username is required"|
  
Scenario Outline: Login-Handles case sensitive.

Given User enters the case changed username in username textbox
And enters the case changed password in the password textbox
And clicks on login button
Then login must fail saying incorrect username/password <error>.

Examples:
|username|password|error|
|""|""|"incorrect"|

@current
Scenario Outline: Login Authentication

Given User enters registered username in username textbox
And enters password in password textbox
And clicks on login button
And cnce your are logged in, sign out of the site
And press back button
Then User shouldn’t be signed in to his account rather a general webpage must be visible <message>

Examples:
|username|password|message|
|""|""|"Login"|