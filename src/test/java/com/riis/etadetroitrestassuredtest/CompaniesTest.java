package com.riis.etadetroitrestassuredtest;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;

import org.hamcrest.Matchers;
import org.junit.Test;

public class CompaniesTest {
	@Test
	public void testListOfCompanies() {
		given().contentType("application/json").
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies").
		then().statusCode(200).
		and().body("size()", equalTo(5)).
		and().body("name", Matchers.containsInAnyOrder(Arrays.asList(equalTo("SmartBus"),equalTo("DDOT"),equalTo("RefleX"),equalTo("People Mover"),equalTo("QLine")))).
		and().body("brandcolor", Matchers.containsInAnyOrder(Arrays.asList(equalTo("#BC0E29"),equalTo("#054839"),equalTo("#498BC5"),equalTo("#21487A"),equalTo("#973c37")))).
		and().body("busImgURL",Matchers.containsInAnyOrder(Arrays.asList(equalTo("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/assets/images/Smart-Bus.png"),equalTo("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/assets/images/ddot-Bus.png"),equalTo("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/assets/images/Reflex-Bus.png"),equalTo("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/assets/images/people-mover.jpg"),equalTo("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/assets/images/qline.jpg"))));
	}
}

