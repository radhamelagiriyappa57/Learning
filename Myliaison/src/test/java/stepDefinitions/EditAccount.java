package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.junit.AfterClass;
import commonfunctions.LoadProperties;
import commonfunctions.utilities;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;



public class EditAccount {
	
	public static WebDriver driver;
	loginpage loginpg;
	static LoadProperties lp = new LoadProperties();
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		
		driver= utilities.login(null, lp.getProperty("qaurl"));
		driver.findElement(By.linkText("Login")).click();
		
       
	}
	
	@When("enter <username> and <pwd>")
	public void enter_username_and_pwd() {
		loginpg = new loginpage();
		PageFactory.initElements(driver, loginpage.class);
		loginpg.getUserNameButton().sendKeys("myl.qa9@mailinator.com");
		loginpg.getPasswordButton().sendKeys("Test!@#123");
	   
	}


	@And("click login button")
	public void click_login_button() {
		loginpg = new loginpage();
		PageFactory.initElements(driver, loginpage.class);
		loginpg.getloginButton().click();
	    
	}

	@Then("user is on dashboard page")
	public void user_is_on_dashboard_page() {
		Assert.assertTrue(driver.getTitle().contentEquals("Home page | MyLiaison"));
		
	}
	

	@When("User navigates to My Profile")
	public void user_navigates_to_my_profile() throws InterruptedException {
		
	
		loginpg = new loginpage();
		PageFactory.initElements(driver, loginpage.class);
		driver.findElement(By.xpath("//*[@id=\"more-dropdown-toggle\"]/a")).click();
		
		WebElement mouseHoverOnLocations = driver.findElement(By.xpath("//*[@id=\"more-dropdown-toggle\"]/a"));	   
	    Actions actions = new Actions(driver);	   
	    actions.moveToElement(mouseHoverOnLocations);	   
	    WebElement selectSantaClara = driver.findElement(By.linkText("About Me"));	    
	    actions.moveToElement(selectSantaClara);	   
	    actions.click().build().perform();		
	    driver.findElement(By.linkText("Edit")).click(); 
	    Thread.sleep(1000);
	   
	}
	@And("click profile")
	public void click_about_me() {
	   
			driver.findElement(By.cssSelector(".rounded-md")).click();
		    driver.findElement(By.cssSelector(".w-full > .rounded-md")).click();
		    driver.findElement(By.id("id_hight_school_gpa")).click();
		    driver.findElement(By.id("id_hight_school_gpa")).clear();;
		    driver.findElement(By.id("id_hight_school_gpa")).sendKeys("3");
		    driver.findElement(By.id("id_college_school_gpa")).click();
		    driver.findElement(By.id("id_college_school_gpa")).clear();;
		    driver.findElement(By.id("id_college_school_gpa")).sendKeys("3");
		    driver.findElement(By.cssSelector(".rounded-md:nth-child(2)")).click();
		    driver.findElement(By.id("id_modality_of_education_1")).click();
		    driver.findElement(By.id("id_program_type_1")).click();
		    driver.findElement(By.cssSelector(".rounded-md")).click();
		    driver.findElement(By.id("id_city")).click();
		    driver.findElement(By.id("id_city")).sendKeys("cityedit");
		    
		 
	}
	@Then("Save profile")
	public void save_about_me() {
		driver.findElement(By.cssSelector(".rounded-md")).click();
		    
	}

	 @After()
	  public void tearDown() throws Exception {
	    driver.close();;
	   
	  }


}
