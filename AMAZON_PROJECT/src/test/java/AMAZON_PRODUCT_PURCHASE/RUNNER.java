package AMAZON_PRODUCT_PURCHASE;


import org.junit.runner.RunWith;




import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions( features = "C:\\Users\\shara\\eclipse-workspace\\GOOGL\\src\\test\\java\\AMAZON_PRODUCT_PURCHASE\\PURCHASE.feature",
 glue = {"AMAZON_PRODUCT_PURCHASE"} , plugin = {"pretty", "html:target/AMAZON-reports.html"})



public class RUNNER {

}
