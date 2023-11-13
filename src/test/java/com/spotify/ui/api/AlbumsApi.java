package com.spotify.ui.api;

import com.spotify.ui.models.Album;
import com.spotify.ui.tests.TestBase;
import io.restassured.RestAssured;

import static com.spotify.ui.specs.TestSpecs.requestSpecification;
import static com.spotify.ui.specs.TestSpecs.responseSpecStatusCodeIs200;
import static io.restassured.RestAssured.given;

public class AlbumsApi {
    public static Album getAlbum(String id, String accessToken) {
        return given(requestSpecification)
                .auth()
                .oauth2(accessToken)
                .when()
                .get("v1/albums/{id}", id)
                .then()
                .spec(responseSpecStatusCodeIs200)
                .extract()
                .as(Album.class);
    }

    public static Album getAlbum(String id, String market, String accessToken) {
        return given(requestSpecification)
                .auth()
                .oauth2(accessToken)
                .when()
                .get("v1/albums/{id}?market={market}", id, market)
                .then()
                .spec(responseSpecStatusCodeIs200)
                .extract()
                .as(Album.class);
    }
}
