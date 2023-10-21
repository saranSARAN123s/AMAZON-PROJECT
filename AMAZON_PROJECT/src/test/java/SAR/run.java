package SAR;



import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions( features = "C:\\Users\\shara\\eclipse-workspace\\GOOGL\\src\\test\\java\\SAR\\browseropen.feature",
strict = true,monochrome = true, glue = {"SAR"} , plugin = {"pretty", "html:target/browser-reports.html"})

public class run {

}
