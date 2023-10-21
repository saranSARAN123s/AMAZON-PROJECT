package C_PROJECT;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TBSE {
	
	static WebDriver driver;
	
	
	public static void browser_launch () {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shara\\eclipse-workspace\\GOOGL\\src\\test\\resources\\BROWSER\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	
	driver.manage().window().maximize();
	
	driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	public static void brwser_close () {
		driver.quit();
	}
		
	}
	


