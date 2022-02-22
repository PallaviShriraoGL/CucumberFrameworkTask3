Feature: HomePage functionality test

  Scenario: Check HomePage with valid credentials
    Given user is on home page
    When user scrollTo Product
    And clicks on ProductLink
    Then user is navigated to the AddToCart page