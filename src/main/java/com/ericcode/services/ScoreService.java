package com.ericcode.services;


import com.ericcode.model.Body;
import com.ericcode.model.Game;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ScoreService {

    private static final String API_BASE_URL = "https://sportspage-feeds.p.rapidapi.com/";
    private final RestTemplate restTemplate = new RestTemplate();

    private final static String keyType = "X-RapidAPI-Key";
    private final static String key = "d82ab036b8msh3bbcf24edf8f75fp184f1fjsn21704227f7ec";

    public static String getKeyType() {
        return keyType;
    }

    public static String getKey() {
        return key;
    }

    public HttpEntity authorization(String keyType, String key) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        headers.set(keyType, key);

        HttpEntity request = new HttpEntity(headers);

        return request;
    }

    public ResponseEntity getNBAGames(String date) {

        HttpEntity request = authorization(ScoreService.getKeyType(), ScoreService.getKey());

        return restTemplate.exchange(API_BASE_URL + "games?league=NBA&date=" + date, HttpMethod.GET, request, String.class);
    }

    public List<Game> listGamesByDate(String league, String date) {
        HttpEntity request = authorization(ScoreService.getKeyType(), ScoreService.getKey());

        Body responseBody = restTemplate.exchange(API_BASE_URL + "games?league=" + league + "&date=" + date, HttpMethod.GET, request, Body.class).getBody();

        return responseBody.getGames();
    }

    public List<Game> listLiveGames(String league) {
        HttpEntity request = authorization(ScoreService.getKeyType(), ScoreService.getKey());

        Body responseBody = restTemplate.exchange(API_BASE_URL + "games?status=in progress&league=" + league, HttpMethod.GET, request, Body.class).getBody();

        return responseBody.getGames();
    }
}
