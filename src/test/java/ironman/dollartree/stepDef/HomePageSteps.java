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
	
	@When("^Mouse Hover to Toys & Crafts$")
	public void mouse_Hover_to_Toys_Crafts() throws Throwable {
		HomePageActionsObj.mouseHoverToys();
	}
	@Then("^Click on See all toys$")
	public void click_on_See_all_toys() throws Throwable {
		HomePageActionsObj.clickAll();
	}
	
	
	@When("^Mouse Hover to Home & Office$")
	public void mouse_Hover_to_Home_Office() throws Throwable {
		HomePageActionsObj.mouseHoverHome();
	}

	@Then("^Click on HOUSEHOLD & PET SUPPLIES$")
	public void click_on_HOUSEHOLD_PET_SUPPLIES() throws Throwable {
		HomePageActionsObj.clickPet();
	}

}
