package com.ericcode.services;

import java.util.Scanner;

public class ConsoleService {

    private final Scanner scanner = new Scanner(System.in);

    public void printGreeting() {
        System.out.println("********************************************");
        System.out.println("* Welcome to Eric's Live Sports Score App! *");
        System.out.println("********************************************");
    }
}
