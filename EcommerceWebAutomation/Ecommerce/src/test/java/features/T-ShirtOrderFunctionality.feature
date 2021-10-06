Feature: Order an item
Scenario: Place an order of t-shirt and varify the order in order history
Given User has place an order of t-shirt
When User has confirm the payment for order
Then Order has been placed successfully
And Order is displayed in the order history page
