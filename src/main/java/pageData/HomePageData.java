package pageData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageData {
	
	public String expectedHomePageTitle = "Welcome: Mercury Tours";	
	public String expectedDashboardTitle = "Welcome back to Mercury Tours!123";	
	
	public @FindBy(xpath = "//a[contains(text(),'REGISTER')]") WebElement linkRegister;	
	public @FindBy(name = "userName") WebElement txtUsername;
	public @FindBy(name = "password") WebElement txtPassword;
	public @FindBy(name = "login") WebElement btnLogin;
	public @FindBy(xpath = "//b[contains(text(),'Welcome back')]") WebElement byDashboardTitle;
	
	
	

}
