package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase{
	
	public WebDriver driver;
	
	
	



	public WebDriver webDriverManager() throws IOException
	{
	
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"//src//test//java//resources//test.properties");
		Properties prop = new Properties();
		prop.load(file);
		if(driver==null) {
			
			
			
			if(prop.getProperty("browser")=="chrome")
			{
					System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+"//src//test//java//resources//chromedriver.exe"));
					driver = new ChromeDriver();
					driver.manage().deleteAllCookies();
	
	
			}
			if(prop.getProperty("browser")=="firefox")
			{
				
	
	
			}
				driver.get(prop.getProperty("qaurl"));
	}
			return driver;
	}






	
}
