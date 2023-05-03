Feature: login into Application

Scenario Outline: positive test validating login
Given: Inilitize the browser with chrome
And: navigate to "http://www.qaclickacademy.com/" site
And: Click on Login link in home page to land on secure sign in page
When: Enter <username> and <password> and gets log in
Then: Verify the user is successfully logged in
And: close broswer


Examples:

|username         | password  |
|hello@gmail.com  | password1 |
|hello2@gmail.com | password2 |





