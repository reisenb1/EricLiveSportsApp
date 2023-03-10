package com.ericcode.model;

public class Game {
    private String summary;
    private Detail details;
    private String status;
    private Team teams;
    private Venue venue;
    private Scoreboard scoreboard;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Detail getDetails() {
        return details;
    }

    public void setDetails(Detail details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Team getTeams() {
        return teams;
    }

    public void setTeams(Team teams) {
        this.teams = teams;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Scoreboard getScoreboard() {
        return scoreboard;
    }

    public void setScoreboard(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
    }
}
