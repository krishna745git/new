package com.Luminospageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Constants.Baseclass;

public class Livechatpage extends Baseclass {
	
	
	
	public Livechatpage() {

		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="/html[1]/body[1]/div[4]/div[2]/header[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]")
    public WebElement live;
    
    
    @FindBy(xpath="//*[@id=\"txt_4616424\"]")
    public WebElement Enteryourname;
    
    
    @FindBy(xpath="//*[@id=\"txt_4616425\"]")
    public WebElement Enteryouremail;
    
    
   @FindBy(xpath="/html[1]/body[1]/div[31]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[4]")
   public WebElement submi;
	
	public void livechat() {
		
		live.click();
		Enteryourname.sendKeys(prop.getProperty("name"));
		Enteryouremail.sendKeys(prop.getProperty("email"));
		submi.click();
		
		
		
		
	}
}
