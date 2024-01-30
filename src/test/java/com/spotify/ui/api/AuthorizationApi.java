package com.spotify.ui.api;

import com.spotify.ui.config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import static io.restassured.RestAssured.given;

public class AuthorizationApi {
    private static final ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
    private static final String CLIENT_ID = "a4395f5889ae46338282ed143b3c36c4";
    private static final String CLIENT_SECRET = "4f874b025e8e4c15ae5ed0023c556654";

    public static String encode(String str1, String str2) {
        return Base64.getEncoder().encodeToString((str1 + ":" + str2).getBytes(StandardCharsets.UTF_8));
    }

    public static String getAccessToken() {
        String encodedCredentials = encode(CLIENT_ID, CLIENT_SECRET);

        return given().contentType("application/x-www-form-urlencoded").formParam("grant_type", "client_credentials").header("Authorization", "Basic " + encodedCredentials).when().post(apiConfig.getAuthUrl() + "/api/token").then().extract().path("access_token");
    }
}
