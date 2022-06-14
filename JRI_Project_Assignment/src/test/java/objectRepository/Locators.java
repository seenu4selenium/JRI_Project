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
//Jri locators
		 public final By jriCreatAccount_Name_Editbox = By.name("signup_name");
		 public final By jriCreatAccount_Mobile_Editbox = By.name("signup_mobileno");
		 public final By jriCreatAccount_Email_Editbox = By.name("signup_email");
		 public final By jriCreatAccount_Password_Editbox = By.name("signup_password");
		 //public final By jriCreatAccount_checkbox_Button = By.name("checkbox");
		 //public final By jri_singin_Link = By.id("jriTop_signin9");
		public final By jriSignin_Email_Editbox = By.name("txtUserName");
		 public final By jriSignin_Password_Editbox = By.name("txtPasswd");
		 //public final By jriSignin_Login_Button = By.name("login");
		 //public final By jriForgot_Email_Editbox = By.name("forgotpass$txtEmailId");
		

}
