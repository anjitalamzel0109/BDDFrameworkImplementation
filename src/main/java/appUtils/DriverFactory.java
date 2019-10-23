package appUtils;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public static WebDriver driver;

	public WebDriver getDriver() throws IOException {
		
	try {	
		
			FileInputStream fis = new FileInputStream(DirectoryRepository.APP_CONFIG_DIRECTORY);
			Properties prop = new Properties();
			prop.load(fis);
			String strBrowser = prop.getProperty("browser");

		
			switch (strBrowser) 
			{
		
				case "chrome": 
					if (driver == null) 
					{
						System.setProperty("webdriver.chrome.driver", DirectoryRepository.CHROME_DRIVER_DIRECTORY);
						driver = new ChromeDriver();
					}
					break;
		

				case "firefox":
					if (driver == null) 
					{
						System.setProperty("webdriver.gecko.driver", DirectoryRepository.FIREFOX_DRIVER_DIRECTORY);
						driver = new FirefoxDriver();
					}
					break;
			}
		}
	
			catch (Exception e)
			{
				System.out.println("Unable to launch browser" + e.getMessage());
			}
	
			finally
			{
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
			}
	
		return (driver);

		}

	}


