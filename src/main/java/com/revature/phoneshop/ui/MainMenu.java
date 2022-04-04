package com.revature.phoneshop.ui;

import java.util.Scanner;
import java.util.SortedMap;

public class MainMenu implements InterfaceMenu{

    @Override
    public void start() {
        // user choice
        char input = ' ';

        // exit flag
        boolean exit = false;
        Scanner scan = new Scanner(System.in);

        while (!exit)
        {
            System.out.println("\nWelcome to Sweta's Cell Phone Store!");
            System.out.println("\n[1]  Purchase from Phones in Stock");
            System.out.println("[2]  Order a Phone Not in stock");
            System.out.println("[x]  Exit");

            System.out.println("\nEnter you choice:");
            input = scan.next().charAt(0);

            switch (input)
            {
                case '1':
                    InStockPhones buyPhone = new InStockPhones();
                    buyPhone.listPhones();
                    break;

                case '2':
                    System.out.println("Let's help you find a phone!");
                    break;

                case '3':
                    System.out.println("Let's a order a phone for you!");
                    createOrder();
                    break;

                case 'x':
                    System.out.println("Thank you for visiting Sweta's Cell Phone Store!");
                    System.out.println("Have a great day!");
                    System.exit(0);

                default:
                    break;
            }


        }


    }

    private void createOrder() {
        char input = ' ';
        boolean exit = false;

        String phone = " ";


        Scanner scan = new Scanner(System.in);


        /* loop to ask user to enter in restaurant */
        while (!exit) {
            boolean confirm = false;

            // Get phone name
            System.out.print("\nEnter make and model of phone you want to order: ");
            phone=scan.nextLine();




            /* loop to confirm */
            while (!confirm) {
                System.out.println("\nYou would like to order the "+phone+"\nIs this correct? (y/n)");


                System.out.print("\nEnter Choice: ");
                input = scan.next().charAt(0);

                switch (input) {
                    case 'y':
                        System.out.println("\nGreat! You will be notified when your phone is on the way!");
                        exit = true;
                        confirm = true;
                        break;
                    case 'n':
                        confirm = true;
                        break;
                    default:
                        System.out.println("\nInvalid input!");
                        break;
                }
            }
        }
    }

}

