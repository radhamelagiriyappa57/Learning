package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
	
	
	@Listeners(ExtentReport.ExtentReportListener.class)
	public class usingBroswerFFChrome {
	 
	 WebDriver driver = null;
	 static String expectedTitleebay ="Electronics, Cars, Fashion, Collectibles & More | eBay";
	 
	 
	 
	 @Parameters("browserName")
	 @BeforeTest
	 public void setUp(String browserName){
	
	  if(browserName.equalsIgnoreCase("chrome")) {
		 
	  //initializing and starting the Chromebrowser
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	 }else if(browserName.equalsIgnoreCase("firefox")) { 
	  //initializing and starting the Chromebrowser  
	  WebDriverManager.firefoxdriver().setup();   
	  driver = new FirefoxDriver();  
	 }
	}
	 
	 
	
	 
	 
	 
	 
	@Test
	 public void test1() throws InterruptedException {
	 
	  //maximize the window 
	  driver.manage().window().maximize();
	  driver.get("https://www.ebay.com");
	  Thread.sleep(1000);
	  
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitleebay);
	  
	  driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Mobile");
	  
	  
	 }
	@Test
	public void test2() throws InterruptedException {
	//maximize the window 
	 driver.manage().window().maximize();
	 driver.get("https://www.ebay.com");
	 Thread.sleep(1000);
	 
	 String actualTitle = driver.getTitle();
	 Assert.assertEquals(actualTitle, expectedTitleebay);
	 
	 driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Mobile");
	 
	 
	}
	 
	 @AfterTest
	 public void  tearDown() {
	  driver.quit();
	}
	}
	
	
	


