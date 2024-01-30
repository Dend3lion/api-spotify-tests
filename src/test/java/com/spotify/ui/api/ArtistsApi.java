package com.spotify.ui.api;

import com.spotify.ui.models.responses.Artist;
import io.qameta.allure.Step;

import static com.spotify.ui.specs.TestSpecs.requestSpecification;
import static com.spotify.ui.specs.TestSpecs.responseSpecification;
import static io.restassured.RestAssured.given;

public class ArtistsApi {
    @Step("Send GET /artists/{id}")
    public static Artist getValidArtist(String id) {
        return given(requestSpecification)
                .when()
                .get(Endpoints.ARTISTS, id)
                .then()
                .spec(responseSpecification)
                .extract()
                .as(Artist.class);
    }
}
