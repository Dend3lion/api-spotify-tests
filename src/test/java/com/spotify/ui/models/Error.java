package com.spotify.ui.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Error {
    private ErrorDetails error;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ErrorDetails {
        private String status;
        private String message;
    }
}
