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
}	
	

