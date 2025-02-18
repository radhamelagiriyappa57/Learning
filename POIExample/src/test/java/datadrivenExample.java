import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadrivenExample {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\rmelagir\\POIExample\\src\\main\\java\\resources\\chromedriver.exe"));
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="getData")
	public void logintest(String User, String Email)
	{
		
			driver.get("https://login.yahoo.com/account/create");
		    driver.manage().window().setSize(new Dimension(1050, 700));
		    driver.findElement(By.id("usernamereg-firstName")).click();
		    driver.findElement(By.id("usernamereg-firstName")).sendKeys(User);
		    driver.findElement(By.id("usernamereg-lastName")).sendKeys("m");
		    driver.findElement(By.id("usernamereg-userId")).sendKeys("Email");
		    driver.findElement(By.id("usernamereg-password")).click();
		    driver.findElement(By.id("usernamereg-password")).sendKeys("Test!@#123");
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		
		String loginData[][]= {
				
				{"r@r.com","pwd"},

				{"g@g.com","pwd"}
				
				
				
		};
		
		
	/*	
		String path="C:\\Users\\rmelagir\\POIExample\\src\\test\\resources\\Book1.xlsx";
		XLUtility xlutil=new XLUtility(path);
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1);	
				
		Object loginData[][]=new String[totalrows][totalcols];
			
		
		for(int i=1;i<=totalrows;i++) //1
		{
			for(int j=0;j<totalcols;j++) //0
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
				
		}
		*/
		return loginData;
	
	}

	@Test(dataProvider="getData")
	public void logintest2()
	{
		System.out.println("testing");
			
	}

}
