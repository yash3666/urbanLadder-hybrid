Feature: Remove From Cart

Scenario: Verify the Remove From Cart
Given Navigate to Url
When Log In with Valid Username and Password
And Click On Cart Icon
Then Remove the Item From Cart
And Close Browser