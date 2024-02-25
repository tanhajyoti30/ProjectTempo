package ironman.dollartree.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import ironman.dollartree.pageElements.HomePageLocators;
import ironman.utilities.SetupDrivers;


public class HomePageActions {

HomePageLocators HomePageLocatorsObj;

public void navigationDollar() {
	SetupDrivers.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
}
	
	public HomePageActions(){
		HomePageLocatorsObj = new HomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, HomePageLocatorsObj);
	}
	
public void mouseHoverKitchen() throws Exception {
		Thread.sleep(5000);
		Actions actions = new Actions(SetupDrivers.driver);
		
		actions.moveToElement(HomePageLocatorsObj.linkKitchen);
		
		actions.perform();
		
		Thread.sleep(5000);
		
		
				
	}
public void clickDinner() throws Exception{
	HomePageLocatorsObj.linkDinner.isEnabled();
	HomePageLocatorsObj.linkDinner.click();
	Thread.sleep(8000);
}
		
	
		
	
	
}




