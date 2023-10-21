package STEPPACK;



import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import C_PROJECT.TBSE;
import C_PROJECT.WBELE;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class STEPCLS extends TBSE {

	
	
	
	WBELE W;
	

	
	@Given("User tries to launch the browser with the url")
	public static void user_tries_to_launch_the_browser_with_the_url() {
		
		TBSE.browser_launch();
	   
	}
	@Then("USer tries to login")
	public  void u_ser_tries_to_login() {
		
		W = new WBELE();
		W.enter_details();
		
		
		
		
	    
	}
	@And("Login should be successfull")
	public  void login_should_be_successfull() {
		
		W = new WBELE();
		W.checking();
		
		
	}
		
		
		

	@Then("Browser needs to be closed")
	public   void browser_needs_to_be_closed() {
		TBSE.brwser_close();
		
		
	   
	}


}
