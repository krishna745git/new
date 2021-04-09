package com.Luminospageobjects;



	
	
	
	import org.openqa.selenium.StaleElementReferenceException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

      import com.Constants.Baseclass;
//import com.lumens.constants.BaseClass;
	//import com.lumens.utilities.ActionsClass;

	public class Createaccountpage extends Baseclass {

		@FindBy(xpath = "//span[text()='Account']")
		WebElement accountBtn;
		@FindBy(xpath = "//div[@class='customerInfo dropdown-item']//a[text()='Sign In']")
		WebElement signIn;
		@FindBy(xpath = "//button[@id='createAccountBtn']")
		WebElement createAccountBtn;
		@FindBy(xpath = "//input[@id='dwfrm_profile_customer_firstname']")
		WebElement firstName;
		@FindBy(xpath = "//input[@id='dwfrm_profile_customer_lastname']")
		WebElement lastName;
		@FindBy(xpath = "//input[@id='dwfrm_profile_customer_email']")
		WebElement email;
		@FindBy(xpath = "//input[@id='dwfrm_profile_customer_emailconfirm']")
		WebElement emailConfirm;
		@FindBy(xpath = "//input[@name='dwfrm_profile_login_password']")
		WebElement password;
		@FindBy(xpath = "//input[@name='dwfrm_profile_login_passwordconfirm']")
		WebElement confirmpassword;
		@FindBy(xpath = "//button[@class='medium']")
		WebElement createBtn;
		
		
		public Createaccountpage() {

			PageFactory.initElements(driver, this);
		}
		
		public WebElement waitForElementToBeRefreshedAndClickable(WebDriver driver, WebElement ele) {
		    return new WebDriverWait(driver, 30)
		            .until(ExpectedConditions.refreshed(
		                    ExpectedConditions.elementToBeClickable(ele)));
		}
		
		public void buttonClick() throws Exception  {
			
			Thread.sleep(1000);
			waitForElementToBeRefreshedAndClickable(driver,accountBtn).click();
			//ActionsClass.actionCode(accountBtn);
			/*try {
			ActionsClass.actionCode(accountBtn);
			}
			catch(StaleElementReferenceException e) {
				ActionsClass.actionCode(accountBtn);

			}*/
			//accountBtn.click();
			Thread.sleep(1000);
			signIn.click();
		}
		
		public void createAccount() {
			

			createAccountBtn.click();
			firstName.sendKeys(prop.getProperty("firstName"));
			lastName.sendKeys(prop.getProperty("lastName"));
			email.sendKeys(prop.getProperty("email"));
			emailConfirm.sendKeys(prop.getProperty("emailConfirm"));
			password.sendKeys(prop.getProperty("password"));
			confirmpassword.sendKeys(prop.getProperty("confirmpassword"));
			createBtn.click();
			
		}
		
		
		
		
		

	}

	
	
	
	
	
	
