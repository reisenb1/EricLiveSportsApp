package com.ericcode.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Body {
    private String status;
    @JsonProperty("results")
    private List<Game> games;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setResults(List<Game> games) {
        this.games = games;
    }
}
