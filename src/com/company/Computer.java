package com.company;

import java.util.Random;

// Class "Computer"
public class Computer {

    private static final String file = "game.txt";

    public static String randomComputerChoice() {
        String [] arr = {"STONE", "SCISSORS", "PAPER"};
        Random r = new Random();
        String choice = arr[r.nextInt(3)];
        System.out.println(choice);
        return choice;
    }

} // Class "Computer"
