package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class landingPage {
	
	public WebDriver driver;
	
	public landingPage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	By search = By.xpath("//input[@class=\"search-keyword\"]");
	By productName = By.xpath("//h4[@class=\"product-name\"]");
	
	public void SearchItem(String name) {
		
		
		driver.findElement(search).sendKeys(name);
	}
public String getSearchItem() {
		
		
		return driver.findElement(search).getText();
	}

public String getProductname()
{
	return driver.findElement(productName).getText();

}
}
