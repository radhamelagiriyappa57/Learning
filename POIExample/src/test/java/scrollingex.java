import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingex {
	
	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		
		
		
		
		WebElement element1= driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', 'john'))", element1);
		
		
		WebElement radio1= driver.findElement(By.xpath("//input[@id='male']"));
		
		js.executeScript("arguments[0].click()", radio1);

	}

}
