package SAR;






import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TBASE {
	
static WebDriver driver;

	
	public static  void initializebrowser ()  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shara\\eclipse-workspace\\GOOGL\\src\\test\\resources\\BROWSER\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
	
	driver.manage().window().maximize();
	
	driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	
	public static void login() {
	
	driver.findElement(By.id("username")).sendKeys("student");
	
	driver.findElement(By.id("password")).sendKeys("Password123");
	
	driver.findElement(By.id("submit")).click();}
	
	
	public static void checking() {
	
	String check = driver.findElement(By.cssSelector("#loop-container > div > article > div.post-header > h1")).getText();
	System.out.println(check);
	
	 if (check.equals("Logged In Successfully"))
	 {
		 System.out.println("Test is passed");
	 }
	 else {
		 System.out.println("Test is failed ");
	 }
 }
	public static void close () {
		driver.quit();
	}
	}	
