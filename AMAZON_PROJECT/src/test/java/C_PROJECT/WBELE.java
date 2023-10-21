package C_PROJECT;

import org.openqa.selenium.By;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WBELE extends TBSE {
	
	
	 @FindBy(name= "username")
	 public WebElement ussername;
	 
	 @FindBy(id = "password")
	 public WebElement passsword;
	 
	 @FindBy(id="submit")
	 public WebElement subbmit;
	 
	 @FindBy(css=("#loop-container > div > article > div.post-header > h1"))
	 public WebElement ccheck;
	
	
 
	
	

 public WBELE()
 {
	 PageFactory.initElements(driver, this);
 }
	

	
	
   
	public  void enter_details () {

		
	
		
		
		

		
		ussername.sendKeys("student");
		 
		 passsword.sendKeys("Password123");
		 
		 subbmit.click();
	}
	
	public  void checking () {
		
		
		String c = ccheck.getText();
		
		
		
		 if (c.equals("Logged In Successfully"))
		 {
			 System.out.println("Test is passed");
		 }
		 else {
			 System.out.println("Test is failed ");
		 }
	}
}
