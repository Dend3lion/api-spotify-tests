package com.spotify.ui.tests;

import com.spotify.ui.api.AlbumsApi;
import com.spotify.ui.models.Album;
import com.spotify.ui.models.Error;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

@Owner("Denis Bashkatov")
@Epic("Spotify API")
@Feature("Albums")
@Story("Get Album")
@Tag("api")
public class AlbumsTests extends TestBase {

    @Test
    @Tag("smoke")
    @DisplayName("Get album by id")
    void getAlbumById() {
        Album album = AlbumsApi.getValidAlbum("4yP0hdKOZPNshxUOjY0cZj");

        step("Verify response album", () -> {
            step("Name: After Hours", () -> {
                assertThat(album.getName()).isEqualTo("After Hours");
            });

            step("Release date: 2020-03-20", () -> {
                assertThat(album.getRelease_date()).isEqualTo("2020-03-20");
            });

            step("Total tracks: 14", () -> {
                assertThat(album.getTotal_tracks()).isEqualTo(14);
            });

            step("Artist name: The Weeknd", () -> {
                assertThat(album.getArtists()[0].getName()).isEqualTo("The Weeknd");
            });

            step("Available markets are present", () -> {
                assertThat(album.getAvailable_markets()).isNotNull();
            });
        });
    }

    @Test
    @DisplayName("Get album by invalid id")
    void getAlbumByInvalidId() {
        Error error = AlbumsApi.getInvalidAlbum("12345");

        step("Verify response error", () -> {
            step("Status code: 400", () -> {
                assertThat(error.getError().getStatus()).isEqualTo("400");
            });

            step("Message: invalid id", () -> {
                assertThat(error.getError().getMessage()).isEqualTo("invalid id");
            });
        });
    }

    @Test
    @DisplayName("Get album by empty id")
    void getAlbumByEmptyId() {
        Error error = AlbumsApi.getInvalidAlbum("");

        step("Verify response error", () -> {
            step("Status code: 400", () -> {
                assertThat(error.getError().getStatus()).isEqualTo("400");
            });

            step("Message: invalid id", () -> {
                assertThat(error.getError().getMessage()).isEqualTo("invalid id");
            });
        });
    }

    @Test
    @DisplayName("Get album by id with market")
    void getAlbumWithMarket() {
        Album album = AlbumsApi.getValidAlbum("4yP0hdKOZPNshxUOjY0cZj", "US");

        step("Verify response album", () -> {
            step("Name: After Hours", () -> {
                assertThat(album.getName()).isEqualTo("After Hours");
            });

            step("Release date: 2020-03-20", () -> {
                assertThat(album.getRelease_date()).isEqualTo("2020-03-20");
            });

            step("Total tracks: 14", () -> {
                assertThat(album.getTotal_tracks()).isEqualTo(14);
            });

            step("Artist name: The Weeknd", () -> {
                assertThat(album.getArtists()[0].getName()).isEqualTo("The Weeknd");
            });

            step("Available markets are not present", () -> {
                assertThat(album.getAvailable_markets()).isNull();
            });
        });
    }

    @Test
    @DisplayName("Get album by id with invalid market")
    void getAlbumWithInvalidMarket() {
        Error error = AlbumsApi.getInvalidAlbum("4yP0hdKOZPNshxUOjY0cZj", "XX");

        step("Verify response error", () -> {
            step("Status code: 400", () -> {
                assertThat(error.getError().getStatus()).isEqualTo("400");
            });

            step("Message: Invalid market code", () -> {
                assertThat(error.getError().getMessage()).isEqualTo("Invalid market code");
            });
        });
    }

    @Test
    @DisplayName("Get album by id with empty market")
    void getAlbumWithEmptyMarket() {
        Error error = AlbumsApi.getInvalidAlbum("4yP0hdKOZPNshxUOjY0cZj", "");

        step("Verify response error", () -> {
            step("Status code: 400", () -> {
                assertThat(error.getError().getStatus()).isEqualTo("400");
            });

            step("Message: Invalid market code", () -> {
                assertThat(error.getError().getMessage()).isEqualTo("Invalid market code");
            });
        });
    }
}
