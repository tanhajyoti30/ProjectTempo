package ironman.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {
	
	public static WebDriver driver;							//initializing driver
	
	public static void setupDriver(){
//		System.setProperty("webdriver.chrome.driver", "C:\\UpSkillSoftware\\chromeDriver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();			//getting the chrome driver from cloud	
		ChromeOptions options = new ChromeOptions();		//initializing chrome options
		options.addArguments("--start-maximized");			//add argument to maximize browser
		options.addArguments("--disable-notifications");	//add argument to diable notifications
//		options.addArguments("--headless");					//headless execution
		driver = new ChromeDriver(options);					//initializing chrome driver
		driver.get("https://www.dollartree.com/");
			//loading the page
//		driver.get("https://www.upskillconsultancy.com/automation-practice");
//		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static WebDriver getDriver(){
		return driver;										//return driver to call
	}
	
	public static void tearDownDriver(){
		driver.close();										//closing current driver
		driver.quit();										//closing all driver
	}
}