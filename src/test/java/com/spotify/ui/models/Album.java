package com.spotify.ui.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Album {
    String href;
    Item[] items;
    int limit;
    String next;
    int offset;
    String previous;
    int total;
}
