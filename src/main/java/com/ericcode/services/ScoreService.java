package com.ericcode.services;


import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class ScoreService {

    private static final String API_BASE_URL = "https://api-nba-v1.p.rapidapi.com/";
    private final RestTemplate restTemplate = new RestTemplate();

    private final String keyType = "X-RapidAPI-Key";
    private final String key = "d82ab036b8msh3bbcf24edf8f75fp184f1fjsn21704227f7ec";

    public ResponseEntity getPastScores() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        headers.set(keyType, key);

        HttpEntity request = new HttpEntity(headers);

        return restTemplate.exchange(API_BASE_URL + "games?date=2022-02-12", HttpMethod.GET, request, String.class);
    }
}
