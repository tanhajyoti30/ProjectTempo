package ironman.api.restassured;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;

public class StoreRestassuredActionsTanha {
	
	public void createStore(){
		given().														//Request Payload
			body(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiRequestPayloads/StoreRequestCreateTanha.json")).
		when().															//Setting the Header & Request url
			header("content-type", "application/json").
			header("username", "upskill").
			header("password", "12345").
			post("https://petstore.swagger.io/v2/store/order").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiResponseSchemas/CreateStoreResponseTanha.json")));	
	}
	
	public void getStore(){
		given().
		when().															//Setting the Header & Request url
			header("content-type", "application/json").
			header("username", "upskill").
			header("password", "12345").
			get("https://petstore.swagger.io/v2/store/order/7").
		then().															//Printing Response in console
			log().body().
		and().															//Verify status code
			assertThat().statusCode(200).
		and().															//Verify Response using json schema
			body(matchesJsonSchema(new File(System.getProperty("user.dir") 
					+ "/src/test/resource/ApiResponseSchemas/GetStoreResponseTanha.json")));
	}
	
	
}
