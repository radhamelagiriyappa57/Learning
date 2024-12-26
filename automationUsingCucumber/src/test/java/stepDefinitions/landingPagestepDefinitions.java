package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
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
import pageObjects.landingPage;
import pageObjects.pageObjectManager;
//import utils.testContextSetUp;
import utils.textContextSetUp;

public class landingPagestepDefinitions {
	public textContextSetUp testContxtSetup;
	public pageObjectManager pg;
	public landingPagestepDefinitions(textContextSetUp testContxtSetup)
	{
		
		this.testContxtSetup=testContxtSetup;
	}
	
public	WebDriver driver;
	
	public String landingPageProductName;
	public String offerPageProductName;
	@Given("User is on the Green Landing page")
	public void user_is_on_the_green_landing_page() throws IOException {
		testContxtSetup.tbase.webDriverManager();
		 
	}
	@When("^User searched with short name (.+) and expected actual name of the product$")
	public void user_searched_with_short_name_and_expected_actual_name_of_the_product(String shortname) throws InterruptedException {
		//pg=new pageObjectManager(testContxtSetup.driver);
		landingPage lp = testContxtSetup.pg.getLandingPage(testContxtSetup.driver);
		//landingPage lp = new landingPage(driver);
		//testContxtSetup.driver.findElement(By.xpath("//input[@class=\"search-keyword\"]")).sendKeys(shortname);
		lp.SearchItem(shortname);
	   Thread.sleep(2000);
	 String  landingPageProductName = lp.getProductname().split("-")[0].trim();
	 System.out.println(landingPageProductName);
	 
	  	}
	
	
}
