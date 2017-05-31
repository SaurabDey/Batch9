Feature:  I want to test Traco

@run
Scenario: Login Functionality
Given I have Tracko Url
When I enter username and password
Then I should login


Scenario: create Account
Given I have Tracko Url
When I will enter 9867605559, 1234, Saurab and Pass123
Then I shoudld create an account

 
Scenario: create Account
Given I have Tracko Url
When I will enter 8087540647, 7676, Gaurav and Pass233
Then I shoudld create an account