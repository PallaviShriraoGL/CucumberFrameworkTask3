Feature: PlaceOrder functionality test

  Scenario: Check PlaceOrder with valid credentials
    Given user is on PlaceOrderPage
    When clicks on Place Order button
    Then user is navigated to the FillForm page
     