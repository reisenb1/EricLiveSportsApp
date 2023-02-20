package com.ericcode.services;

import java.util.Scanner;

public class ConsoleService {

    private final Scanner scanner = new Scanner(System.in);

    public void printGreeting() {
        System.out.println("********************************************");
        System.out.println("* Welcome to Eric's Live Sports Score App! *");
        System.out.println("********************************************");
    }


    public void printMainMenu() {
        System.out.println();
        System.out.println("----Live Scores Main Menu----");
        System.out.println("1: List Current Live Games");
        System.out.println();
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

}
