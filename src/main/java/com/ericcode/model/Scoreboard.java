package com.ericcode.model;



public class Scoreboard {
    private Score score;

    private String currentPeriod;

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public String getCurrentPeriod() {
        return currentPeriod;
    }

    public void setCurrentPeriod(String currentPeriod) {
        this.currentPeriod = currentPeriod;
    }
}
