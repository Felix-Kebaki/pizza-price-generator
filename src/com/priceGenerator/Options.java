package com.priceGenerator;

import java.util.Scanner;

public class Options {

    Pizza pizza = new Pizza();
    Scanner scanner = new Scanner(System.in);

    public Options() {
        System.out.println("\nWelcome to Pizza place.\n\nPick your order below.[1 or 2]");

        getPizzaResponse();
        getCheeseResponse();
        getToppingResponse();
        getTakeawayResponse();

        pizza.getBill();
    }

    public void getPizzaResponse() {
        System.out.println("1.Pizza Vegetable ---Ksh800   2.Pizza Non-vegetable ---Ksh1000");
        while (true) {
            System.out.print("Enter: ");
            if (scanner.hasNextInt()) {

                int firstPick = scanner.nextInt();

                if (firstPick == 1 || firstPick == 2) {
                    pizza.checkIfVeg(firstPick);
                    break;
                } else {
                    System.out.println("\nInvalid input! Please enter 1 or 2.");
                }
            } else {
                System.out.println("\nOnly numbers allowed! Try again.");
                scanner.next();
            }
        }
    }

    public void getCheeseResponse() {
        System.out.println("\nPick your preference:[1 or 2]");
        System.out.println("1.Extra cheese ---Ksh200     2.No extra cheese");
        while (true) {
            System.out.print("Enter: ");
            if (scanner.hasNextInt()) {
                int secondPick = scanner.nextInt();

                if (secondPick == 1) {
                    pizza.addExtraCheese();
                    break;
                } else if (secondPick == 2) {
                    break;
                } else {
                    System.out.println("\nInvalid input! Please enter 1 or 2.");
                }
            } else {
                System.out.println("\nOnly numbers allowed! Try again.");
                scanner.next();
            }
        }
    }

    public void getToppingResponse() {
        System.out.println("\nPick your preference:[1 or 2]");
        System.out.println("1.Extra topping ---Ksh100     2.No extra topping");
        while (true) {
            System.out.print("Enter: ");
            if (scanner.hasNextInt()) {
                int thirdPick = scanner.nextInt();

                if (thirdPick == 1) {
                    pizza.addExtraTopping();
                    break;
                } else if (thirdPick == 2) {
                    break;
                } else {
                    System.out.println("\nInvalid input! Please enter 1 or 2.");
                }
            } else {
                System.out.println("\nOnly numbers allowed! Try again.");
                scanner.next();
            }
        }
    }

    public void getTakeawayResponse() {
        System.out.println("\nPick your preference:[1 or 2]");
        System.out.println("1.Take away ---Ksh50     2.Eat here");
        while (true) {
            System.out.print("Enter: ");
            if (scanner.hasNextInt()) {
                int fourthPick = scanner.nextInt();

                if (fourthPick == 1) {
                    pizza.takeAway();
                    break;
                } else if (fourthPick == 2) {
                    break;
                } else {
                    System.out.println("\nInvalid input! Please enter 1 or 2.");
                }
            } else {
                System.out.println("\nOnly numbers allowed! Try again.");
                scanner.next();
            }
        }
    }
}
