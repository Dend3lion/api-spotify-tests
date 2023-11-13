package com.spotify.ui.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist {
    ExternalUrls external_urls;
    String href;
    String id;
    String name;
    String type;
    String uri;
}

