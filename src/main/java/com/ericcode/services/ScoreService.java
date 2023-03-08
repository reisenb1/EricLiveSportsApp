package com.ericcode.services;


import com.ericcode.model.Body;
import com.ericcode.model.Game;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ScoreService {

    private static final String API_BASE_URL = "https://sportspage-feeds.p.rapidapi.com/";
    private final RestTemplate restTemplate = new RestTemplate();

    private final String keyType = "X-RapidAPI-Key";
    private final String key = "d82ab036b8msh3bbcf24edf8f75fp184f1fjsn21704227f7ec";

    public ResponseEntity getNBAGames(String date) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        headers.set(keyType, key);

        HttpEntity request = new HttpEntity(headers);

        return restTemplate.exchange(API_BASE_URL + "games?league=NBA&date=" + date, HttpMethod.GET, request, String.class);
    }

    public List<Game> listNBAGames(String date) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        headers.set(keyType, key);

        HttpEntity request = new HttpEntity(headers);
        Body responseBody = restTemplate.exchange(API_BASE_URL + "games?league=NBA&date=" + date, HttpMethod.GET, request, Body.class).getBody();

        return responseBody.getResults();
    }
}
