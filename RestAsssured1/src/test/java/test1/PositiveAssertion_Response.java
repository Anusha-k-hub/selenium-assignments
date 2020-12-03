package test1;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PositiveAssertion_Response {
	Response response;
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
		RestAssured.baseURI="https://api.ratesapi.io/";
	}
	@When("posted with correct information")
	public void posted_with_correct_information() {
		response=RestAssured.get("/api/latest");
	}

	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
		int statusCode=response.getStatusCode();
		Assert.assertEquals(200,statusCode);
		Assert.assertTrue(statusCode==200);
		//Assert.assertTrue(statusCode!=200);
		
		String statusLine=response.getStatusLine();
		Assert.assertEquals("HTTP/1.1 200 OK", statusLine);
	 }

}
