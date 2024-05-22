package com.cucumber.utilities;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import com.cucumber.base.CommonMethods;
import com.cucumber.files.Payload;

public class API_Handler {
	
	
	//validate_POST_Method    given -- all input details (query parameters, headers, body), when -- submit the API (resource, http methods), then -- validate the response
	
	 // public static void validatePOST(String baseURI) {
	 public static void main(String[] args) {
		 
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		 String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(Payload.addPlace())
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("Server", "Apache/2.4.52 (Ubuntu)")
		.extract().response().asString();
		 
		 System.out.println(response);
		 
		 //Add Place -> Update Place with new address -> Get Place to validate if new address is present in response
		 
		 String placeID =  CommonMethods.parseJson(response, "place_id");
		 System.out.println(placeID);
		 
		// public static void validatePUT(String baseURI) {
		// update place
		 
		 String newAddress = "70 Summer walk, USA";
		 
		  given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		 .body("{\r\n"
		 		+ "\"place_id\":\""+placeID+"\",\r\n"
		 		+ "\"address\":\""+newAddress+"\",\r\n"
		 		+ "\"key\":\"qaclick123\"\r\n"
		 		+ "}")
		 .when().put("/maps/api/place/update/json")
		 .then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		 
		 
		// public static void validateGET(String baseURI) {
			// get place
			 
			  String getResp = given().log().all().queryParam("key", "qaclick123")
			 .queryParam("place_id", placeID)
			 .when().get("/maps/api/place/get/json")
			 .then().assertThat().statusCode(200).extract().response().asString();
		 
			 String actualAddress =  CommonMethods.parseJson(getResp, "address");
			 System.out.println(actualAddress);
			 
			 //assertion using TestNg
			 Assert.assertEquals(actualAddress, newAddress);
			 
	 
	 }
	 
	
	  
	  
	

}
