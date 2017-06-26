package com.riis.etadetroitrestassuredtest;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers;
import org.junit.Test;

import com.jayway.restassured.response.Response;

public class CompaniesTest {
	private Response response;

	@Test
	public void testListOfCompanies() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(5));
		response.then().body("busImgURL",Matchers.notNullValue());
		//response.body("find { it.id == '1' }.busImgURL",hasItem("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/assets/images/Smart-Bus.png"));
	}
}
