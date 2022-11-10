package com.projectname1.qa.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname1.qa.Base.TestBase;
import com.projectname1.qa.Pages.LoginPage;
import com.projectname1.qa.Utility.Utils;

public class LoginFacebookPageTest extends TestBase {
//	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		Initialisebrowser("chrome");
	}
	
	@AfterClass
	public void teardown()
	{
		TestBase.driver.close();
	}
	
	@Test
	public void LoginFacebookPageTest() throws IOException
	{
		LoginPage fblp = new LoginPage(driver);
		
		fblp.VerifyTheFacebookLogoinLoginPage();
		fblp.VerifytheFacebookMessagefromLoginPage();
		fblp.VerifyFacebookCreateNewAccountButton();
		fblp.VerifyFacebookCreatePageforCelebrityButton();
		fblp.VerifyFacebookForgottenPasswordlink();
		fblp.verifyfooterlinks();
		fblp.setUsernameinUsernameField();
		fblp.setPasswordinPasswordField();
//		Utils.getscreenshot(driver);
     	fblp.ClickOnLoginButton();
		
	}
	

}
