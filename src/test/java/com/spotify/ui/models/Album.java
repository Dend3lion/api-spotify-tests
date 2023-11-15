package com.spotify.ui.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Album {
    private String album_type;
    private Artist[] artists;
    private String[] available_markets;
    private ExternalUrls external_urls;
    private String href;
    private String id;
    private Image[] images;
    private String name;
    private String release_date;
    private String release_date_precision;
    private int total_tracks;
    private String type;
    private String uri;
}
