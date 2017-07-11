package com.riis.etadetroitrestassuredtest;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

import com.jayway.restassured.response.Response;

public class PredictedArrivalTimeTest {
	private Response response;

	private static final String COMPANY_ID_SMART = "1";
	private static final String COMPANY_ID_DDOT = "2";
	private static final String DIRECTION_NORTHBOUND = "northbound";
	private static final String DIRECTION_WESTBOUND = "westbound";

	@Test
	public void testSmartPredictedArrivalTime_GivenSmartCompanyID_1_RouteID_1_StopID_117_Direction_northbound_ReturnsPredictedArrivalTime() {
		given().contentType("application/json").
		and().queryParam("companyId", COMPANY_ID_SMART).
		and().queryParam("routeId", "1").
		and().queryParam("stopId", "117").
		and().queryParam("direction", DIRECTION_NORTHBOUND).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID=1&routeID=1&stopID=117&direction=northbound").
		then().statusCode(200);
		
	}

	@Test
	public void testSmartPredictedArrivalTime_GivenSmartCompanyID_1_RouteID_5_StopID_211_Direction_westbound_ReturnsPredictedArrivalTime() {
		given().contentType("application/json").
		and().queryParam("companyId", COMPANY_ID_SMART).
		and().queryParam("routeId", "5").
		and().queryParam("stopId", "211").
		and().queryParam("direction", DIRECTION_WESTBOUND).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID=1&routeID=5&stopID=211&direction=westbound").
		then().statusCode(200);
	}

	@Test
	public void testSmartPredictedArrivalTime_GivenSmartCompanyID_1_RouteID_16_StopID_19_Direction_northbound_ReturnsPredictedArrivalTime() {
		response = given().contentType("application/json")
				.get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID=1&routeID=16&stopID=19&direction=northbound");
		response.then().statusCode(200);
	}

	@Test
	public void testDDOTPredictedArrivalTime_GivenSmartCompanyID_2_RouteID_46_StopID_DDOT_8944_Direction_northbound_ReturnsPredictedArrivalTime() {
		given().contentType("application/json").
		and().queryParam("companyId", COMPANY_ID_DDOT).
		and().queryParam("routeId", "46").
		and().queryParam("stopId", "DDOT_8944").
		and().queryParam("direction", DIRECTION_NORTHBOUND).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID=2&routeID=46&stopID=DDOT_8944&direction=northbound").
		then().statusCode(200);
	}
	@Test
	public void testDDOTPredictedArrivalTime_GivenSmartCompanyID_2_RouteID_53_StopID_DDOT_6056_Direction_northbound_ReturnsPredictedArrivalTime() {
		given().contentType("application/json").
		and().queryParam("companyId", COMPANY_ID_DDOT).
		and().queryParam("routeId", "46").
		and().queryParam("stopId", "DDOT_6056").
		and().queryParam("direction", DIRECTION_NORTHBOUND).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID=2&routeID=53&stopID=DDOT_6056&direction=northbound").
		then().statusCode(200);
	}
	@Test
	public void testDDOTPredictedArrivalTime_GivenSmartCompanyID_2_RouteID_67_StopID_DDOT_201_Direction_westbound_ReturnsPredictedArrivalTime() {
		given().contentType("application/json").
		and().queryParam("companyId", COMPANY_ID_DDOT).
		and().queryParam("routeId", "67").
		and().queryParam("stopId", "DDOT_201").
		and().queryParam("direction", DIRECTION_WESTBOUND).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID=2&routeID=67&stopID=DDOT_201&direction=westbound").
		then().statusCode(200);
		}

}
