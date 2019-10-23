Feature: Verify App Login with different user credentials

Scenario: Successful App Url Launch
Given I enter the App url 
And I land to Homepage
And I enter valid username
And I enter valid password 
When I click on Login button
Then I should land to Dashboard page


Scenario: Successful App Url Launch Invalid
Given I enter the App url 
And I land to Homepage
And I enter valid username
And I enter valid password 
When I click on Login button
Then I should land to Dashboard page