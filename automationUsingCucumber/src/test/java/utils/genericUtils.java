package utils;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class genericUtils {
	
	public genericUtils(WebDriver driver)
	{
		
		this.driver=driver;
	}
	public WebDriver driver;
	public void switchwindow()
	{
		
		
		
		Set <String> s1 = driver.getWindowHandles();
		 Iterator<String> i = s1.iterator();	 
		 
		 
		 String Parentwindow =  i.next();		 
		 String Childwindow = i.next();		 
		 driver.switchTo().window(Childwindow);
		 
		 
		 
		 
 for (String s: s1)
			 
		 {
			 
			 driver.switchTo().window(s);
			 if(driver.getTitle().contains(""))
			 {
				 
				 driver.close();
			 }
			 
		 }
	}

}
