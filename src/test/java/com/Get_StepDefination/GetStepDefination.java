package com.Get_StepDefination;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetStepDefination {

	
	Response response= null;
	@Given("Hit The Bookstore API")
	public void  Hit_The_Bookstore_API() {
		response=RestAssured.get("https://demoqa.com/BookStore/V1/Books");
	}
	
	@Then("validate as status code")
	public void validate_as_status_code() {
		int statuscode= response.getStatusCode();
		Assert.assertTrue("status not matching", statuscode==200);
	}
	
	@Then("Validate Git Pocket Guide title present")
	public void Validate_Git_Pocket_Guide_title_present() {
		String jsonDataString=response.getBody().asString();
		System.out.println("JSON= "+jsonDataString);
		String booktitle=response.getBody().jsonPath().get("books[0].title");
		Assert.assertTrue("title is not matching", booktitle.equals("Git Pocket Guide"));
			
	}
	@Then("Validate Learning JavaScript Design Patterns title present")
	public void validate_learning_java_script_design_patterns_title_present() {
		String jsonDataString=response.getBody().asString();
		System.out.println("JSON= "+jsonDataString);
		String booktitle=response.getBody().jsonPath().get("books[1].title");
		Assert.assertTrue("title is not matching", booktitle.equals("Learning JavaScript Design Patterns"));
			}
	
	@Then("Validate {string} at jsonpath {string} title present")
	public void validate_title_present(String title, String jsonpath ) {
		String jsonDataString=response.getBody().asString();
		System.out.println("JSON= "+jsonDataString);
		String Actulbooktitle=response.getBody().jsonPath().getString(jsonpath);
		Assert.assertTrue("title is not matching", Actulbooktitle.equals(title));
			}
	
	@Then("Validate {string} at jsonpath {string} pagenumber present")
	public void validate_pagenumber_present(String pagenumber, String jsonpath ) {
		String jsonDataString=response.getBody().asString();
		System.out.println("JSON= "+jsonDataString);
		String Actulpagenumber=response.getBody().jsonPath().getString(jsonpath);
		Assert.assertTrue("title is not matching", Actulpagenumber.equals(pagenumber));
			}

    
	
	
}
