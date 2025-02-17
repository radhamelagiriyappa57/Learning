package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
					driver.manage().deleteAllCookies();
				/*	
					WebDriverWait wait = new WebDriverWait(driver,30);
					wait.until(ExpectedConditions.visibilityOf(By.id("")));
					
					
					driver.manag
	*/
					
			}
			if(prop.getProperty("browser")=="firefox")
			{
				
	
	
			}
				driver.get(prop.getProperty("qaurl"));
	}
			return driver;
	}

	
Alert alert = driver.switchTo().alert();
//driver..switchTo().alert().accept();



	
}
