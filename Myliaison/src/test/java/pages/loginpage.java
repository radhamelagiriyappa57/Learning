package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	
		
	
	@FindBy(id = "username")
	 public static WebElement UserNameButton;
 
	 public WebElement getUserNameButton() {
       return UserNameButton;
	 }

		@FindBy(id = "password")
		 private static WebElement PasswordButton;
	 
		 public WebElement getPasswordButton() {
	       return PasswordButton;
		 }
		 
		 
		 
		 @FindBy(id = "kc-login")
		 private static WebElement loginButton;
	 
		 public WebElement getloginButton() {
	       return loginButton;
		 }
		 
		 
		 
		 
}
