Feature: To validate the Sign In functionality of 

Scenario: Login with a valid Email and valid password
Given To launch the chrome and maximize the window
When To launch the URL of the Netflix
And To pass a valid Email in the Email field
And To pass an Invalid password in the password field
And To click the Sign In button 
And To check whether to navigate to the home page or not
Then To close the browser

Scenario Outline: To validate the Combinations
Given User launch the chrome and maximize the window
When launch chrome URL
And pass the data "<emails>" in Email field
And pass the data "<passwords>" in password field
And click the signIn button
Then close the browser

Examples:
|emails                   |passwords|
|velmurganece@smvec.ac.in |123456jr |
|btechece@smvec.ac.in     |         |
|velan@12345              |02847850 |
|                         |74744444 |
|                         |         |
|velmurugan90@gmail.com   |vel@86747|