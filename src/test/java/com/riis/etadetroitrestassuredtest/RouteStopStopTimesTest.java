package com.riis.etadetroitrestassuredtest;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;

import org.hamcrest.Matchers;
import org.junit.Test;

public class RouteStopStopTimesTest {
	private static final String DAY_WEEKDAY = "weekday";
	private static final String DAY_SATURDAY = "saturday";
	private static final String DAY_SUNDAY = "sunday";
	private static final String DAY_EVERYDAY = "everyday";

	private static final String COMPANY_ID_SMART = "1";
	private static final String COMPANY_ID_DDOT = "2";
	private static final String COMPANY_ID_REFLEX = "3";
	private static final String ACTIVE = "1";
	
	
	private static final String DIRECTION_NORTHBOUND = "northbound";
	private static final String DIRECTION_SOUTHBOUND = "southbound";
	private static final String DIRECTION_WESTBOUND = "westbound";

	@Test
	public void testRouteStopStopTimes_GivenSmartCompanyID_1_RouteID_1_Direction_northbound_Day_weekday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_SMART).
		and().pathParam("routeId", "1").
		and().pathParam("direction", DIRECTION_NORTHBOUND).
		and().pathParam("day", DAY_WEEKDAY).
		and().pathParam("active", ACTIVE).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/{active}/stops").
		then().statusCode(200).
		and().body("stopName[0]", equalTo("METRO AIRPORT MCNAMARA TERMINAL")).
		and().body("stopID[0]", equalTo("22362"));
	}

	@Test
	public void testRouteStopStopTimes_GivenSmartCompanyID_1_RouteID_15_Direction_northbound_Day_weekday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_SMART).
		and().pathParam("routeId", "15").
		and().pathParam("direction", DIRECTION_NORTHBOUND).
		and().pathParam("day", DAY_WEEKDAY).
		and().pathParam("active", ACTIVE).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/{active}/stops").
		then().statusCode(200).
		and().body("size()", equalTo(9)).
		and().body("stopID", Matchers.hasItem("704")).
		and().body("stopName", Matchers.hasItem("WOODWARD + 11 MILE RD")).
		and().body("latitude", Matchers.hasItem("42.49029662"));
	}

	@Test
	public void testRouteStopStopTimes_GivenSmartCompanyID_1_RouteID_25_Direction_southbound_Day_weekday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_SMART).
		and().pathParam("routeId", "25").
		and().pathParam("direction", DIRECTION_SOUTHBOUND).
		and().pathParam("day", DAY_WEEKDAY).
		and().pathParam("active", ACTIVE).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/{active}/stops").
		then().statusCode(200).
		and().body("size()", equalTo(6)).
		and().body("latitude", Matchers.hasItem("42.5318379")).
		and().body("longitude", Matchers.hasItem("-82.91444875"));
	}

	@Test
	public void testRouteStopStopTimes_GivenSmartCompanyID_1_RouteID_20_Direction_southbound_Day_weekday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_SMART).
		and().pathParam("routeId", "20").
		and().pathParam("direction", DIRECTION_SOUTHBOUND).
		and().pathParam("day", DAY_WEEKDAY).
		and().pathParam("active", ACTIVE).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/{active}/stops").
		then().statusCode(200).
		and().body("size()", equalTo(9)).
		and().body("stopID", Matchers.hasItem("9722")).
		and().body("stopName", Matchers.hasItem("DEQUINDRE + 15 MILE RD SW"));
	}

	@Test
	public void testRouteStopStopTimes_GivenSmartCompanyID_1_RouteID_23_Direction_southbound_Day_saturday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_SMART).
		and().pathParam("routeId", "23").
		and().pathParam("direction", DIRECTION_SOUTHBOUND).
		and().pathParam("day", DAY_SATURDAY).
		and().pathParam("active", ACTIVE).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/{active}/stops").
		then().statusCode(200).
		and().body("size()", equalTo(9)).
		and().body("stopID", Matchers.hasItem("852")).
		and().body("stopName", Matchers.hasItem("VAN DYKE + 16 MILE RD"));
	}

	@Test
	public void testRouteStopStopTimes_GivenDDOTCompanyID_2_RouteID_79_Direction_northbound_Day_everyday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_DDOT).
		and().pathParam("routeId", "79").
		and().pathParam("direction", DIRECTION_NORTHBOUND).
		and().pathParam("day", DAY_EVERYDAY).
		and().pathParam("active", ACTIVE).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/{active}/stops").
		then().statusCode(200).
		and().body("size()", equalTo(8)).
		and().body("stopID", Matchers.hasItem("DDOT_372")).
		and().body("stopName", Matchers.hasItem("Greenfield & Michigan"));
	}

	@Test
	public void testRouteStopStopTimes_GivenDDOTCompanyID_2_RouteID_46_Direction_southbound_Day_everyday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_DDOT).
		and().pathParam("routeId", "46").
		and().pathParam("direction", DIRECTION_SOUTHBOUND).
		and().pathParam("day", DAY_EVERYDAY).
		and().pathParam("active", ACTIVE).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/{active}/stops").
		then().statusCode(200).
		and().body("size()", equalTo(7)).
		and().body("stopID", Matchers.hasItem("DDOT_8944")).
		and().body("stopName", Matchers.hasItem("Rosa Parks Transit 40 Nb")).
		and().body("latitude", Matchers.hasItem("42.332779"));
	}

	@Test
	public void testRouteStopStopTimes_GivenDDOTCompanyID_2_RouteID_67_Direction_westbound_Day_everyday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_DDOT).
		and().pathParam("routeId", "67").
		and().pathParam("direction", DIRECTION_WESTBOUND).
		and().pathParam("day", DAY_EVERYDAY).
		and().pathParam("active", ACTIVE).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/{active}/stops").
		then().statusCode(200).
		and().body("size()", equalTo(6)).
		and().body("latitude", Matchers.hasItem("42.330142")).
		and().body("longitude", Matchers.hasItem("-83.040176"));
	}

	@Test
	public void testRouteStopStopTimes_GivenDDOTCompanyID_2_RouteID_59_Direction_westbound_Day_everyday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_DDOT).
		and().pathParam("routeId", "59").
		and().pathParam("direction", DIRECTION_WESTBOUND).
		and().pathParam("day", DAY_EVERYDAY).
		and().pathParam("active", ACTIVE).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/{active}/stops").
		then().statusCode(200).
		and().body("size()", equalTo(7)).
		and().body("stopID", Matchers.hasItem("DDOT_115")).
		and().body("stopName", Matchers.hasItem("Lycaste & Jefferson"));
	}

	@Test
	public void testRouteStopStopTimes_GivenDDOTCompanyID_2_RouteID_76_Direction_southbound_Day_everyday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_DDOT).
		and().pathParam("routeId", "76").
		and().pathParam("direction", DIRECTION_SOUTHBOUND).
		and().pathParam("day", DAY_EVERYDAY).
		and().pathParam("active", ACTIVE).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/{active}/stops").
		then().statusCode(200).
		and().body("size()", equalTo(9)).
		and().body("stopID", Matchers.hasItem("DDOT_260")).
		and().body("stopName", Matchers.hasItem("Fenkell & Schaefer"));
	}

	@Test
	public void testRouteStopStopTimes_GivenReflexCompanyID_3_RouteID_86_Direction_southbound_Day_sunday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_REFLEX).
		and().pathParam("routeId", "86").
		and().pathParam("direction", DIRECTION_SOUTHBOUND).
		and().pathParam("day", DAY_SUNDAY).
		and().pathParam("active", ACTIVE).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/{active}/stops").
		then().statusCode(200).
		and().body("size()", equalTo(14)).
		and().body("stopID", Matchers.hasItem("DDOT_127")).
		and().body("stopName", Matchers.hasItem("State Fairgrounds Transit Center"));
	}

	@Test
	public void testRouteStopStopTimes_GivenReflexCompanyID_3_RouteID_87_Direction_southbound_Day_weekday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_REFLEX).
		and().pathParam("routeId", "87").
		and().pathParam("direction", DIRECTION_SOUTHBOUND).
		and().pathParam("day", DAY_WEEKDAY).
		and().pathParam("active", ACTIVE).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/{active}/stops").
		then().statusCode(200).
		and().body("stopID", Matchers.hasItem("23766")).
		and().body("stopName", Matchers.hasItem("Farmer + Bates")).
		and().body("latitude", Matchers.hasItem("42.33259829"));
	}

	@Test
	public void testRouteStopStopTimes_GivenReflexCompanyID_3_RouteID_88_Direction_southbound_Day_weekday_Active_1_ReturnsListOfRouteStopStopTimes() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_REFLEX).
		and().pathParam("routeId", "88").
		and().pathParam("direction", DIRECTION_SOUTHBOUND).
		and().pathParam("day", DAY_WEEKDAY).
		and().pathParam("active", ACTIVE).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/{companyId}/routes/{routeId}/{direction}/{day}/{active}/stops").
		then().statusCode(200).
		and().body("size()", equalTo(6)).
		and().body("latitude", Matchers.hasItem("42.330142")).
		and().body("longitude", Matchers.hasItem("-83.040176")).
		and().body("stopTimes[2]", Matchers.containsInAnyOrder(Arrays.asList(equalTo("6:39AM"), equalTo("8:54AM"), equalTo("5:15PM"))));
	}

}
