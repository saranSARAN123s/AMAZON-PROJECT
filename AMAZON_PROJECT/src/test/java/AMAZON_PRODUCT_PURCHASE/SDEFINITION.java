package AMAZON_PRODUCT_PURCHASE;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SDEFINITION extends BASE{
	
	
	WEBELE EL ;

@Given("User tries to launch the browser with the url")
public void user_tries_to_launch_the_browser_with_the_url() {
	
  BASE.brwsr_launch();
   
}
@Then("USer tries to search the product and found it")
public void u_ser_tries_to_search_the_product_and_found_it() {
	EL = new WEBELE();
	
	EL.search_oneplus();
	
    
}
@And("user buys the product with required quantity")
public void user_buys_the_product_with_required_quantity() {
	EL = new WEBELE();
	
	EL.select_quantity_and_buy();
	
   
}
@Then("user tries to login their amazon account and directed to checkout page")
public void user_tries_to_login_their_amazon_account_and_directed_to_checkout_page() {
    
	EL = new WEBELE();
	
	EL.entering_valid_credentials();
	
}
@And("the browser needs to be closed")
public void the_browser_needs_to_be_closed() {
	BASE.browser_close();
    
}
}
