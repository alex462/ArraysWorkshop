package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists {

    /**Declaring our member variables */
    private Scanner input = new Scanner(System.in);
    private boolean isValidAnswer;
    Home home = new Home();

    /**This simply prints out an introduction about ArrayLists. We're doing an introductory method so that we don't have to print it every single time
     * the user returns to be shown arraylist options. */
    public void showArrayListIntroduction() {
        System.out.println("The major difference between an Array and a List/Arraylist is mutability. \n" +
                "Mutability refers to the ability to change. Therefore Lists and ArrayLists are mutable.");
    }


    /**Here we're giving the user options on what they wish to learn about regarding arraylists. */
    public void showArrayListInformation() {
        isValidAnswer = false;
        System.out.println("Select One of the Following:\n");
        while(!isValidAnswer) {
            System.out.println(
                    "1. ArrayList Examples \n" +
                            "2. ArrayList Methods\n" +
                            "3. Return Home");
            switch (input.nextLine()) {
                case "1" :
                    showArrayListExamples();
                    isValidAnswer = true;
                    break;
                case "2" :
                    discussArrayListMethods();
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


    /**Here we're creating an arraylist so that we can iterate through it to both provide information on arraylists, and an example on how to create
     * one simultaneously. */
    public void showArrayListExamples() {
        int position = 1;
        List<String> arrayList = new ArrayList();
        arrayList.add("Members of a basketball team");
        arrayList.add("People in line.");
        arrayList.add("Video games in a library");

        System.out.println("ArrayLists have various methods, such as:");
        for(int i = 0 ; i < arrayList.size(); i++) {
            System.out.println(position + ". " + arrayList.get(i));
            position++;
        }

        System.out.println("\n");
//        showArrayListInformation();

        arrayList.remove(2);

        position = 1;
        System.out.println("Removed third item");
        for(int i = 0 ; i < arrayList.size(); i++) {
            System.out.println(position + ". " + arrayList.get(i));
            position++;
        }
        System.out.println("\n");
//        showArrayListInformation();

        arrayList.remove(1);

        position = 1;
        System.out.println("Removed second item");
        for(int i = 0 ; i < arrayList.size(); i++) {
            System.out.println(position + ". " + arrayList.get(i));
            position++;
        }
        System.out.println("\n");
//        showArrayListInformation();
//commenting out above instruction dead-ends method, program closes out
        position = 1;
        System.out.println("Adding another element");
        arrayList.add(1, "replaced element 2");
        for(int i = 0 ; i < arrayList.size(); i++) {
            System.out.println(position + ". " + arrayList.get(i));
            position++;
        }
        System.out.println("\n");
    }

    //arrayList.remove(indexNumber) OR arrayList.remove("string")
    //if you want to fix the numbers succeeding each position and set back to 1., must re-initialize position variable

    /**This simply prints information regarding ArrayList methods. */
    public void discussArrayListMethods() {
        System.out.println("Some examples of ArrayList methods include: \n" +
                "1. Add - Adds to the end of the ArrayList. \n" +
                "2. Remove - Removes item from the ArrayList \n" +
                "3. Pop - Removes and returns top element \n" +
                "4. Push - Adds element to the first position in the list");
        showArrayListInformation();
    }


}
