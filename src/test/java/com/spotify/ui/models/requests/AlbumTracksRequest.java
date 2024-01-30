package com.spotify.ui.models.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class AlbumTracksRequest {
    @JsonProperty(required = true)
    private String id;
    private String market;
    private int limit;
    private int offset;
}
