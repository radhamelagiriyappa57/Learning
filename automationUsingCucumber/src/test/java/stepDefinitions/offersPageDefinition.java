package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.offersPage;
import utils.textContextSetUp;

public class offersPageDefinition {
	
	public textContextSetUp testContxtSetup;
	
	public String offerPageProductName;
	public offersPageDefinition(textContextSetUp testContxtSetup)
	{
		
		this.testContxtSetup=testContxtSetup;
	}
	
	@Then("User searched for the {string} shortname in offerspage to check if the product exist")
	public void user_searched_for_the_same_shortname_in_offerspage_to_check_if_the_product_exist(String shortname) throws InterruptedException {
			switchToOffersPage();
			offersPage fp = new offersPage(testContxtSetup.driver);
			fp.SearchItem(shortname);
			//fp.driver.findElement(By.xpath("//*[@id=\"search-field\"]")).sendKeys(shortname);
			Thread.sleep(2000);	
			
			String offerPageProductName= fp.getProductname();
		 	System.out.println(offerPageProductName);
		
	}
	public void switchToOffersPage()
	{
		
		testContxtSetup.driver.findElement(By.linkText("Top Deals")).click();
		testContxtSetup.ut.switchwindow(); 
		
	}

	@Then("validate product name in offerspage matches with landing page")
	public void validate_product_name_in_offerspage_matches_with_landing_page() {
		
		Assert.assertEquals(offerPageProductName, testContxtSetup.landingPageProductName);
	    
	}
	
}
