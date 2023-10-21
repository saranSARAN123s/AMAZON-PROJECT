package SAR;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class def extends TBASE {
	
	//public static WebDriver driver;
	

	


@Given("User tries to launch the browser with the url")
public void user_tries_to_launch_the_browser_with_the_url() {
	TBASE.initializebrowser();
	
    
}

@When("USer tries to login")
public void u_ser_tries_to_login() {
	TBASE.login();
	
    
}

@Then("Loin should be successfull")
public void loin_should_be_successfull() {
	TBASE.checking();
	
    
}

@Then("Browser needst to closed")
public void browser_needst_to_closed() {
	
	TBASE.close();
	
    
}

}
