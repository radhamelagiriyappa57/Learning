package pageObjects;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {
	
	public WebDriver driver;
	
	public pageObjectManager(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public  landingPage lp;
	
	public  offersPage fp;
	//public driver;
	
	public landingPage getLandingPage(WebDriver driver)
	{
		
		
		lp = new landingPage(driver);
		return lp;
	}

	
	public offersPage getoffersPage()
	{
		
		
		fp = new offersPage(driver);
		return fp;
	}
	
}
