Feature: AddToCart functionality test

  Scenario: Check AddToCartPage with valid credentials
    Given user is on AddToCart page
    When clicks on addToCartLink
    And handles the alert
    Then user is navigated to the PlaceOrderpage