package com.spotify.ui.models.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist {
    ExternalUrls external_urls;
    Followers followers;
    String[] genres;
    String href;
    String id;
    Image[] images;
    String name;
    int popularity;
    String type;
    String uri;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Followers {
        private String href;
        private int total;
    }
}
