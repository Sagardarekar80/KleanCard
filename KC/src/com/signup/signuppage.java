package com.signup;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.Generic;

public class signuppage extends Generic
{
	/*
	 *
	 *Author Sagar
	 *
	 */
		@Test
		 public void signupTest() throws InterruptedException, AWTException
		 {
			
			
		String orgname = "klearcard";
		/*synchronisaiton wait statement */
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*URL*/
		driver.get("https://dev.klearcard.com/");
		/*SIgnUP button*/
		driver.findElement(By.xpath("//button[@class='landing-button secondary sign-up-btn']")).click();
		/*Company name text field*/
		driver.findElement(By.name("name")).sendKeys("abcscrea");
		/*Company address text field*/
		driver.findElement(By.name("address")).sendKeys("abcdsdf");
		/*Postal code text field*/
		driver.findElement(By.name("zipCode")).sendKeys("123456");
		/*Company number text field*/
		driver.findElement(By.name("number")).sendKeys("9234563492");
		/*Continue button*/
		driver.findElement(By.xpath("//button[@class='btn primary next']")).click();
		/*firstName text field*/
		driver.findElement(By.name("firstName")).sendKeys("Safdgsaadre");
		/*lastName text field*/
		driver.findElement(By.name("lastName")).sendKeys("Darekea");
		/*email text field*/
		driver.findElement(By.name("email")).sendKeys("sagedwe@gmail.com");
		/*password text field*/
		driver.findElement(By.name("password")).sendKeys("Darekar@123");
		/*repeat password text field*/
		driver.findElement(By.name("_password")).sendKeys("Darekar@123");
		/*Continue button*/
		driver.findElement(By.xpath("//button[@class='btn primary next']")).click();
		/*passport radio button*/
		driver.findElement(By.xpath("//label[@for='document-passport']")).click();
		
		/*id number text field*/
		driver.findElement(By.name("document_id")).sendKeys("cac123");
		/*Expiration Date text field*/
		driver.findElement(By.name("doc_expired")).sendKeys("12032025");
		/*Date of Birth text field*/
		driver.findElement(By.name("birthday")).sendKeys("12031994");
		/*male radio button*/
		driver.findElement(By.xpath("//label[@for='gender-male']")).click();
		/* Nationality drop down*/
		driver.findElement(By.xpath("//b[@role='presentation']")).click();
		
		/* Nationality drop down*/
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("india");
		/*Residential Address text field */
		driver.findElement(By.xpath("//input[@name='residential_address']")).sendKeys("bangalore");
		/*Postal Address text field */
		driver.findElement(By.xpath("//input[@name='residential_zipCode']")).sendKeys("123456");
		/*Continue button*/
		driver.findElement(By.xpath("//button[@class='btn primary next']")).click();
		/*Mobile Number text field*/
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9234563492");
		/*Send code button*/
		
		driver.findElement(By.xpath("//button[@class='btn primary next']")).click();
		/*Verification code text field*/
		
		
		driver.findElement(By.name("verificationCode")).sendKeys("123456");
		/*Submit code button*/
		driver.findElement(By.xpath("//button[@class='btn primary next']")).click();
		
		
		/*Select button*/
		driver.findElement(By.xpath("//div[1]//div[1]//div[1]//div[1]//a[@class='price-option__purchase']")).click();
		
		/*Card Number  textfield*/
		driver.findElement(By.xpath("//input[@class='credit-card-input']")).sendKeys("4242 4242 4242 4242");
		/*Name on card text field*/
		driver.findElement(By.name("name-on-card")).sendKeys("Sagar");
		/*Expiration Date text field */
		driver.findElement(By.xpath("//input[@class='expiration-date-input']")).sendKeys("0325");
		
		/*CVV text field */
		driver.findElement(By.xpath("//input[@class='ml-12']")).sendKeys("140");
		/*Continue button */
		driver.findElement(By.xpath("//button[@class='btn primary next']")).click();
		
		/*Inner Frame */
		driver.findElement(By.xpath("//div[@class='terms-box']//div")).click();
		/*Scroll bar */
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<5;i++)
		{
			js.executeScript("window.scrollBy(0,1500)");
		}
	
		/*Check box */
		driver.findElement(By.xpath("//div[@class='control__indicator']")).click();
		/*Continue button */
		driver.findElement(By.xpath("//button[@class='btn primary next']")).click();
		
		
		
	}

}
