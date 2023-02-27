package com.ericcode.services;

import org.springframework.http.ResponseEntity;

import java.util.Scanner;

public class ConsoleService {

    private final Scanner scanner = new Scanner(System.in);

    public void printGreeting() {
        System.out.println("*********************************");
        System.out.println("* Welcome to Eric's Sports App! *");
        System.out.println("*********************************");
    }


    public void printMainMenu() {
        System.out.println();
        System.out.println("----Main Menu----");
        System.out.println("1: NBA");
        System.out.println();
    }
    public void printNBAMenu() {
        System.out.println();
        System.out.println("----NBA Menu----");
        System.out.println("1: Past Scores");
        System.out.println("0: Exit to Main Menu");
        System.out.println();
    }

    public void printPastScoresMenu() {
        System.out.println();
        System.out.println("----Past Scores Menu----");
        System.out.println();
        System.out.println("Type date of desired past scores in format YYYY-MM-DD or 0 to exit to previous menu.");
        System.out.println();
    }

    public void printNBAGames (ResponseEntity response) {
        System.out.println(response.getBody());
    }

    public int promptForMenuSelection() {
        int menuSelection;
        System.out.println("Please choose an option: ");
        try {
            menuSelection = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            menuSelection = -1;
        }
        return menuSelection;
    }

    public String promptForDate() {
        String date;
        System.out.println("Please enter the desired date:");
        date = scanner.nextLine();
        return date;
    }

}
