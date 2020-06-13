Feature: Application login


@Regtest
Scenario: Home page default login
Given User is on landing page
When User login into application with "David" and password "1234"
Then Home page is populated
And Cards are displayed "true"

@SmokeTest
Scenario: Home page default login
Given User is on landing page
When User login into application with "john" and password "4321"
Then Home page is populated
And Cards are displayed "false"

@MobileTest
Scenario Outline: Home page default login
Given User is on landing page
When User login into APP with <Username>and password <password>
Then Home page is populated
And Cards are displayed "true"

Examples:
|Username |password|
|User1    |pass1   |
|User2    |pass2   |
|User3    |pass3   |
|User3    |pass4   |
