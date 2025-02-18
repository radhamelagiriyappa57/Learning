package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class usingHashMApforLogin {
	
	
	
	WebDriver driver;
	
	@Test
	//(dataProvider="getdata")
	public void loginTodemoguru()
	{
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			
			
			driver.get("https://demo.guru99.com/insurance/v1/register.php");
		    driver.manage().window().setSize(new Dimension(1050, 700));
		    driver.findElement(By.id("user_title")).click();
		  
		    
		    String[] exp = {"Mr", "Mrs", "Ms", "Doctor", "Captain", "Duchess", "Duke", "Father", "General", "Lady", "Lord", "Lieutenant", "Lieutenant Colonel","Major", "Master", "Professor" ,"Reverend","Sir","Squire","Squadron Leader"};
		      WebElement dropdown = driver.findElement(By.id("user_title"));
		      
		      Select select= new Select(dropdown);
		      select.selectByValue("Miss");
		      
		      
		   
		    
		    List<WebElement> ele = select.getOptions();
		   
		    for(WebElement we: ele)
		    {
		    	
		    	for(int i=0; i>exp.length;i++)
		    	{
		    		if(exp[i].equalsIgnoreCase(we.getText()))
		    				{
		    			System.out.println("matched");
		    				}
		    		System.out.println("Not matched");
		    		
		    	}
		    	// System.out.println(we.getText());
				    
		    }
		    
		    
		    driver.findElement(By.id("user_firstname")).click();
		    driver.findElement(By.id("user_firstname")).sendKeys("radha");
		    driver.findElement(By.cssSelector("#new_user > div:nth-child(3)")).click();
			
			
			
		    driver.findElement(By.id("email")).click();
		    String credentials = getdata().get("radha@gmail.com"); // Retriving value 'x' from
            // HashMap

 // Login as y
 // String credentials = logindata().get("y");

 // Login as z
 // String credentials = logindata().get("x");

 String uarr[] = credentials.split("@"); // separting value of 'x' int o
           // 2 parts using delimeter '@'
		    driver.findElement(By.id("email")).sendKeys(getdata().get(uarr[0]));
		    driver.findElement(By.id("password")).sendKeys(uarr[1]);
		    driver.findElement(By.cssSelector(".absolute")).click();
		
		
	}
	//@DataProvider
	public HashMap<String, String> getdata()
	{
		
		HashMap<String , String> userDetail = new HashMap<String , String>();
		userDetail.put("radha@gmail.com", "Test!@#123");
		userDetail.put("radha2@gmail.com", "Test!@#123");
		
		for(Map.Entry<String, String> m2 : userDetail.entrySet())
		{
			
			System.out.println(m2.getKey()+" "+m2.getValue());
			
		}
		
		return userDetail;
	}

}
