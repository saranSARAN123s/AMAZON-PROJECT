@T3
Feature: LOGIN

  Scenario: Successfull LOGIN WITH CREDENTIALS
     Given User tries to launch the browser with the url 
    Then USer tries to login
    And Login should be successfull
    Then Browser needs to be closed  
