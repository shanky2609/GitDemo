Feature: Search and place order 
@SeleniumTest
Scenario: Search for item and validate result
Given User is on Greenkart
When User searched for  "Cucumber" Vegetable
Then "Cucumber" results are displayed


@SeleniumTest
Scenario: Search for item and then move to checkout page
Given User is on Greenkart
When User searched for  "Brinjal" Vegetable
And Added items to cart
And User proceeded to Checkout page for purchase
Then verify selected "Brinjal" items are displayed in Check out page.



