Feature: Add to WishList

Scenario: Verify the Add to WishList 
Given Navigate to Url
When Log In with Valid Username and Password
And Click On Sofa Under Living Section
And Click on Chelsea Sofa 
And Click On Add to WishList Icon
Then Click On WishList Icon
And Verify the Item in Wishlist 
And Close Browser