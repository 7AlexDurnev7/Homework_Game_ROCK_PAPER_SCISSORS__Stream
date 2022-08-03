package com.company;

import java.io.IOException;
import java.util.Scanner;

// Class "Gamer"
public class Gamer {

//    String inputName = new String(String.valueOf(System.in));
    private Scanner inputPlayer;

    //

    public Scanner getInputPlayer() {
        return inputPlayer;
    }

    // Constructor
    public Gamer() {
        inputPlayer = new Scanner(System.in);
    }

    //Method to player make choice: STONE, PAPER or SCISSORS
    public String makeARunningPlayer() throws IOException {
        System.out.println("Make choice: 1 - \"STONE\", 2 - \"SCISSORS\", 3 - \"PAPER\" ?");
        GamePlace.writeGameResult("Make choice: 1 - \"STONE\", 2 - \"SCISSORS\", 3 - \"PAPER\" ?");
        char input =  inputPlayer.next().charAt(0);
        if (input == '1' || input == '2' || input == '3') {
            switch(input) {
                case '1':
                    return "STONE";
                case '2':
                    return "SCISSORS";
                case '3':
                    return "PAPER";
            }
        }

        return makeARunningPlayer();
    }

    // Method to ask player want he play the game again
    public boolean playAgain() {
        System.out.println("Do you want play again? 1 - \"YES\" or 2 - \"NO\"");
        char userInput = inputPlayer.next().charAt(0);
        return userInput == '1';
    }



} // Class "Gamer"


