package com.riis.etadetroitrestassuredtest;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;

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
		response.then().body("name", Matchers.containsInAnyOrder(Arrays.asList(equalTo("SmartBus"),equalTo("DDOT"),equalTo("RefleX"),equalTo("People Mover"),equalTo("QLine"))));
		response.then().body("brandcolor", Matchers.containsInAnyOrder(Arrays.asList(equalTo("#BC0E29"),equalTo("#054839"),equalTo("#498BC5"),equalTo("#21487A"),equalTo("#973c37"))));
		response.then().body("busImgURL",Matchers.containsInAnyOrder(Arrays.asList(equalTo("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/assets/images/Smart-Bus.png"),equalTo("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/assets/images/ddot-Bus.png"),equalTo("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/assets/images/Reflex-Bus.png"),equalTo("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/assets/images/people-mover.jpg"),equalTo("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/assets/images/qline.jpg"))));
	}
}
