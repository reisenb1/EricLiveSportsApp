package com.ericcode;

import com.ericcode.model.Game;
import com.ericcode.services.ConsoleService;
import com.ericcode.services.ScoreService;

import java.util.List;

public class App {
    private final ConsoleService consoleService = new ConsoleService();

    private final ScoreService scoreService = new ScoreService();

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        consoleService.printGreeting();

        int menuSelection = -1;

        while (menuSelection != 0) {
            consoleService.printMainMenu();
            menuSelection = consoleService.promptForMenuSelection();
            if (menuSelection == 1) {
                int nbaMenuSelection = -1;
                while (nbaMenuSelection != 0) {
                    consoleService.printNBAMenu();
                    nbaMenuSelection = consoleService.promptForMenuSelection();
                    if (nbaMenuSelection == 1) {
                        consoleService.printPastScoresMenu();
                        String pastDate = consoleService.promptForDate();
                        if (pastDate.equals("0")) {
                        } else {
                            List<Game> games = scoreService.listGamesByDate("NBA", pastDate);
                            consoleService.printScores(games);
                        }
                    } else if (nbaMenuSelection == 2) {
                        List<Game> games = scoreService.listLiveGames("NBA");
                        consoleService.printScores(games);
                    }
                }
            } else if (menuSelection == 2) {
                int nflMenuSelection = -1;
                while (nflMenuSelection != 0) {
                    consoleService.printNFLMenu();
                    nflMenuSelection = consoleService.promptForMenuSelection();
                    if (nflMenuSelection == 1) {
                        consoleService.printPastScoresMenu();
                        String pastDate = consoleService.promptForDate();
                        if (pastDate.equals("0")) {
                        } else {
                            List<Game> games = scoreService.listGamesByDate("NFL", pastDate);
                            consoleService.printScores(games);
                        }
                    } else if (nflMenuSelection == 2) {
                        List<Game> games = scoreService.listLiveGames("NFL");
                        consoleService.printScores(games);
                    }
                }
            } else if (menuSelection == 3) {
                int mlbMenuSelection = -1;
                while (mlbMenuSelection != 0) {
                    consoleService.printMLBMenu();
                    mlbMenuSelection = consoleService.promptForMenuSelection();
                    if (mlbMenuSelection == 1) {
                        consoleService.printPastScoresMenu();
                        String pastDate = consoleService.promptForDate();
                        if (pastDate.equals("0")) {
                        } else {
                            List<Game> games = scoreService.listGamesByDate("MLB", pastDate);
                            consoleService.printScores(games);
                        }
                    } else if (mlbMenuSelection == 2) {
                        List<Game> games = scoreService.listLiveGames("MLB");
                        consoleService.printScores(games);
                    }
                }
            }

        }


    }

}