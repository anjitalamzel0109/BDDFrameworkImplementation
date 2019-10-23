package testStepsDefinition;

import java.io.IOException;

import appCommonMethods.CommonMethods;
import appUtils.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AppMasterHooks extends DriverFactory{
	
	@Before
	public void setUp() throws IOException
	{
		driver=getDriver();
	}
	
	@After
	public void tearDown(Scenario scenario)
	{
		try {
			
			if(driver != null && scenario.isFailed()) {
				//scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
				CommonMethods.captureScreenshot();
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
			
			if(driver != null) {
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
			
		} catch (Exception e) {
			System.out.println("Methods failed: tearDownAndScreenshotOnFailure, Exception: " + e.getMessage());
		}
	}

}
