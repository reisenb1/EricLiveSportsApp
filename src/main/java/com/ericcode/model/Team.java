package com.ericcode.model;

public class Team {

    private AwayTeam away;
    private HomeTeam home;

    public AwayTeam getAway() {
        return away;
    }

    public void setAway(AwayTeam away) {
        this.away = away;
    }

    public HomeTeam getHome() {
        return home;
    }

    public void setHome(HomeTeam home) {
        this.home = home;
    }
}
