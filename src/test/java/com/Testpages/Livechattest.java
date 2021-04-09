package com.Testpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Constants.Baseclass;
import com.Luminospageobjects.Createaccountpage;
import com.Luminospageobjects.Livechatpage;
import com.Luminospageobjects.Signinpage;


public class Livechattest extends Baseclass {

	
	Signinpage sp;
	Createaccountpage cp;
	Livechatpage lcp;
	
	public Livechattest() {
		super();
	}
	
	@BeforeTest
	@Parameters  ("browser")                              //  Cross browser testing using TestNG. 

	public void setup(String browser) throws Exception{
		
		if(browser.equalsIgnoreCase("chrome")){
		//set path to chromedriver.exe
		System.setProperty("webdriver.chrome.driver","E:\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//create chrome instance
		driver = new ChromeDriver();
		}
		//Check if parameter passed as 'Edge'
		else if(browser.equalsIgnoreCase("IE")){
		//set path to Edge.exe
		System.setProperty("webdriver.ie.driver","E:\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		//create Edge instance
		driver = new InternetExplorerDriver();
		}
		else{
		//If no browser passed throw exception
		throw new Exception("Browser is not correct");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//a[@class='ltkpopup-close']")).click();
		
	    
			sp = new Signinpage();
			
			cp = new Createaccountpage();
			
			lcp = new Livechatpage();
		
	}
	@Test
	public void Livelogin() throws Exception{           //  How to execute only failed testcases in Selenium Web driver.
		
		
		

		cp.buttonClick();
		
		Thread.sleep(5000);
		
		sp.signIn();
		
		Thread.sleep(5000);
		
		lcp.livechat();
		
		
		
	}
}
	
	
	
