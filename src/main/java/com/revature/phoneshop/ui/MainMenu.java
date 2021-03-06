package com.revature.phoneshop.ui;

import com.revature.phoneshop.models.User;

import java.util.Scanner;

public class MainMenu implements IMenu{
    private final User user;

    public MainMenu(User user) {
        this.user = user;
    }

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
            System.out.println("\n[1]  Purchase from Phone in Stock");
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

        //   Enter the phone to order
        while (!exit) {
            char input2 =' ';
            boolean confirm = false;

            System.out.print("\nEnter make and model of phone you want to order: ");
            phone=scan.next();

            System.out.println("\nYou would like to order the "+phone+"\nIs this correct? (y/n)");
            System.out.print("\nEnter Choice: ");
            input2 = scan.next().charAt(0);

            //Loop to confirm
            while (!confirm) {
              switch (input2) {
                    case 'y':
                        System.out.println("\nGreat! You will be notified when your phone is on the way!");
                        exit = true;
                        confirm = true;
                        break;
                    case 'n':
                        exit = false;
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

