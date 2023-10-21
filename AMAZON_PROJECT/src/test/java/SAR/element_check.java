package SAR;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class element_check {
	
static WebDriver driver;

	@Test
	public  void initializebrowser ()  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shara\\eclipse-workspace\\GOOGL\\src\\test\\resources\\BROWSER\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
	
	driver.manage().window().maximize();
	
	driver.get("https://practicetestautomation.com/practice-test-login/");
	
	WebElement username = driver.findElement(By.id("username"));
	WebElement password = driver.findElement(By.id("password"));
	WebElement submit =  driver.findElement(By.id("submit"));
	WebElement check =    driver.findElement(By.cssSelector("#loop-container > div > article > div.post-content > p.has-text-align-center"));
	
	 
	username.sendKeys("student");
	 
	 password.sendKeys("Password123");
	 
	 submit.click();
	 String p = check.getText();
	 if (p.equals("Congratulations student. You successfully logged in!"))
	 {
		 System.out.println("Test is passed");
	 }
	 else {
		 System.out.println("Test is failed ");
	 }
	

}
}
