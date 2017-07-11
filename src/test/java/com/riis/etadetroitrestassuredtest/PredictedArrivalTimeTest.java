package com.riis.etadetroitrestassuredtest;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

public class PredictedArrivalTimeTest {
	private static final String COMPANY_ID_SMART = "1";
	private static final String COMPANY_ID_DDOT = "2";
	private static final String DIRECTION_NORTHBOUND = "northbound";
	private static final String DIRECTION_WESTBOUND = "westbound";

	@Test
	public void testSmartPredictedArrivalTime_GivenSmartCompanyID_1_RouteID_1_StopID_117_Direction_northbound_ReturnsPredictedArrivalTime() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_SMART).
		and().pathParam("routeId", "1").
		and().pathParam("stopId", "117").
		and().pathParam("direction", DIRECTION_NORTHBOUND).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID={companyId}&routeID={routeId}&stopID={stopId}&direction={direction}").
		then().statusCode(200);
		
	}

	@Test
	public void testSmartPredictedArrivalTime_GivenSmartCompanyID_1_RouteID_5_StopID_211_Direction_westbound_ReturnsPredictedArrivalTime() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_SMART).
		and().pathParam("routeId", "5").
		and().pathParam("stopId", "211").
		and().pathParam("direction", DIRECTION_WESTBOUND).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID={companyId}&routeID={routeId}&stopID={stopId}&direction={direction}").
		then().statusCode(200);
	}

	@Test
	public void testSmartPredictedArrivalTime_GivenSmartCompanyID_1_RouteID_16_StopID_19_Direction_northbound_ReturnsPredictedArrivalTime() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_SMART).
		and().pathParam("routeId", "16").
		and().pathParam("stopId", "19").
		and().pathParam("direction", DIRECTION_NORTHBOUND).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID={companyId}&routeID={routeId}&stopID={stopId}&direction={direction}").
		then().statusCode(200);
	}

	@Test
	public void testDDOTPredictedArrivalTime_GivenSmartCompanyID_2_RouteID_46_StopID_DDOT_8944_Direction_northbound_ReturnsPredictedArrivalTime() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_DDOT).
		and().pathParam("routeId", "46").
		and().pathParam("stopId", "DDOT_8944").
		and().pathParam("direction", DIRECTION_NORTHBOUND).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID={companyId}&routeID={routeId}&stopID={stopId}&direction={direction}").
		then().statusCode(200);
	}
	@Test
	public void testDDOTPredictedArrivalTime_GivenSmartCompanyID_2_RouteID_53_StopID_DDOT_6056_Direction_northbound_ReturnsPredictedArrivalTime() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_DDOT).
		and().pathParam("routeId", "46").
		and().pathParam("stopId", "DDOT_6056").
		and().pathParam("direction", DIRECTION_NORTHBOUND).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID={companyId}&routeID={routeId}&stopID={stopId}&direction={direction}").
		then().statusCode(200);
	}
	@Test
	public void testDDOTPredictedArrivalTime_GivenSmartCompanyID_2_RouteID_67_StopID_DDOT_201_Direction_westbound_ReturnsPredictedArrivalTime() {
		given().contentType("application/json").
		and().pathParam("companyId", COMPANY_ID_DDOT).
		and().pathParam("routeId", "67").
		and().pathParam("stopId", "DDOT_201").
		and().pathParam("direction", DIRECTION_WESTBOUND).
		when().get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID={companyId}&routeID={routeId}&stopID={stopId}&direction={direction}").
		then().statusCode(200);
		}

}
