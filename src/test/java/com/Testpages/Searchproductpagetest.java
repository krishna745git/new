package com.Testpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Constants.Baseclass;
import com.Luminospageobjects.Createaccountpage;
import com.Luminospageobjects.Searchproductpage;
import com.Luminospageobjects.Signinpage;



public class Searchproductpagetest  extends Baseclass {
	
	public Searchproductpagetest() {
		super();
	}
	
	Createaccountpage cp;
	Signinpage sp;
	Searchproductpage spp;
	
	
	@BeforeTest
	public void setup() throws InterruptedException {
		
		initialization();
		
		cp =new Createaccountpage();
		
		sp= new  Signinpage();
		
		Thread.sleep(5000);
		
		spp=new Searchproductpage();
		
		Thread.sleep(5000);
	}
	
	
	
	
	@Test
	public void Searchproductpagetest1() throws Exception {
		
        cp.buttonClick();
		
		sp.signIn();
		
		Thread.sleep(5000);
		
		
		spp.Searchproduct();
		
		
	}
	
	
	

	
	
}
