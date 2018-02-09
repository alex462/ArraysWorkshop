package com.company;

import java.util.Scanner;

public class Arrays {

    /**Declaring our member variables */
    private Scanner input = new Scanner(System.in);
    private boolean isValidAnswer;
    private Home home = new Home();

    /**This simply prints out an introduction about Arrays. We're doing an introductory method so that we don't have to print it every single time
     * the user returns to be shown array options. */
    public void showArrayIntroduction() {
        System.out.println("The major difference between an Array and a List/ArrayList is mutability. \n" +
                "Mutability refers to the ability to change. An array has a set of data that never changes, \n" +
                "either because it can't, or because it isn't expected to. Therefore it's immutable. More on Arrays:");
    }


    /**Here we're giving the user options on what they wish to learn about regarding arrays. */
    public void showArrayInformation() {
        isValidAnswer = false;
        System.out.println("Select One of the Following:\n");
        while(!isValidAnswer) {
            System.out.println(
                    "1. Array Examples \n" +
                            "2. Array Methods \n" +
                            "3. Return Home");
            switch (input.nextLine()) {
                case "1" :
                    showArrayExamples();
                    isValidAnswer = true;
                    break;
                case "2" :
                    discussArrayMethods();
                    isValidAnswer = true;
                    break;
                case "3" :
                    home.queryResponse();
                    isValidAnswer = true;
                    break;
                default :
                    home.invalidResponse();
                    isValidAnswer = false;
                    break;
            }
        }

    }


    /**Here we're offering all of the options the user has regarding arrays. */
    public void showArrayExamples() {
        System.out.println("Some examples of Arrays include : \n" +
                "1. Days of the Week - These aren't changing, the same 7 will always hold true and unchanging. \n" +
                "2. Months in a Year - These twelve months will always comprise the array of months. \n" +
                "3. Cast of the Brady Bunch - This show is over, so it can never lose/add members. Therefore its list is set in stone.\n\n");
        showArrayInformation();
    }


    /**This will give various examples of array methods, while creating an array of these examples and printing them out in the process. This will
     * give the students an example on how to use arrays, while giving them concrete information on the subject. */
    public void discussArrayMethods() {
        int position = 1;
        String array[] = new String[3];
        array[0] = "sort - Sorts array according to specifications";
        array[1] = "equals - Performs a boolean check as to its values are equal to another's.";
        array[2] = "length - Returns size of Array.";
        System.out.println("Arrays have various methods that can be used alongside Them. Arrays are, of course, less \n" +
                "flexible than ArrayLists, as they cannot shrink or grow, so their methods are limited. Some examples of Array \n" +
                "methods include:");

        for(int i = 0; i < array.length; i++) {
            System.out.println(position + ". " + array[i]);
            position++;
        }
        System.out.println("\n");

        showArrayInformation();
    }
}
