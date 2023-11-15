package com.spotify.ui.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static com.spotify.ui.api.AuthorizationApi.getAccessToken;
import static com.spotify.ui.helpers.CustomAllureListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.BODY;
import static io.restassured.filter.log.LogDetail.STATUS;

public class TestSpecs {

    public static RequestSpecification requestSpecification = with()
            .log().uri()
            .log().headers()
            .log().body()
            .filter(withCustomTemplates())
            .auth().oauth2(getAccessToken());

    public static ResponseSpecification responseSpecification = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .build();
}
