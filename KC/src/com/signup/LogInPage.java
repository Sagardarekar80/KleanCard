package com.signup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.Generic;

public class LogInPage extends Generic
{
	/*
	 *
	 *Author Sagar
	 *
	 */
	@Test
	 public void LogInTest() throws InterruptedException
	 {	
	  String orgname = "klearcard";
	  /*synchronisation wait statement */
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	/*URL*/
	driver.get("https://dev.klearcard.com/");
	/*Login Button */
	driver.findElement(By.xpath("//button[@class='landing-button login-btn']")).click();
	/*Mobile Number Text Field */
	driver.findElement(By.id("login-phone")).sendKeys("1234563492");
	/*Remember Check box */
	driver.findElement(By.xpath("//div[@class='control__indicator']")).click();
	/*Submit Button*/
	driver.findElement(By.xpath("//button[@class='landing-button login-phone-btn']")).click();
	
	driver.findElement(By.id("login-password")).sendKeys("Darekar@123");
	driver.findElement(By.xpath("//button[@class='landing-button login-password-btn']")).click();
	
}

}