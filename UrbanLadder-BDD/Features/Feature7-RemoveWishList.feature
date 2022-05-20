Feature: Remove from WishList

Scenario: Verify the Remove from Wishlist
Given Navigate to Url
When Log In with Valid Username and Password
And Click On WishList Icon
Then Remove Item From WishList
And Close Browser
