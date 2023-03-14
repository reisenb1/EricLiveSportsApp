package com.ericcode.services;

import com.ericcode.model.Game;
import org.springframework.http.ResponseEntity;

import java.util.List;
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
        System.out.println("2: NFL");
        System.out.println("3: MLB");
        System.out.println();
    }
    public void printNBAMenu() {
        System.out.println();
        System.out.println("----NBA Menu----");
        System.out.println("1: Past Scores");
        System.out.println("2: Live Scores");
        System.out.println("0: Exit to Main Menu");
        System.out.println();
    }

    public void printNFLMenu() {
        System.out.println();
        System.out.println("----NFL Menu----");
        System.out.println("1: Past Scores");
        System.out.println("2: Live Scores");
        System.out.println("0: Exit to Main Menu");
        System.out.println();
    }

    public void printMLBMenu() {
        System.out.println();
        System.out.println("----MLB Menu----");
        System.out.println("1: Past Scores");
        System.out.println("2: Live Scores");
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

    public void printScores(List<Game> games) {
        for (Game game : games) {
            String awayTeamName = game.getTeams().getAway().getTeam();
            String awayTeamAbbreviation = game.getTeams().getAway().getAbbreviation();
            String homeTeamName = game.getTeams().getHome().getTeam();
            String homeTeamAbbreviation = game.getTeams().getHome().getAbbreviation();
            String venue = game.getVenue().getName() + "  (" + game.getVenue().getCity() + ", " + game.getVenue().getState() + ")";
            String homePoints = game.getScoreboard().getScore().getHomeScore();
            String awayPoints = game.getScoreboard().getScore().getAwayScore();
            System.out.println("");
            System.out.printf("%-23s (%s) %4s%n", homeTeamName, homeTeamAbbreviation, homePoints);
            System.out.printf("%-23s (%s) %4s%n", awayTeamName, awayTeamAbbreviation, awayPoints);
            System.out.printf("      %s%n", venue);
        }
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
