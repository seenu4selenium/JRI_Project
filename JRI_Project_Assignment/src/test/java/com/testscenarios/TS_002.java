package com.testscenarios;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.Locators;

public class TS_002 extends CommonFunctions {

	Locators loc = new Locators();

//	@Parameters("browserName")
//	
//	@BeforeClass
//	public void beforeClass(@Optional("chrome") String browserName) {
//		if (browserName.equalsIgnoreCase("Chrome")) {
//			openChromeBrowser();
//		} else if (browserName.equalsIgnoreCase("Firefox")) {
//			openFirefoxBrowser();
//		} else if (browserName.equalsIgnoreCase("edge")) {
//			openEdgeBrowser();
//		} else {
//			System.out.println("Please give valid browser name with in Edge/FireFox/Chrome");
//		}
//	}

	@Test
	public void TC_014() throws Exception {
		openChromeBrowser();
		driver.get("https://www.justrechargeit.com/");
		clickByAnyLocator(loc.HomePage_SignIn_Link);

	}
	@Test
	public void TC_015() throws Exception {
		TC_014();
		//clickByAnyLocator(loc.HomePage_SignIn_Link);
		implicitWait(10);
		// validate whether the Signin page has displayed or not?
		// get the URL of page and validate it
		String expectedURL = "https://www.justrechargeit.com/SignIn.aspx";
		validateWebElement(getCurrentpageURL(), expectedURL);
	}
	@Test
	public void TC_016() throws Exception {
		TC_015();
		implicitWait(10);
		// Find elements as per test data sheet 
		if(loopAllFramesForElement(loc.SignIn_Button)==1
			&&loopAllFramesForElement(loc.SignIn_Email_Editbox)==1
		&&loopAllFramesForElement(loc.SignIn_Password_Editbox)==1
			&&loopAllFramesForElement(loc.SignIn_Captcha_Editbox)==1
		&&loopAllFramesForElement(loc.SignIn_ForgotPassword_Link)==1
			&&loopAllFramesForElement(loc.Sign_In_with_Facebook)==1
			&&loopAllFramesForElement(loc.Sign_In_with_Google)==1
			) {
			System.out.println("elements as per the test data sheet");
		}else{
			System.out.println("elements are not per the test data sheet");
		};
		
	}

	
	  @Test public void TC_017() throws Exception { 
		  TC_016(); 
	  implicitWait(10);
	  clickByAnyLocator(loc.SignIn_Button); // Check Validation messages 
	  //check without any info in email text box
	  validateWebElement(getTextByAnyLocator(loc.SignIn_Email_ErroeMSG), "Enter your email"); 
	  Thread.sleep(5000); 
	  // if invalid email is there
	  sendKeysByAnyLocator(loc.SignIn_Email_Editbox, "test");
	  clickByAnyLocator(loc.SignIn_Button);
	  validateWebElement(getTextByAnyLocator(loc.SignIn_Email_ErroeMSG), "Enter valid email for login"); 
	  //if valid email is there, check for password error 
	  sendKeysByAnyLocator(loc.SignIn_Email_Editbox, "test@gmail.com");
	  clickByAnyLocator(loc.SignIn_Button);
	  validateWebElement(getTextByAnyLocator(loc.SignIn_Password_ErroeMSG),"Enter your password"); 
	  //if valid email and password there, but no captcha
	  sendKeysByAnyLocator(loc.SignIn_Email_Editbox, "test@gmail.com");
	  sendKeysByAnyLocator(loc.SignIn_Password_Editbox, "asjhdjashdjh");
	  clickByAnyLocator(loc.SignIn_Button);
	  validateWebElement(getTextByAnyLocator(loc.SignIn_Captcha_ErroeMSG),"Enter captcha properly"); 
	  //if valid but unknown email and password there, with valid captcha 
	  sendKeysByAnyLocator(loc.SignIn_Email_Editbox,"test@gmail.com"); 
	  sendKeysByAnyLocator(loc.SignIn_Password_Editbox,"asjhdjashdjh"); 
	  //scanner to put captcha 
	  Scanner abc = new Scanner(System.in); 
	  String captcha = abc.next();
	  sendKeysByAnyLocator(loc.SignIn_Captcha_Editbox, captcha);
	  Thread.sleep(2000); 
	  clickByAnyLocator(loc.SignIn_Button); 
	  Thread.sleep(2000);
	  validateWebElement(getTextByAnyLocator(loc.SignIn_ErroeMSG),"Invalid Login / Illegal request");
	  
	  }
	 
	
	  @Test public void TC_018() throws Exception { 
		  TC_015(); 
	  //fill valid details and login 
	  sendKeysByAnyLocator(loc.SignIn_Email_Editbox,"hardeep.19964@gmail.com");
	  sendKeysByAnyLocator(loc.SignIn_Password_Editbox, "123456"); 
	  //scanner to put captcha
	  Scanner abc = new Scanner(System.in);
	  String captcha = abc.next(); 
	  sendKeysByAnyLocator(loc.SignIn_Captcha_Editbox,captcha); 
	  Thread.sleep(2000); 
	  clickByAnyLocator(loc.SignIn_Button);
	  implicitWait(10); 
	  String expectedURL ="https://www.justrechargeit.com/myaccount_directory.aspx";
	  validateWebElement(getCurrentpageURL(), expectedURL); 
	  }
	  
	  
	  @Test public void TC_019() throws Exception { 
		  TC_018(); 
	  implicitWait(10); //
	  // fill valid login details and sign in and then signout.
	  clickByAnyLocator(loc.MyAccount_SignOut_Link); 
	  }
	 
	 
	@Test
	public void TC_020() throws Exception {
		TC_015();
		implicitWait(10);
		// click on forgot password link and next page displayed? 
		clickByAnyLocator(loc.SignIn_ForgotPassword_Link);
		// SignIn_ForgotPassword_Email
		
		if(loopAllFramesForElement(loc.ForgotPassword_Form)==1) {
			System.out.println("forgot password link and next page Form displaying");
		}else {
			System.out.println("forgot password link and next page Form NOT displaying");
		}
	}
	
	
	  @Test public void TC_021() throws Exception { 
	  //find forgot password web elements
		  TC_020(); 
	  if(loopAllFramesForElement(loc.ForgotPassword_Email)==1 &&
	  loopAllFramesForElement(loc.ForgotPassword_Submit)==1) {
	  System.out.println("forgot password email link and get password button displaying");
	  }else {
	  System.out.println("forgot password email link and get password button NOT displaying"); 
	  } 
		  }
	  
	  @Test public void TC_022() throws Exception {  
		  TC_015();
		 clickByAnyLocator(loc.SignIn_ForgotPassword_Link);
		 Thread.sleep(2000);
		 clickByAnyLocator(loc.ForgotPassword_Submit);
		 // try without filling email clicking check validation messages
		 validateWebElement(getTextByAnyLocator(loc.ForgotPassword_ErroeMSG),"Enter your email");
		 // try filling a not valid email
		 sendKeysByAnyLocator(loc.ForgotPassword_Email, "test");
		 clickByAnyLocator(loc.ForgotPassword_Submit);
		 Thread.sleep(2000);
		 validateWebElement(getTextByAnyLocator(loc.ForgotPassword_ErroeMSG),"Enter valid login email");
	  }
	  @Test public void TC_023() throws Exception {  
		  TC_015();
		 implicitWait(10);
		 clickByAnyLocator(loc.SignIn_ForgotPassword_Link);
		 Thread.sleep(2000);
		 //put valid email and check email if received link
		 sendKeysByAnyLocator(loc.ForgotPassword_Email, "hardeep.19964@gmail.com");
		 clickByAnyLocator(loc.ForgotPassword_Submit);
		 }
	 
	// This method will execute each and every @test method execution done
	@AfterMethod
	public void takescreenshotOfEachMethod() throws Exception {
		// Here type class name as screenshot file name
		takescreenshotWithTimeStamp("ClassName");
		driver.quit();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
