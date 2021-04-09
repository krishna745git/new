package com.Testpages;



	
	
	
	
	
	
	
	
	
	
	
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import com.Constants.Baseclass;
import com.Luminospageobjects.Createaccountpage;
//import com.lumens.constants.BaseClass;
//	import com.lumens.design.CreateAccountPage;

	public class Createaccountpagetest extends Baseclass {

		Createaccountpage cap;

		public Createaccountpagetest() {

			super();
		}
		
		
		@BeforeTest
		public void setUp() throws InterruptedException {
			
			initialization();
			cap = new Createaccountpage();
		    Thread.sleep(2000);
		}
		
		@Test
		public void buttonClickTest() throws Exception {
			cap.buttonClick();
		}

		@Test
		public void createAccountTest() {
			
			cap.createAccount();
		}
	}
	
	

