package com.riis.etadetroitrestassuredtest;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers;
import org.junit.Test;

public class RoutesTest {
	private static final String COMPANY_ID_SMART = "1";
	private static final String COMPANY_ID_DDOT = "2";
	private static final String COMPANY_ID_REFLEX = "3";
	private static final String COMPANY_ID_PEOPLEMOVER = "4";
	private static final String COMPANY_ID_QLINE = "5";
	
	@Test
	public void testRoutes_GivenSmartCompanyID_ReturnsListOfRoutes() {
		 given().contentType("application/json").
		 and().pathParam("companyID", COMPANY_ID_SMART).
		 when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyID}/routes/stops").
		 then().statusCode(200).
		 and().body("size()", equalTo(45)).
		 and().body("routeName",Matchers.hasItem("MICHIGAN AVENUE LOCAL")).
		 and().body("brandColor",Matchers.hasItem("#BC0E29")).
		 and().body("stops[1].latitude[6]", Matchers.equalTo("42.284064"));
	}
	
	@Test
	public void testRoutes_GivenDDOTCompanyID_ReturnsListOfRoutes() {
		 given().contentType("application/json").
		 and().pathParam("companyID", COMPANY_ID_DDOT).
		 when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyID}/routes/stops").
		 then().statusCode(200).
		 and().body("size()", equalTo(38)).
		 and().body("routeName",Matchers.hasItem("JEFFERSON")).
		 and().body("brandColor",Matchers.hasItem("#054839")).
		 and().body("stops[0].latitude", Matchers.hasItem("42.356817"));
	}

	@Test
	public void testRoutes_GivenReflexCompanyID_ReturnsListOfRoutes() {
		 given().contentType("application/json").
		 and().pathParam("companyID", COMPANY_ID_REFLEX).
		 when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyID}/routes/stops").
		 then().statusCode(200).
		 and().body("size()", equalTo(3)).
		 and().body("routeName",Matchers.hasItem("GRATIOT REFLEX to DETROIT")).
		 and().body("brandColor",Matchers.hasItem("#498BC5")).
		 and().body("stops[0].latitude[7]", Matchers.equalTo("42.441410"));
	}
	
	@Test
	public void testRoutes_GivenPeopleMoverCompanyID_ReturnsListOfRoutes() {
		 given().contentType("application/json").
		 and().pathParam("companyID", COMPANY_ID_PEOPLEMOVER).
		 when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyID}/routes/stops").
		 then().statusCode(200).
		 and().body("size()", equalTo(1)).
		 and().body("routeName",Matchers.hasItem("People Mover")).
		 and().body("brandColor",Matchers.hasItem("#21487A")).
		 and().body("stops[0].latitude[3]", Matchers.equalTo("42.333735"));
	}
	@Test
	public void testRoutes_GivenQLineCompanyID_ReturnsListOfRoutes() {
		given().contentType("application/json").
		 and().pathParam("companyID", COMPANY_ID_QLINE).
		 when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyID}/routes/stops").
		 then().statusCode(200).
		 and().body("size()", equalTo(1)).
		 and().body("routeName",Matchers.hasItem("QLine")).
		 and().body("brandColor",Matchers.hasItem("#973c37")).
		 and().body("stops[0].latitude", Matchers.hasItem("42.33578"));
	}
}
