Feature: Login functionality of Leaftaps application

Scenario: Login function with valid credentials

And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then It should be logged in

Scenario: Login with invalid credentials

And Enter the username as 'Demo'
And Enter the password as 'crm'
When Click on Login button
But It should error message