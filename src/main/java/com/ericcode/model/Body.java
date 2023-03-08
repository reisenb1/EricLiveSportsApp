package com.ericcode.model;

import java.util.List;

public class Body {
    private String status;
    private List<Game> results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Game> getResults() {
        return results;
    }

    public void setResults(List<Game> results) {
        this.results = results;
    }
}
