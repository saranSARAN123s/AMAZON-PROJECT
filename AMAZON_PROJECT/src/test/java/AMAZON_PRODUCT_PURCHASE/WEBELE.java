package AMAZON_PRODUCT_PURCHASE;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WEBELE extends BASE  {
	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement search;
	
	@FindBy(xpath="//span[contains(text(),'OnePlus Bullets Z2 Bluetooth Wireless in Ear Earphones with Mic, Bombastic Bass, 10 Mins Charge - 20 Hrs Music, 30 Hrs Battery Life (Acoustic Red)')]")
	WebElement search_product;
	
	@FindBy(xpath="//select[@id='quantity']")
	WebElement quantity;
	
	@FindBy(xpath="//input[@id='buy-now-button']")
	WebElement buynow;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement num_input;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(id="ap_password")
	WebElement password_input_box;
	
	@FindBy(id="signInSubmit")
	WebElement password_click_button;
	
	String searchproduct ="oneplus headphones";
	
	String number ="8778868414";
	
	String amazonpass = "THEdarkknight007";
	
	public WEBELE()
	 {
		 PageFactory.initElements(driver, this);
	 }
		
	
	
	public  void search_oneplus () {
		
		search.sendKeys(searchproduct);
		search.sendKeys(Keys.ENTER);
		
		JavascriptExecutor s = (JavascriptExecutor)driver;


		s.executeScript("window.scrollBy(0,1000)");
		
		
		search_product.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;


		js.executeScript("window.scrollBy(0,1000)");
		
		
		
		
			
		}
	public void select_quantity_and_buy() {
		
		Set <String> s = driver.getWindowHandles();
		ArrayList ar = new ArrayList (s);
		//System.out.println(ar.get(0));
		//System.out.println(ar.get(1));
		
		driver.switchTo().window((String)ar.get(1));

		JavascriptExecutor js = (JavascriptExecutor)driver;


		js.executeScript("window.scrollBy(0,1000)");
		
	
		
		Select drpvar = new Select(quantity);
		drpvar.selectByIndex(2);
		
		buynow.click();
		
		
	}
	public void entering_valid_credentials () {
		
		num_input.sendKeys(number);
		continue_button.click();
		
		password_input_box.sendKeys(amazonpass);
		
		password_click_button.click();
		
		
		
		
		
	
		
			}
	
	

}
