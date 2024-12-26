package stepDefinitions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import utils.textContextSetUp;
import org.openqa.selenium.TakesScreenshot;
public class alertexample {
	
	public WebDriver driver;
	
	public void alertexm() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","Path_of_Chrome_Driver"); //mention dummy path or variable that stores chrome driver path 
		WebDriver driver = new ChromeDriver(); driver.get("https://www.browserstack.com/users/sign_up");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.id("user_full_name")).sendKeys("username"); driver.findElement(By.id("input-lg text user_email_ajax")).sendKeys("username.xyz.net");
		driver.findElement(By.id("user_password")).sendKeys("Your_Password");
		driver.findElement(By.id("user_submit")).click();

		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert(); // switch to alert
		
		String alertMessage= alert.getText(); // capture alert message
		

		System.out.println(alertMessage); // Print Alert Message
		Thread.sleep(5000);
		alert.accept(); 
		alert.sendKeys("ok");
		alert.accept();
		alert.dismiss();
		
		/*************************/
		
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.id(""));
		action.moveToElement(ele).build().perform();
		
		/*************/
		
		Select select = new Select(driver.findElement(By.id("d")));
		select.selectByValue("radha");
		
		/*************/
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("")));
		
		}
	
	
	
	public void screenshot() throws IOException
	{
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen.png"));
		System.out.println("Screenshot is captured");
	}
}
