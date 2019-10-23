package testcaseRunnerClass;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\featureFiles"},
		glue = {"testStepsDefinition"},
		monochrome = true,
		tags= {},
		plugin= {"pretty","html:target\\AppTestReport", "com.cucumber.listener.ExtentCucumberFormatter:target\\AppTestExtentReport\\AppExtentReport.html"}		
		)
public class MainTestCaseRunnerClass {
	
	@AfterClass	
	public static void generateExtentReport()
	{

		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\src\\main\\java\\appUtils\\appTestExtentReport.xml"));
	}

}
