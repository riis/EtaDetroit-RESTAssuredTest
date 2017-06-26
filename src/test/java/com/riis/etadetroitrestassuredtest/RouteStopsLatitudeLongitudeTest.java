package com.riis.etadetroitrestassuredtest;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers;
import org.junit.Test;

import com.jayway.restassured.response.Response;

public class RouteStopsLatitudeLongitudeTest {
	private Response response;

	@Test
	public void testRouteStopsLatitudeLongitude_GivenSmartCompanyID_ReturnsListOfRouteStopsLatitudeLongitude() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/1/routes/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(45));
		response.then().body("brandColor",Matchers.notNullValue());
		
	}

	@Test
	public void testRouteStopsLatitudeLongitude_GivenDDOTCompanyID_ReturnsListOfRouteStopsLatitudeLongitude() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/2/routes/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(38));
		response.then().body("brandColor",Matchers.notNullValue());
	}
	
	@Test
	public void testRouteStopsLatitudeLongitude_GivenReflexCompanyID_ReturnsListOfRouteStopsLatitudeLongitude() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/3/routes/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(3));
		response.then().body("brandColor",Matchers.notNullValue());
	}
	@Test
	public void testRouteStopsLatitudeLongitude_GivenPeopleMoverCompanyID_ReturnsListOfRouteStopsLatitudeLongitude() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/4/routes/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(1));
		response.then().body("brandColor",Matchers.notNullValue());
	}
	@Test
	public void testRouteStopsLatitudeLongitude_GivenQLineCompanyID_ReturnsListOfRouteStopsLatitudeLongitude() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/5/routes/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(1));
		response.then().body("brandColor",Matchers.notNullValue());
	}
	
}
