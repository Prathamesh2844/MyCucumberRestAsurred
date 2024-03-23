package com.post_request_SD;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post_StepDefination {
Response response ;
@Given("Create user with valid data")
public void Create_user_with_valid_data() {
	response= RestAssured
			.given()
			.relaxedHTTPSValidation()
			.accept(ContentType.JSON)
			.body("   {\r\n"
					+ "\"name\" : \"anilkale\",\r\n"
					+ "\"job\" : \"Manager\" ,\r\n"
					+ "\"dept\" : \"QA automation\",\r\n"
					+ "\"mob\" : \"111\"\r\n"
					+ "}")
			.post("https://reqres.in/api/users");
	
}

@Then("validate user created.")
public void validate_user_created() {
	
	String allrep = response.asString();
	System.out.println("all details= "+allrep);
	System.out.println("status code= " +response.getStatusCode());
	int statuscode= response.getStatusCode();
	Assert.assertTrue("status matching", statuscode==201);
	
}

}
