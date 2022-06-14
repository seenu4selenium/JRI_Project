package com.jri.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

import objectRepository.Locators;

public class Tc_001 extends CommonFunctions {
	Locators obj = new Locators();

@Test
public void testName() throws Exception {
	//TC_001 creat account
			Properties prop = new Properties();
			FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\QA_testdata.properties");
			prop.load(fi);
			openChromeBrowser();
	//jri url
	
	  driver.get(prop.getProperty("jri_sign_url"));
	  //TC_002
	 driver.findElement(By.linkText("Create New Account")).click();
	 //TC_003
	  driver.findElement(By.xpath("//*[@id=\"imgbtnSubmit\"]")).click();
	  System.out.println("Print Name Error message"); 
	  //TC_004
	  sendKeysByAnyLocator(obj.jriCreatAccount_Name_Editbox, prop.getProperty("jri_signup_name"));
	  driver.findElement(By.xpath("//*[@id=\"imgbtnSubmit\"]")).click();
	  System.out.println("Print Mobile Error Messege");
	  //TC_005
	  sendKeysByAnyLocator(obj.jriCreatAccount_Mobile_Editbox, prop.getProperty("jri_signup_mobileno"));
	  driver.findElement(By.xpath("//*[@id=\"imgbtnSubmit\"]")).click();
	  System.out.println("Print Email Error Messege"); 
	  //TC_006
	  sendKeysByAnyLocator(obj.jriCreatAccount_Email_Editbox, prop.getProperty("jri_signup_email"));
	  driver.findElement(By.xpath("//*[@id=\"imgbtnSubmit\"]")).click();
	  System.out.println("Print Password Error Messege"); 
	  //TC_007
	  sendKeysByAnyLocator(obj.jriCreatAccount_Password_Editbox,prop.getProperty("jri_signup_password"));
	  driver.findElement(By.xpath("//*[@id=\"imgbtnSubmit\"]")).click();
	  System.out.println("Print Terms Error Messege"); 
	  //TC_008
	  //driver.navigate().refresh();
	  //TC_010
	  driver.findElement(By.name("checkbox")).click();
	  driver.findElement(By.xpath("//*[@id=\"imgbtnSubmit\"]")).click();
	  System.out.println("Print successfully Messege");
	  driver.navigate().refresh(); driver.navigate().back(); Thread.sleep(3000);
	  driver.navigate().back(); 
	  //TC_011,012 TC_013signin
	  driver.findElement(By.id("jriTop_signin9")).click();
	  //sendkeysByAnyLocater(obj.jriSignin_Email_Editbox,  prop.getProperty("jri_signin_Email"); 
	  //TC_014 //*[@id="imgbtnSignin"]
	  driver.findElement(By.xpath("//*[@id=\"imgbtnSignin\"]")).click();
	  System.out.println("Enter your Email");
	  //TC_015 Secure signin
	  sendKeysByAnyLocator(obj.jriSignin_Email_Editbox, prop.getProperty("jri_signin_Email"));
	  sendKeysByAnyLocator(obj.jriSignin_Password_Editbox,
	  prop.getProperty("jriSignin_Password")); Thread.sleep(10000); Scanner abc =
	  new Scanner(System.in); String captcha = abc.next();
	  driver.findElement(By.name("txtCaptcha")).sendKeys(captcha);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"imgbtnSignin\"]")).click();
	  
	  System.out.println("Signin successfully");
	  //tC016 SignOut
	  driver.findElement(By.id("jriTop_signOut")).click(); Thread.sleep(3000);
	  //TC_017,TC_018,TC_019 Forgot Password
	 			driver.findElement(By.id("jriTop_signin9")).click();
			 driver.findElement(By.id("forgotpassword")).click();
			 System.out.println("Print Forgot Password ");
			 //TC_020 verify Email
			driver.findElement(By.name("forgotpass$txtEmailId")).sendKeys("sandhya.chadagonda@gmail.com");
			 driver.findElement(By.xpath("//*[@id=\"forgotpass_imgbtnSubmit\"]")).click();
			 
			
	        
	
}

@AfterMethod
public void takeScreenshots() throws IOException {
	// TimeStamp
	Date d = new Date();
	DateFormat df = new SimpleDateFormat("MMMddyyyy_HHmmss");
	String timeStamp = df.format(d);

	// takeScreenshots
	File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(abc, new File(".\\screenshots\\Test_" + timeStamp + ".PNG"));

}


	
	}


