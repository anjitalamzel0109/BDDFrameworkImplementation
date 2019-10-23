package appCommonMethods;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.cucumber.listener.Reporter;

import appUtils.DirectoryRepository;
import appUtils.DriverFactory;


public class CommonMethods extends DriverFactory {
	FileInputStream fis = null;
	Properties prop = new Properties();
	static String screenshotName = "";
	
	public void launchURL() throws IOException
	{
		String appUrl = getPropertiesFromAppConfig("url");
		driver.get(appUrl);
	}
	
	public String getPropertiesFromAppConfig(String propertyName) throws IOException 
	{
		fis = new FileInputStream(DirectoryRepository.APP_CONFIG_DIRECTORY);
		prop.load(fis);
		String propertyValue = prop.getProperty(propertyName);
		return propertyValue;
	}
	

	public void compareTwoStrings( String expectedStr,String actualStr)
	{
		Assert.assertEquals(expectedStr, actualStr);
	}

	public void webElementClick(WebElement webElement)
	{
		webElement.click();
	}
	
	public String generateRandomString(int strlength)
	{
		return (RandomStringUtils.randomAlphabetic(strlength).toUpperCase());
	}
	
	public String generateRandomAlphaNumericValue(int strlength)
	{
		return (RandomStringUtils.randomAlphanumeric(strlength).toString());
	}
	
	public String generateRandomNumericValue(int strlength)
	{
		return (RandomStringUtils.randomNumeric(strlength).toString());
	}
	
	public void enterInputValue(WebElement webelement,String inputValue)
	{
		webelement.sendKeys(inputValue);
	}
	
	public String getWebElementText(WebElement webelement)
	{
		return (webelement.getText());
	}
	
	/***EXTENT REPORT****************************************************************/
	public static String returnDateStamp(String fileExtension) {
		Date d = new Date();
		String date = d.toString().replace(":", "_").replace(" ", "_") + fileExtension;
		return date;
	}
	
	public static void captureScreenshot() throws IOException, InterruptedException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 screenshotName = returnDateStamp(".jpg");
	
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "\\output\\imgs\\" + screenshotName));
		
		Reporter.addStepLog("Taking a screenshot!");
		Reporter.addStepLog("<br>");
		Reporter.addStepLog("<a target=\"_blank\", href="+ returnScreenshotName() + "><img src="+ returnScreenshotName()+ " height=200 width=300></img></a>");
	}
	
	public static String returnScreenshotName() {
		return (System.getProperty("user.dir") + "\\output\\imgs\\" + screenshotName).toString();
	}
}
