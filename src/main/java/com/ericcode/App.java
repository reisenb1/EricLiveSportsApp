package com.ericcode;

import com.ericcode.services.ConsoleService;
import com.ericcode.services.ScoreService;
import org.springframework.http.ResponseEntity;

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
                        ResponseEntity response = scoreService.getPastScores();
                        consoleService.printNBAGames(response);
                    }
                }

            }
        }


    }

}