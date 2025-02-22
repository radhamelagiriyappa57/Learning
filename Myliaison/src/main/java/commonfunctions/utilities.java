package commonfunctions;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.apache.commons.lang3.RandomStringUtils;

public class utilities {
	
	public static WebDriver driver;
	static LoadProperties lp = new LoadProperties();
	 
	@Before
	@SuppressWarnings("deprecation")
	public static WebDriver login(WebDriver driver, String url)
	{
		
		 if (driver == null)
	        {    
	        	System.setProperty(lp.getProperty("driver"), lp.getProperty("chromepath"));	        	
	          	driver = new ChromeDriver();
	        	driver.manage().window().maximize();
	        	driver.manage().deleteAllCookies();
	        	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	        	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     		driver.get(url);
	     		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);                       
	        }
		return driver;
		
	}
	
	 public static String GenerateRandomString(int length) {
		 
		 
		    return RandomStringUtils.randomAlphabetic(length);
		}
	 
	 public static String GenerateRandomNumber(int length) {
		    return RandomStringUtils.randomNumeric(length);
		}

		@After
		public void after()
		{
			
			driver.close();
			
			}
}
