Feature: Search and Place Order for Products


Scenario: Search Experience for product search in both home and offers page

Given User is on the Green Landing page
When User searched with short name <Name> and expected actual name of the product
Then User searched for the "tom" shortname in offerspage to check if the product exist
Then validate product name in offerspage matches with landing page

Examples:
|Name|
|Tomato|
|Beet|