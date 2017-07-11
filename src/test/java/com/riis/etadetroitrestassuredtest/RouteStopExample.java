package com.riis.etadetroitrestassuredtest;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers;
import org.junit.Test;

public class RouteStopExample {

	private static final String DAY_WEEKDAY = "weekday";
	private static final String DAY_EVERYDAY = "everyday";

	private static final String COMPANY_ID_SMART = "1";
	private static final String COMPANY_ID_DDOT = "2";
	private static final String COMPANY_ID_REFLEX = "3";
	
	
	private static final String DIRECTION_NORTHBOUND = "northbound";
	private static final String DIRECTION_SOUTHBOUND = "southbound";

	
	@Test
	public void testRouteStopStopTimes_GivenSmartCompanyID_1_RouteID_15_Direction_northbound_Day_weekday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_SMART).
		and().pathParam("routeId", "1").
		and().pathParam("direction", DIRECTION_NORTHBOUND).
		and().pathParam("day", DAY_WEEKDAY).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/1/stops").
		then().statusCode(200).
		and().body("stopName[0]", equalTo("METRO AIRPORT MCNAMARA TERMINAL")).
		and().body("stopID[0]", equalTo("22362"));
	}


	@Test
	public void testRouteStopStopTimes_GivenDDOTCompanyID_2_RouteID_79_Direction_northbound_Day_everyday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_DDOT).
		and().pathParam("routeId", "79").
		and().pathParam("direction", DIRECTION_NORTHBOUND).
		and().pathParam("day", DAY_EVERYDAY).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/1/stops").
		then().statusCode(200).
		and().body("stopName[1]", equalTo("Greenfield & Michigan")).
		and().body("stopID[1]", equalTo("DDOT_372"));

	}

	@Test
	public void testRouteStopStopTimes_GivenDDOTCompanyID_2_RouteID_46_Direction_southbound_Day_everyday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_DDOT).
		and().pathParam("routeId", "46").
		and().pathParam("direction", DIRECTION_SOUTHBOUND).
		and().pathParam("day", DAY_EVERYDAY).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/1/stops").
		then().statusCode(200).
		and().body("stopName", Matchers.hasItem("Rosa Parks Transit 40 Nb")).
		and().body("latitude", Matchers.hasItem("42.332779"));

	}

	@Test
	public void testRouteStopStopTimes_GivenReflexCompanyID_3_RouteID_87_Direction_southbound_Day_weekday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_REFLEX).
		and().pathParam("routeId", "87").
		and().pathParam("direction", DIRECTION_SOUTHBOUND).
		and().pathParam("day", DAY_WEEKDAY).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/1/stops").
		then().statusCode(200).
		and().body("latitude", Matchers.hasItem("42.59850661")).
		and().body("longitude", Matchers.hasItem("-82.86757"));
	}

	
}
