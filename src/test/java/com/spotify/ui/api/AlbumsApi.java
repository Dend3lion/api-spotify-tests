package com.spotify.ui.api;

import com.spotify.ui.models.requests.AlbumTracksRequest;
import com.spotify.ui.models.responses.Album;
import com.spotify.ui.models.responses.AlbumTracks;
import com.spotify.ui.models.responses.Error;
import io.qameta.allure.Step;

import static com.spotify.ui.specs.TestSpecs.requestSpecification;
import static com.spotify.ui.specs.TestSpecs.responseSpecification;
import static io.restassured.RestAssured.given;

public class AlbumsApi {
    @Step("Send GET /albums/{id}")
    public static Album getValidAlbum(String id) {
        return given(requestSpecification)
                .when()
                .get(Endpoints.ALBUMS, id)
                .then()
                .spec(responseSpecification)
                .extract()
                .as(Album.class);
    }

    @Step("Send GET /albums/{id}")
    public static Error getInvalidAlbum(String id) {
        return given(requestSpecification)
                .when()
                .get(Endpoints.ALBUMS, id)
                .then()
                .spec(responseSpecification)
                .extract()
                .as(Error.class);
    }

    @Step("Send GET /albums/{id}/tracks")
    public static AlbumTracks getValidAlbumTracks(AlbumTracksRequest albumTracksRequest) {
        return given(requestSpecification)
                .when()
                .get(Endpoints.ALBUM_TRACKS,
                        albumTracksRequest.getId(),
                        albumTracksRequest.getMarket(),
                        albumTracksRequest.getLimit(),
                        albumTracksRequest.getOffset())
                .then()
                .spec(responseSpecification)
                .extract()
                .as(AlbumTracks.class);
    }
}
