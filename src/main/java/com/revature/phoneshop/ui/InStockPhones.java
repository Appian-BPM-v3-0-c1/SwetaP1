package com.revature.phoneshop.ui;
import java.util.Scanner;

public class InStockPhones {


    public void listPhones() {
        char input = ' ';
        char input2 = ' ';
        boolean exit = false;
        Scanner scan = new Scanner(System.in);

        while (!exit) {
            System.out.println("\n****** Phones in Stock *****");
            System.out.println("Please choose the phone you want to purchase with express checkout:\n");
            System.out.println("[1] Samsung Galaxy S22 Ultra       $1299");
            System.out.println("[2] Samsung Galaxy S22 Plus        $ 999");
            System.out.println("[3] Samsung Galaxy S22             $ 799");
            System.out.println("[4] Apple Iphone 13 Max Pro        $1299");
            System.out.println("[5] Apple Iphone 13 Max            $ 999");
            System.out.println("[6] Apple Iphone 13                $ 799");
            System.out.println("[7] Apple Iphone 13 Mini           $ 699");
            System.out.println("[8] Nokia 3210                     $  99");
            System.out.println("\n[x] Exit");

            System.out.println(("\nEnter Choice:"));
            input = scan.next().charAt(0);
            char buyAgain = ' ';

            switch (input) {
                case '1':
                    System.out.println("Congratulations on your purchase of the Galaxy S22 Ultra!");
                    System.out.println("Your receipt and tracking number have been sent to your email address.");
                    break;

                case '2':
                    System.out.println("Congratulations on your purchase of the Galaxy S22 Plus!");
                    System.out.println("Your receipt and tracking number have been sent to your email address.");
                    break;

                case '3':
                    System.out.println("Congratulations on your purchase of the Galaxy S22!");
                    System.out.println("Your receipt and tracking number have been sent to your email address.");
                    break;

                case '4':
                    System.out.println("Congratulations on your purchase of the Apple Iphone 13 Pro Max!");
                    System.out.println("Your receipt and tracking number have been sent to your email address.");
                    break;

                case '5':
                    System.out.println("Congratulations on your purchase of the Apple Iphone 13 Pro!");
                    System.out.println("Your receipt and tracking number have been sent to your email address.");
                    break;

                case '6':
                    System.out.println("Congratulations on your purchase of the Apple Iphone 13!");
                    System.out.println("Your receipt and tracking number have been sent to your email address.");
                    break;

                case '7':
                    System.out.println("Congratulations on your purchase of the Apple Iphone 13 Mini!");
                    System.out.println("Your receipt and tracking number have been sent to your email address.");
                    break;

                case '8':
                    System.out.println("Congratulations on your purchase of the Nokia 3210!");
                    System.out.println("Your receipt and tracking number have been sent to your email address.");
                    break;
                case 'x':
                    exit = true;
                    break;
                default:
                    System.out.println("\nInvalid Choice! \nPlease select again!");
            }
            System.out.println("Would you like to make another purchase? (y/n)");
            buyAgain=scan.next().charAt(0);
            if (buyAgain=='y'){
                continue;
            }
            else {
                exit=true;
            }

        }
    }

}

