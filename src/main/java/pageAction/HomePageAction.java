package pageAction;

import org.openqa.selenium.support.PageFactory;

import appCommonMethods.CommonMethods;
import appUtils.DriverFactory;
import pageData.HomePageData;

public class HomePageAction extends DriverFactory{
	
	HomePageData objHomePageData = PageFactory.initElements(driver, HomePageData.class);
	CommonMethods objCommonMethods = new CommonMethods();
	
	/*Assert*/
	public void verifyHomePageTitle()
	{
		
		objCommonMethods.compareTwoStrings(objHomePageData.expectedHomePageTitle, driver.getTitle());
	}
	public void verifyDashboardPage()
	{
		String actualDashboardText = objCommonMethods.getWebElementText(objHomePageData.byDashboardTitle);
		objCommonMethods.compareTwoStrings(objHomePageData.expectedDashboardTitle,actualDashboardText );
	}
	
	
	/*Click*/
	public void clickRegisterLink()
	{		
		objCommonMethods.webElementClick(objHomePageData.linkRegister);
	}
	
	public void clickLoginButton()
	{
		objCommonMethods.webElementClick(objHomePageData.btnLogin);
	}
	
	
	/*Fill*/
	public void enterUsername()
	{
		objCommonMethods.enterInputValue(objHomePageData.txtUsername, "anjita");
	}
	
	public void enterPassword()
	{
		objCommonMethods.enterInputValue(objHomePageData.txtPassword, "Test123!");
	}
	

}
