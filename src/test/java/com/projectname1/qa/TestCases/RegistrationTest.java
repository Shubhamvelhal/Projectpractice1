package com.projectname1.qa.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import com.projectname1.qa.Base.TestBase;
import com.projectname1.qa.Pages.RegistrationPage;
import com.projectname1.qa.Utility.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class RegistrationTest extends TestBase  {
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
	public void Test() throws IOException 
	{
	 	RegistrationPage rgpage = new RegistrationPage(driver);
		
		rgpage.clickfacbooksignuplink();
		rgpage.verifyfacebooklogoinregistrationpage();
		rgpage.verifyfacebookregistrationpagealreadyhaveanaccount();
		rgpage.setfirstnameinregistrationpage();
		rgpage.setlastnameinregistrationpage();
		rgpage.setmobilenumberinregistrationpage();
		rgpage.setpasswordinregistrationpage();
		rgpage.setbirthdayinregistrationpage();
//		Utils.getscreenshot(driver);
		rgpage.setbirthmonthinregistrationpage();
	
	
	
	}
	

}
