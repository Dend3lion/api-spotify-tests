package com.spotify.ui.models.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Track {
    private Artist[] artists;
    private String[] available_markets;
    private int disc_number;
    private int duration_ms;
    private boolean explicit;
    private ExternalUrls[] externalUrls;
    private String href;
    private String id;
    private boolean is_playable;
    private LinkedFrom linkedFrom;
    private String name;
    private String preview_url;
    private int track_number;
    private String type;
    private String uri;
    private boolean is_local;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LinkedFrom {
        private ExternalUrls externalUrls;
        private String href;
        private String id;
        private String type;
        private String uri;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Restrictions {
        private String reason;
    }
}
