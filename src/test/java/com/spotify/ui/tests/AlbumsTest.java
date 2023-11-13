package com.spotify.ui.tests;

import com.spotify.ui.api.AlbumsApi;
import com.spotify.ui.models.Album;
import org.junit.jupiter.api.Test;

import static com.spotify.ui.api.AuthorizationApi.getAccessToken;

public class AlbumsTest extends TestBase {

    @Test
    void getAlbumById() {
        String accessToken = getAccessToken();
        Album album = AlbumsApi.getAlbum("4aawyAB9vmqN3uQ7FjRGTy", accessToken);
    }

    @Test
    void getAlbumWithMarket() {
        String accessToken = getAccessToken();
        Album album = AlbumsApi.getAlbum("4aawyAB9vmqN3uQ7FjRGTy", "US", accessToken);
    }
}
