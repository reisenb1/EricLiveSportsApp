package com.ericcode.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Score {
    @JsonProperty("away")
    private String awayScore;
    @JsonProperty("home")
    private String homeScore;

    public String getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(String awayScore) {
        this.awayScore = awayScore;
    }

    public String getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(String homeScore) {
        this.homeScore = homeScore;
    }
}
