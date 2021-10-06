Feature: My Account
Scenario: User is able to update the Personal Details in My Account Page
Given Browse the Ecommerse website "http://automationpractice.com/index.php"
And User is signed in to EcommerceWeb with username "SeleniumTesting@gmail.com" and password "Selenium123."
And Navigate to my account personal information update page
When User has to update the first name "Neha" on my account personal information page
Then first name on my account has been updated successfully

