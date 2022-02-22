Feature: FillForm functionality test

  Scenario: Check FillFormPage with valid product
    Given user is on FillForm page
    When  user enters Name and Country and City and CreditCard and Month and Year 
    And clicks on purchase button
    Then user is navigated to the Thank Message Page
   