Feature: SignUp functionality test

  Scenario Outline: Check SignUp with valid credentials
    Given user is on Main page
    When  user enters "<uname>" and "<pass>"
    And clicks on signUp button
    Then user is navigated to the Main page
   Examples:
   |uname            |pass  |
   |GLPallaviS1		 |GlobalLogic1|