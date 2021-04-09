package ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utilities {
	
	
	
	WebDriver driver;
	

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


	}
}
