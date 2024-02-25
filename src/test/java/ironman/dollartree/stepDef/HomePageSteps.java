package ironman.dollartree.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ironman.dollartree.pageAction.HomePageActions;

public class HomePageSteps {
	HomePageActions HomePageActionsObj = new HomePageActions();
	
	@Given("^Open DollarTree Homepage$")
	public void open_DollarTree_Homepage() throws Throwable {
		HomePageActionsObj.navigationDollar();
	}

	@When("^Mouse Hover to Kitchen & Home Décor$")
	public void mouse_Hover_to_Kitchen_Home_Décor() throws Throwable {
		HomePageActionsObj.mouseHoverKitchen();  
	}

	@Then("^Click on Glasses & Drinkware$")
	public void click_on_Glasses_Drinkware() throws Throwable {
		HomePageActionsObj.clickDinner();
	} 

}
