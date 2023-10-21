@T
Feature: purchase

  Scenario: SUCCESSFULL PURCHASE WITH VALID CREDENTIALS
  
     Given User tries to launch the browser with the url 
     
    Then USer tries to search the product and found it
    
    And user buys the product with required quantity
    
    Then user tries to login their amazon account and directed to checkout page
    
    And the browser needs to be closed
    
    
