package com.Testpages;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Constants.Baseclass;
import com.Luminospageobjects.Createaccountpage;
import com.Luminospageobjects.Searchproductpage;
import com.Luminospageobjects.Signinpage;
/*import com.lumens.constants.BaseClass;
import com.lumens.design.CreateAccountPage;
import com.lumens.design.LightingPage;
import com.lumens.design.LogoutPage;
import com.lumens.design.SignInPage;
*/

public class Signinpagetest extends Baseclass {
	
	Signinpage sp;
	Createaccountpage cp;
	
	Searchproductpage spp;
	
	//LightingPage lp;
	//LogoutPage lop; 
	
	public Signinpagetest() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException {

		initialization();
		
		cp = new Createaccountpage();
	      
		sp = new Signinpage();
		
		
		
		spp = new Searchproductpage();
		
		//lp = new LightingPage();
		//lop = new LogoutPage();
	}

	@Test (enabled = true )                        //   How to disable testcase in Selenium using TestNG.
	public void signinTest() throws Exception {
		

		cp.buttonClick();
		
		Thread.sleep(5000);
		
		sp.signIn();
		
		Thread.sleep(5000);
	}
	
	@Test (enabled = false )
	public void searchfan() throws Exception {
		
		Thread.sleep(5000);
		
		spp.Searchproduct();
		
		Reporter.log("product is available");
	
	//	lp.clickOnLight();
		//lop.logut();
		
	}
	
	/* @Test (priority=0)                              // How to add priority in testcases. 
	public void signinTest() throws Exception {
		

		cp.buttonClick();
		
		Thread.sleep(5000);
		
		sp.signIn();
		
		Thread.sleep(5000);
	}
	
	@Test (priority=1)
	public void searchfan() throws Exception {
		
		Thread.sleep(5000);
		
		spp.Searchproduct();
		
		Reporter.log("product is available");                // How to generate Selenium log using TestNG
	
	//	lp.clickOnLight();
		//lop.logut();
		
	}  */
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}



