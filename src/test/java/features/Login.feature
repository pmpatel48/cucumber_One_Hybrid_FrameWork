Feature: Amazon Login Page validation 

Background:
Given User Validate the Browser
When User Triggered the Browser
Then User check browser invoking successfully or not


Scenario Outline: Amazon Login Page Validation for valid users
Given User Landed on Amazon Home Page
When User Click on SignIn Option at Amazon Home Page
Then SignIn Page is Displayed
When User enter <email> and <password> 
And Click on SignIn Button
Then Amzon Account home page is displayed for valid user
And User checked the account and click on signout button
And User closed the browser



Examples:


|email					 |password	 |
|priyankpatel48@yahoo.com|shankerji48|
|shekhapatel@ymail.com   |shankerji48|



Scenario: Amazon Login page Validation for valid or invalid user with incorrect email or phone number 
 Given User Landed on Amazon Home Page
 When User Click on SignIn Option at Amazon Home Page
Then SignIn Page is Displayed
When User Enter incorrect email Address "priyankpatel@yahoo.com"
And Click on continue button
Then we cannot find account error message is displayed on the screen 
And User closed the browser



Scenario: Amazon Login page Validation for valid or invalid user where email or phone number field is blank 
 Given User Landed on Amazon Home Page
 When User Click on SignIn Option at Amazon Home Page
Then SignIn Page is Displayed
When User Enter blank email Address ""
And Click on continue button
Then Enter your email address or phone number error message is displayed on the screen 
And User closed the browser





 
 Scenario: Amazon Login page Validation for valid user with incorrect password
 Given User Landed on Amazon Home Page
 When User Click on SignIn Option at Amazon Home Page
Then SignIn Page is Displayed
When User Enter email Address "priyankpatel48@yahoo.com" and password "priyank123"
And Click on SignIn Button
Then forgot password link is displayed on the page
And important message is also displayed 
And User closed the browser




Scenario: Amazon Login page Validation for valid user with blank password
 Given User Landed on Amazon Home Page
 When User Click on SignIn Option at Amazon Home Page
Then SignIn Page is Displayed
When User Enter email Address "priyankpatel48@yahoo.com" and password ""
And Click on SignIn Button
Then Enter your password error message is dispalyed on the page
And User closed the browser





  