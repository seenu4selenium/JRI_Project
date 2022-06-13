package objectRepository;

import org.openqa.selenium.By;

public class Locators {
//PageName_ElementName_ElementType

	// Here QA will store all the application locators!
		// PageName_WebElementName_elementType

		// HomePage
		public final By HomePage_CreateNewAccount_Link = By.id("signup-link9");

		// CreateNewAccountPage
		public final By CreateNewAccountPage_CreateAccount_Button = By.id("imgbtnSubmit");
		
		public final By CreateNewAccountPage_Name_ErroeMSG = By.id("nameTD");
		public final By CreateNewAccountPage_Name_EditBox = By.name("signup_name");
		
		public final By CreateNewAccountPage_MobileNo_ErroeMSG = By.id("mobilenoTD");
		public final By CreateNewAccountPage_MobileNo_Editbox = By.id("signup_mobileno");
		

		public final By CreateNewAccountPage_Email_ErroeMSG = By.id("emailTD");
		public final By CreateNewAccountPage_Email_Editbox = By.id("signup_email");

		public final By CreateNewAccountPage_Password_ErroeMSG = By.id("passwordTD");
		public final By CreateNewAccountPage_Password_Editbox = By.id("signup_password");
		
		public final By CreateNewAccountPage_Terms_ErroeMSG = By.id("tdcondition");

		
		// signIn link Locators
		public final By HomePage_SignIn_Link = By.id("jriTop_signin9");
		public final By SignIn_Button = By.id("imgbtnSignin");
		public final By SignIn_ErroeMSG = By.xpath("//*[@id=\"MessageCaption\"]");

		public final By SignIn_Email_ErroeMSG = By.id("MessageCaption2");
		public final By SignIn_Email_Editbox = By.id("txtUserName");
		public final By SignIn_Password_ErroeMSG = By.id("MessageCaption3");
		public final By SignIn_Password_Editbox = By.id("txtPasswd");
		public final By SignIn_Captcha_Editbox = By.id("txtCaptcha");
		public final By SignIn_Captcha_ErroeMSG = By.id("MessageCaption4");
		
		public final By SignIn_ForgotPassword_Link = By.id("forgotpassword");
		// popup for forgot password text box.
		public final By ForgotPassword_Email = By.id("forgotpass_txtEmailId");
		public final By ForgotPassword_Submit = By.id("forgotpass_imgbtnSubmit");
		public final By ForgotPassword_Form = By.id("forgotpasswordform");
		public final By ForgotPassword_ErroeMSG = By.id("forgotpass_lblError");
		
		public final By Sign_In_with_Facebook = By.xpath("//*[@id=\"signinpanel\"]/tbody/tr/td[3]/table/tbody/tr[2]/td/a/img");
		public final By Sign_In_with_Google = By.xpath("//*[@id=\"signinpanel\"]/tbody/tr/td[3]/table/tbody/tr[3]/td/a/img");
		
		//MyAccount Locators
		
		public final By MyAccount_SignOut_Link = By.id("jriTop_signOut");
}
