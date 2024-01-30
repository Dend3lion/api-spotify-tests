package com.spotify.ui.helpers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.google.gson.stream.JsonReader;
import com.spotify.ui.models.requests.AlbumTracksRequest;
import com.spotify.ui.models.responses.Artist;

public class DataGenerator {
    private static final String[] albumIds = new String[]{"0wXpRGFLQVpCi1qpunqBRH", "7A6MutudrSxcDa47a6HHOM", "2zz6j2mGH5JHk0ihNvy6KM"};
    static final Faker faker = new Faker();

    public Artist getArtistDataFromFile(String artistName) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.readValue(
                    JsonReader.class.getClassLoader().getResourceAsStream("data/" + artistName + ".json"),
                    Artist.class
            );
        } catch (Exception e) {
            throw new Exception("Unable to get the artistName");
        }
    }

    public AlbumTracksRequest getRandomAlbumTracksParams() {
        return AlbumTracksRequest.builder()
                .id(faker.options().nextElement(albumIds))
                .market(faker.address().countryCode())
                .limit(faker.number().numberBetween(5, 15))
                .offset(faker.number().numberBetween(0, 5))
                .build();
    }
}
