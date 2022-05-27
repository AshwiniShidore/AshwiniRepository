Feature: Login Functionality

Background: User successfully clicked on Initial Login window
When user open "Chrome" browser with exe "D:\\Automation testing support\\chromedriver.exe"
When user open url as "https://www.flipkart.com/"
When user cancle initial Login window

Scenario: Login functionality by using valid credentials
When user navigate on Login button
When user click on MyProfile
When user enter "9130055002" as username
When user enter "ashupavi" as password
When user click on Login button
Then Application shows user profile to user
Then browser close


Scenario: Login functionality by using invalid username in UC and valid password
When user navigate on Login button
When user click on MyProfile
When user enter "ABCDS" as username
When user enter "ashupavi" as password
When user click on Login button
Then Application shows appropriate error message
Then browser close

Scenario: Login functionality by using valid username and invalid password in UC
When user navigate on Login button
When user click on MyProfile
When user enter "9130055002" as username
When user enter "ABCD@321" as password
When user click on Login button
Then Application shows appropriate error message
Then browser close
