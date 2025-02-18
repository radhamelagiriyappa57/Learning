
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
public class JavaExecutorExample {
	
	
	public static void main(String args[])
	{
		
		
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\rmelagir\\POIExample\\src\\main\\java\\resources\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("RadhA");
		
		WebElement element1= driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', 'john')", element1);
		
		
		WebElement radio1= driver.findElement(By.xpath("//input[@id='male']"));
		
		js.executeScript("arguments[0].click()", radio1);
		
		//scroll by pixel
		js.executeScript("window.scrollBy(0,3000)", "" );
		
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll till footer element is found
		
		WebElement footer = driver.findElement(By.xpath("//*[@id=\"PageList1\"]/h2"));
		
		js.executeScript("arguments[0].scrollIntoView();", footer );

	}

}
