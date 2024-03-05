package ironman.dollartree.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import ironman.api.restassured.StoreRestassuredActionsTanha;

public class StoreApiTanhaSteps {
	
	StoreRestassuredActionsTanha StoreRestassuredActionsTanhaObj = new StoreRestassuredActionsTanha();
	
	@Given("^Create Store$")
	public void create_Store() throws Throwable {
		StoreRestassuredActionsTanhaObj.createStore();
	}

	@Then("^Get Store$")
	public void get_Store() throws Throwable {
		StoreRestassuredActionsTanhaObj.getStore();
	}



}
