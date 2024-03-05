package ironman.dollartree.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

		// kitchen MouseHover
		@FindBy(xpath = "//span[contains(text(),'Kitchen & Home Décor')]")
		public WebElement linkKitchen;

		// Dinner link
		@FindBy(xpath = "//div[@class='subcategory']//a[contains(text(),'Glasses & Drinkware')]")
		public WebElement linkDinner;
		
		//Toys Link
		@FindBy(xpath = "//span[contains(text(),'Toys & Crafts')]")
		public WebElement linkToy;
		
		//all Toy Link	
		@FindBy(xpath = "//div[@class='subcategory']//a[@class='see-all'][contains(text(),'See all Toys ›')]")
		public WebElement linkAll;
		
		//Home and Office Link
		@FindBy(xpath = "//span[contains(text(),'Home & Office')]")
		public WebElement linkHome;
		
		//household and pet supply Link
		@FindBy(xpath = "//a[contains(text(),'Household & Pet Supplies')]")
		public WebElement linkSupply;
		
}	



