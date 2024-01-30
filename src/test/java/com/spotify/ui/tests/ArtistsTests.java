package com.spotify.ui.tests;

import com.spotify.ui.api.ArtistsApi;
import com.spotify.ui.helpers.DataGenerator;
import com.spotify.ui.models.responses.Artist;
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
@Feature("Artists")
@Story("Get Artist")
@Tag("api")
public class ArtistsTests extends TestBase {
    private final DataGenerator generator = new DataGenerator();

    @Test
    @Tag("smoke")
    @DisplayName("Get artist by id")
    void getAlbumByIdTest() throws Exception {
        Artist expectedArtist = generator.getArtistDataFromFile("steveLacy");
        Artist artist = ArtistsApi.getValidArtist(expectedArtist.getId());

        step("Verify response artist", () -> {
            step("Valid name", () -> assertThat(artist.getName()).isEqualTo(expectedArtist.getName()));
            step("Valid followers", () -> assertThat(artist.getFollowers()).isEqualTo(expectedArtist.getFollowers()));
            step("Valid popularity", () -> assertThat(artist.getPopularity()).isEqualTo(expectedArtist.getPopularity()));
        });
    }
}
