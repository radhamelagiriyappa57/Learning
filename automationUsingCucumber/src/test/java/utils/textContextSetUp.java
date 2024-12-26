package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.pageObjectManager;

public class textContextSetUp {

	public 	pageObjectManager pg;
	public	WebDriver driver;
	public String landingPageProductName;
	public testBase tbase;
	public genericUtils ut;
	
	public textContextSetUp() throws IOException
	{
		
		
		tbase= new testBase();
		pg = new pageObjectManager(tbase.webDriverManager());
		ut=new genericUtils(tbase.webDriverManager());
	}
	
}
