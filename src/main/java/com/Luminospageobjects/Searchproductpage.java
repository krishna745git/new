package com.Luminospageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Constants.Baseclass;

public class Searchproductpage extends Baseclass {
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//input[@id='searchinput']")
	WebElement search;
	@FindBy(xpath = "//button[@id='simplesearchbtn']")
	WebElement searchBtn;
	
	public Searchproductpage() {

		PageFactory.initElements(driver, this);

	}

	
	public void Searchproduct() {
		
		search.sendKeys("Fans");
		searchBtn.click();
	}

	
	
	
	
	
	
	

}
