package ironman.dollartree.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import ironman.dollartree.pageElements.HomePageLocators;
import ironman.utilities.SetupDrivers;


public class HomePageActions {

HomePageLocators HomePageLocatorsObj;

public void navigationDollar() {
	SetupDrivers.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}
	
	public HomePageActions(){
		HomePageLocatorsObj = new HomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, HomePageLocatorsObj);
	}
	
public void mouseHoverKitchen() throws Exception {
		Thread.sleep(100000);
		Actions actions = new Actions(SetupDrivers.driver);
		
		actions.moveToElement(HomePageLocatorsObj.linkKitchen);
		
		actions.perform();
		
		Thread.sleep(100000);
		
		
				
	}
public void clickDinner() throws Exception{
	HomePageLocatorsObj.linkDinner.isEnabled();
	HomePageLocatorsObj.linkDinner.click();
	Thread.sleep(10000);
}

public void mouseHoverToys() throws Exception {
	Thread.sleep(10000);
	Actions actions = new Actions(SetupDrivers.driver);
	
	actions.moveToElement(HomePageLocatorsObj.linkToy);
	
	actions.perform();
	
	Thread.sleep(10000);
	
	
			
}
public void clickAll() throws Exception{
Thread.sleep(5000);
HomePageLocatorsObj.linkAll.isEnabled();
Thread.sleep(5000);
HomePageLocatorsObj.linkAll.click();
Thread.sleep(9000);
}

public void mouseHoverHome() throws Exception {
	Thread.sleep(9000);
	Actions actions = new Actions(SetupDrivers.driver);
	
	actions.moveToElement(HomePageLocatorsObj.linkHome);
	
	actions.perform();
	
	Thread.sleep(9000);
	
	
			
}
public void clickPet() throws Exception{
	Thread.sleep(5000);
HomePageLocatorsObj.linkSupply.isEnabled();
Thread.sleep(5000);
HomePageLocatorsObj.linkSupply.click();
Thread.sleep(5000);
Thread.sleep(9000);
}
	
		
	
	
}




