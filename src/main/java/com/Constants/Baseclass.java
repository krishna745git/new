package com.Constants;

	
	
	
	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	

public class Baseclass {
		
		public static WebDriver driver;
		public static Properties prop;
		//static PopupWindow popup;
		
		public Baseclass() {
			 
				prop = new Properties();
				FileInputStream file;
				try {
					file = new FileInputStream("C:\\Users\\bharath\\eclipse-workspace\\LuminosHacthon\\src\\main\\java\\com\\Constants\\Config.Properties");
					prop.load(file);
				
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		public static void initialization() throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
			driver.findElement(By.xpath("//a[@class='ltkpopup-close']")).click();
			
			String parent= driver.getWindowHandle();
			System.out.println("Parent id is:  "+parent);
			
			Set<String>  allWindows= driver.getWindowHandles();
			System.out.println("No of windows  "+allWindows.size());
			
			for(String child:allWindows) {
				
				if(!parent.equalsIgnoreCase(child)) {
					
					driver.switchTo().window(child);
					System.out.println("Title of child window"+driver.getTitle());
					driver.close();
				}
			}
			driver.switchTo().window(parent);
			Thread.sleep(1000);
				//popup.clickLater();
		

		/*public static void main(String[] args) throws InterruptedException {
			
			BaseClass b = new BaseClass();
			BaseClass.initialization();
			
		}*/
	}

	
}
	
	
	
	
	


