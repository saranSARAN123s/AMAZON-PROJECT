package C_PROJECT;


import org.junit.runner.RunWith;




import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions( features = "C:\\Users\\shara\\eclipse-workspace\\GOOGL\\src\\test\\java\\C_PROJECT\\TESTINGPAGE.feature",
 glue = {"STEPPACK"} , plugin = {"pretty", "html:target/testing-reports.html"})


public class RUNNERFILE {

}
