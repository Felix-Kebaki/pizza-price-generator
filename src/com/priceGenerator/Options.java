package com.priceGenerator;

import java.util.Scanner;

public class Options {

    Pizza pizza = new Pizza();
    Scanner scanner = new Scanner(System.in);

    public Options() {
        System.out.println("\nWelcome to Pizza place.\n\nPick your order below.[1 or 2]");
        System.out.println("1.Pizza Vegetable ---Ksh800   2.Pizza Non-vegetable ---Ksh1000");
        System.out.print("Enter: ");
        int firstPick = scanner.nextInt();

        if (firstPick == 1 || firstPick == 2) {
            pizza.checkIfVeg(firstPick);
        } else {
            System.out.println("Invalid input!!!");
            System.exit(1);
        }

        getCheeseResponse();
        getToppingResponse();
        getTakeawayResponse();

        pizza.getBill();
    }

    public void getCheeseResponse() {
        System.out.println("\nPick your preference:[1 or 2]");
        System.out.println("1.Extra cheese ---Ksh200     2.No extra cheese");
        System.out.print("Enter: ");
        int secondPick = scanner.nextInt();

        if (secondPick == 1) {
            pizza.addExtraCheese();
        } else if (secondPick == 2) {

        } else {
            System.out.println("\nInvalid input!!!");
            getCheeseResponse();
        }
    }

    public void getToppingResponse() {
        System.out.println("\nPick your preference:[1 or 2]");
        System.out.println("1.Extra topping ---Ksh100     2.No extra topping");
        System.out.print("Enter: ");
        int thirdPick = scanner.nextInt();

        if (thirdPick == 1) {
            pizza.addExtraTopping();
        } else if (thirdPick == 2) {

        } else {
            System.out.println("\nInvalid input!!!");
            getToppingResponse();
        }
    }

    public void getTakeawayResponse() {
        System.out.println("\nPick your preference:[1 or 2]");
        System.out.println("1.Take away ---Ksh50     2.Eat here");
        System.out.print("Enter: ");
        int fourthPick = scanner.nextInt();

        if (fourthPick == 1) {
            pizza.takeAway();
        } else if (fourthPick == 2) {

        } else {
            System.out.println("\nInvalid input!!!");
            getTakeawayResponse();
        }
    }
}
