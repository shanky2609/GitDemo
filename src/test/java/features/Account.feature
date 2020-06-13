Feature: Application login

@SmokeTest
Scenario: Home page default login
Given User is on landing page
When User login into application with "David" and password "1234"
Then Home page is populated
And Cards are displayed "true"



