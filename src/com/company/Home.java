package com.company;

import java.util.Scanner;

public class Home {
    /**Declaring our member variables */
    private Scanner input = new Scanner(System.in);;
    private boolean isValidAnswer;



    /**This introduces the user to the application before giving them the ability to choose what they wish to learn more about. */
    public void introduction() {
        System.out.println("Java has many examples of merging several forms of information together. +\n" +
                "In this Module we'll be going over two such examples : Arrays and ArrayLists.");
        queryResponse();
    }

    /**This method awaits the user's response and calls the correct method accordingly. If the user enters a valid response, this cycle
     * breaks and they learn about the topic they've entered. If their response isn't valid, they're informed of the fact and the cycle continues. */
    protected void queryResponse() {
        isValidAnswer = false;
        while (!isValidAnswer) {
            System.out.println("Which would you like to learn more about? \n" +
                    "1. Arrays \n" +
                    "2. Lists/ArrayLists \n" +
                    "3. Exit Application");
            switch (input.nextLine()) {
                case "1":
                    Arrays arrays = new Arrays();
                    arrays.showArrayIntroduction();
                    arrays.showArrayInformation();
                    isValidAnswer = true;
                    break;
                case "2":
                    ArrayLists arrayLists = new ArrayLists();
                    arrayLists.showArrayListIntroduction();
                    arrayLists.showArrayListInformation();
                    isValidAnswer = true;
                    break;
                case "3":
                    exitApplication();
                    isValidAnswer = true;
                    break;
                default:
                    invalidResponse();
                    isValidAnswer = false;
                    break;
            }
        }
    }

    /**This method simply exits the application. */
    public void exitApplication() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    /**This method tells the user that their response is invalid and to try again. */
    public void invalidResponse() {
        System.out.println("Invalid Response. Please try again!");
    }
}
