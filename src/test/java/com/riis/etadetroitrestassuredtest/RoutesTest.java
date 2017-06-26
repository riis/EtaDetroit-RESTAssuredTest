package com.riis.etadetroitrestassuredtest;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers;
import org.junit.Test;

import com.jayway.restassured.response.Response;

public class RoutesTest {
	private Response response;
	
	@Test
	public void testRoutes_GivenSmartCompanyID_ReturnsListOfRoutes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/1/routes/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(45));
		response.then().body("routeName",Matchers.notNullValue());
	}
	@Test
	public void testRoutes_GivenDDOTCompanyID_ReturnsListOfRoutes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/2/routes/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(38));
		response.then().body("routeName",Matchers.notNullValue());
	}

	@Test
	public void testRoutes_GivenReflexCompanyID_ReturnsListOfRoutes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/3/routes/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(3));
		response.then().body("routeName",Matchers.notNullValue());
	}
	
	@Test
	public void testRoutes_GivenPeopleMoverCompanyID_ReturnsListOfRoutes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/4/routes/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(1));
		response.then().body("routeName",Matchers.notNullValue());
	}
	@Test
	public void testRoutes_GivenQLineCompanyID_ReturnsListOfRoutes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/5/routes/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(1));
		response.then().body("routeName",Matchers.notNullValue());
	}
}
