package com.spotify.ui.models.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
    String album_type;
    AlbumArtist[] albumArtists;
    String[] available_markets;
    ExternalUrls external_urls;
    String href;
    String id;
    Image[] images;
    String name;
    String release_date;
    String release_date_precision;
    int total_tracks;
    String type;
    String uri;
}
