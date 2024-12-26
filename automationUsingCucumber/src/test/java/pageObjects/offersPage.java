package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offersPage {
	
	
	public WebDriver driver;
	
	public offersPage(WebDriver driver) {
		
		
		this.driver= driver;
	}
	
	
	private By search = By.xpath("//*[@id=\"search-field\"]");
	
	
	

	private By productName = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/table/tbody/tr/td[1]");
	
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
