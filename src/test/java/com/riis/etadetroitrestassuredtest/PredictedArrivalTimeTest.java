package com.riis.etadetroitrestassuredtest;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

import com.jayway.restassured.response.Response;

public class PredictedArrivalTimeTest {
	private Response response;

	@Test
	public void testSmartPredictedArrivalTime_GivenSmartCompanyID_1_RouteID_1_StopID_117_Direction_northbound_ReturnsPredictedArrivalTime() {
		response = given().contentType("application/json")
				.get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID=1&routeID=1&stopID=117&direction=northbound");
		response.then().statusCode(200);
		
	}

	@Test
	public void testSmartPredictedArrivalTime_GivenSmartCompanyID_1_RouteID_5_StopID_211_Direction_westbound_ReturnsPredictedArrivalTime() {
		response = given().contentType("application/json")
				.get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID=1&routeID=5&stopID=211&direction=westbound");
		response.then().statusCode(200);
	}

	@Test
	public void testSmartPredictedArrivalTime_GivenSmartCompanyID_1_RouteID_16_StopID_19_Direction_northbound_ReturnsPredictedArrivalTime() {
		response = given().contentType("application/json")
				.get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID=1&routeID=16&stopID=19&direction=northbound");
		response.then().statusCode(200);
	}

	@Test
	public void testDDOTPredictedArrivalTime_GivenSmartCompanyID_2_RouteID_46_StopID_DDOT_8944_Direction_northbound_ReturnsPredictedArrivalTime() {
		response = given().contentType("application/json")
				.get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID=2&routeID=46&stopID=DDOT_8944&direction=northbound");
		response.then().statusCode(200);
	}
	@Test
	public void testDDOTPredictedArrivalTime_GivenSmartCompanyID_2_RouteID_53_StopID_DDOT_6056_Direction_northbound_ReturnsPredictedArrivalTime() {
		response = given().contentType("application/json")
				.get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID=2&routeID=53&stopID=DDOT_6056&direction=northbound");
		response.then().statusCode(200);
	}
	@Test
	public void testDDOTPredictedArrivalTime_GivenSmartCompanyID_2_RouteID_67_StopID_DDOT_201_Direction_westbound_ReturnsPredictedArrivalTime() {
		response = given().contentType("application/json")
				.get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/predictedtime?companyID=2&routeID=67&stopID=DDOT_201&direction=westbound");
		response.then().statusCode(200);
	}

}
