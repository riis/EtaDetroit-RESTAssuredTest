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
		response.then().body("brandColor",Matchers.hasItem("#BC0E29"));
		response.then().body("stops[3].latitude[4]", Matchers.equalTo("42.2890629"));
		response.then().body("stops[2].longitude[7]", Matchers.equalTo("-83.26213667"));
	}

	@Test
	public void testRouteStopsLatitudeLongitude_GivenDDOTCompanyID_ReturnsListOfRouteStopsLatitudeLongitude() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/2/routes/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(38));
		response.then().body("brandColor",Matchers.hasItem("#054839"));
		response.then().body("stops[31].latitude[119]", Matchers.equalTo("42.314669"));
		response.then().body("stops[32].longitude[0]", Matchers.equalTo("-83.052317"));
	}
	
	@Test
	public void testRouteStopsLatitudeLongitude_GivenReflexCompanyID_ReturnsListOfRouteStopsLatitudeLongitude() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/3/routes/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(3));
		response.then().body("brandColor",Matchers.hasItem("#498BC5"));
		response.then().body("stops[2].latitude[13]", Matchers.equalTo("42.44929746"));
		response.then().body("stops[2].longitude[21]", Matchers.equalTo("-82.90015333"));
	}
	@Test
	public void testRouteStopsLatitudeLongitude_GivenPeopleMoverCompanyID_ReturnsListOfRouteStopsLatitudeLongitude() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/4/routes/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(1));
		response.then().body("brandColor",Matchers.hasItem("#21487A"));
		response.then().body("stops[0].latitude[7]", Matchers.equalTo("42.330269"));
		response.then().body("stops[0].longitude[12]", Matchers.equalTo("-83.052097"));
	}
	@Test
	public void testRouteStopsLatitudeLongitude_GivenQLineCompanyID_ReturnsListOfRouteStopsLatitudeLongitude() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/5/routes/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(1));
		response.then().body("brandColor",Matchers.hasItem("#973c37"));
		response.then().body("stops[0].latitude[6]", Matchers.equalTo("42.352778"));
		response.then().body("stops[0].longitude[6]", Matchers.equalTo("-83.061389"));
	}
	
}
