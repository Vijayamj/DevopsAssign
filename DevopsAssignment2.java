package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DevopsAssignment2 {
	
public static WebDriver driver;
	
	public static WebDriver launchApplication(int browser, String baseUrl) {
		
		switch(browser){
			
			case 1: 
				    System.setProperty("webdriver.chrome.driver", "D:\\auomation testing course\\softwares\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
			        driver = new ChromeDriver();
			        break;
			        
			case 2: 
				    System.setProperty("webdriver.gecko.driver", "D:\\auomation testing course\\softwares\\geckodriver-win64\\geckodriver-win64\\geckodriver.exe");
	                driver = new FirefoxDriver();
	                break;
	                
			case 3: 
				    System.setProperty("webdriver.ie.driver", "D:\\auomation testing course\\softwares\\iedriver-win64\\iedriver-win64\\iedriver.exe");
	                driver = new InternetExplorerDriver();
	                break;
	                
			default: 
				    System.setProperty("webdriver.chrome.driver", "D:\\auomation testing course\\softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	                driver = new ChromeDriver();
	                break;    
			
		}
		
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		
		
		
		return driver;
	}

	public static void main(String[] args) {
		
		 int browserChoice = 1; 
		 String baseUrl = "https://www.amazon.com";
		 WebDriver driver = launchApplication(browserChoice, baseUrl);
		
		 driver.quit();
	}

}
