package com.ericcode;

import com.ericcode.services.ConsoleService;

public class App {
    private final ConsoleService consoleService = new ConsoleService();

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

            }
        }


    }

}