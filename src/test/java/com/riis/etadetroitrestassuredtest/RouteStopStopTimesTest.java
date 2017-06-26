package com.riis.etadetroitrestassuredtest;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers;
import org.junit.Test;

import com.jayway.restassured.response.Response;

public class RouteStopStopTimesTest {
	
	private Response response;

	@Test
	public void testRouteStopStopTimes_GivenSmartCompanyID_1_RouteID_1_Direction_northbound_Day_weekday_Active_1_ReturnsListOfRouteStopStopTimes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/1/routes/1/northbound/weekday/1/stops");
		response.then().statusCode(200);
		response.then().body("size()", equalTo(10));
		response.then().body("stopName",Matchers.notNullValue());
	}
	@Test
	public void testRouteStopStopTimes_GivenSmartCompanyID_1_RouteID_15_Direction_northbound_Day_weekday_Active_1_ReturnsListOfRouteStopStopTimes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/1/routes/15/northbound/weekday/1/stops");
		response.then().statusCode(200);
		response.then().body("stopName",Matchers.notNullValue());
	}
	@Test
	public void testRouteStopStopTimes_GivenSmartCompanyID_1_RouteID_25_Direction_southbound_Day_weekday_Active_1_ReturnsListOfRouteStopStopTimes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/1/routes/25/southbound/weekday/1/stops");
		response.then().statusCode(200);
		response.then().body("stopName",Matchers.notNullValue());
	}
	@Test
	public void testRouteStopStopTimes_GivenSmartCompanyID_1_RouteID_20_Direction_southbound_Day_weekday_Active_1_ReturnsListOfRouteStopStopTimes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/1/routes/20/southbound/weekday/1/stops");
		response.then().statusCode(200);
		response.then().body("latitude",Matchers.notNullValue());
	}
	@Test
	public void testRouteStopStopTimes_GivenSmartCompanyID_1_RouteID_23_Direction_southbound_Day_saturday_Active_1_ReturnsListOfRouteStopStopTimes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/1/routes/23/southbound/Saturday/1/stops");
		response.then().statusCode(200);
		response.then().body("longitude",Matchers.notNullValue());
	}
	@Test
	public void testRouteStopStopTimes_GivenDDOTCompanyID_2_RouteID_79_Direction_northbound_Day_everyday_Active_1_ReturnsListOfRouteStopStopTimes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/2/routes/79/northbound/everyday/1/stops");
		response.then().statusCode(200);
		response.then().body("latitude",Matchers.notNullValue());
	}
	@Test
	public void testRouteStopStopTimes_GivenDDOTCompanyID_2_RouteID_46_Direction_southbound_Day_everyday_Active_1_ReturnsListOfRouteStopStopTimes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/2/routes/46/southbound/everyday/1/stops");
		response.then().statusCode(200);
		response.then().body("order",Matchers.notNullValue());
	}
	@Test
	public void testRouteStopStopTimes_GivenDDOTCompanyID_2_RouteID_67_Direction_westbound_Day_everyday_Active_1_ReturnsListOfRouteStopStopTimes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/2/routes/67/westbound/everyday/1/stops");
		response.then().statusCode(200);
		response.then().body("stopID",Matchers.notNullValue());
	}
	@Test
	public void testRouteStopStopTimes_GivenDDOTCompanyID_2_RouteID_59_Direction_westbound_Day_everyday_Active_1_ReturnsListOfRouteStopStopTimes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/2/routes/59/westbound/everyday/1/stops");
		response.then().statusCode(200);
		response.then().body("stopID",Matchers.notNullValue());
	}
	@Test
	public void testRouteStopStopTimes_GivenDDOTCompanyID_2_RouteID_76_Direction_southbound_Day_everyday_Active_1_ReturnsListOfRouteStopStopTimes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/2/routes/76/southbound/everyday/1/stops");
		response.then().statusCode(200);
		response.then().body("latitude",Matchers.notNullValue());
	}
	@Test
	public void testRouteStopStopTimes_GivenReflexCompanyID_3_RouteID_86_Direction_southbound_Day_sunday_Active_1_ReturnsListOfRouteStopStopTimes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/3/routes/86/southbound/sunday/1/stops");
		response.then().statusCode(200);
		response.then().body("longitude",Matchers.notNullValue());
	}
	@Test
	public void testRouteStopStopTimes_GivenReflexCompanyID_3_RouteID_87_Direction_southbound_Day_weekday_Active_1_ReturnsListOfRouteStopStopTimes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/3/routes/87/southbound/weekday/1/stops");
		response.then().statusCode(200);
		response.then().body("stopID",Matchers.notNullValue());
	}
	@Test
	public void testRouteStopStopTimes_GivenReflexCompanyID_3_RouteID_88_Direction_southbound_Day_weekday_Active_1_ReturnsListOfRouteStopStopTimes() {
		response = given().contentType("application/json").get("http://ec2-204-236-211-33.compute-1.amazonaws.com:8080/companies/3/routes/88/southbound/weekday/1/stops");
		response.then().statusCode(200);
		response.then().body("stopID",Matchers.notNullValue());
	}

}
