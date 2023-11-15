package com.spotify.ui.api;

import com.spotify.ui.models.Album;
import com.spotify.ui.models.Error;
import io.qameta.allure.Step;

import static com.spotify.ui.specs.TestSpecs.requestSpecification;
import static com.spotify.ui.specs.TestSpecs.responseSpecification;
import static io.restassured.RestAssured.given;

public class AlbumsApi {
    @Step("Send GET /albums/{id}")
    public static Album getValidAlbum(String id) {
        return given(requestSpecification)
                .when()
                .get("v1/albums/{id}", id)
                .then()
                .spec(responseSpecification)
                .extract()
                .as(Album.class);
    }

    @Step("Send GET /albums/{id}")
    public static Error getInvalidAlbum(String id) {
        return given(requestSpecification)
                .when()
                .get("v1/albums/{id}", id)
                .then()
                .spec(responseSpecification)
                .extract()
                .as(Error.class);
    }

    @Step("Send GET /albums/{id}?market={market}")
    public static Album getValidAlbum(String id, String market) {
        return given(requestSpecification)
                .when()
                .get("v1/albums/{id}?market={market}", id, market)
                .then()
                .spec(responseSpecification)
                .extract()
                .as(Album.class);
    }

    @Step("Send GET /albums/{id}?market={market}")
    public static Error getInvalidAlbum(String id, String market) {
        return given(requestSpecification)
                .when()
                .get("v1/albums/{id}?market={market}", id, market)
                .then()
                .spec(responseSpecification)
                .extract()
                .as(Error.class);
    }
}
