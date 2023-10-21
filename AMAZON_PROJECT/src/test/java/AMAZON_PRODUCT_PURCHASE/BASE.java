package AMAZON_PRODUCT_PURCHASE;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BASE {
	
	static  WebDriver driver;
	
	public static void brwsr_launch () {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\shara\\eclipse-workspace\\GOOGL\\src\\test\\resources\\BROWSER\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
	public static void browser_close () {
		driver.quit();
	}
	
	

}
