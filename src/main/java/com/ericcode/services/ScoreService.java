package com.ericcode.services;


import org.springframework.web.client.RestTemplate;

public class ScoreService {

    private static final String API_BASE_URL = "https://api-nba-v1.p.rapidapi.com/";

    private final RestTemplate restTemplate = new RestTemplate();
}
