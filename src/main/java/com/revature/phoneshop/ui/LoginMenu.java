package com.revature.phoneshop.ui;

import com.revature.phoneshop.models.User;
import com.revature.phoneshop.services.UserService;

import java.util.Scanner;

public class LoginMenu implements IMenu {
    private UserService userService;

    public LoginMenu(UserService userService) {
        this.userService = userService;
    }

    Scanner scan = new Scanner(System.in);
    User user = new User();

    @Override
    public void start() {
        char input = ' ';

        exit:
        {
            while (true) {
                System.out.println("\nWelcome to login menu");
                System.out.println("[1] log in");
                System.out.println("[2] Create new account");
                System.out.println("[x] Exit");

                input = scan.next().charAt(0);

                switch (input) {
                    case '1':
                        login();
                        break;
                    case '2':
                        createAccount();
                        break;
                    case 'x':
                        break exit;
                    default:
                        System.out.println("\nInvalid input!");
                        break;
                }
            }
        }
    }

    private void createAccount() {
        String username = "";
        String password1 = "";
        String password2 = "";
        String firstname = "";
        String lastname = "";
        String address = "";
        String email = "";


 //       System.out.println("\nCreating account...");

        while (true) {
            while (true) {
                System.out.print("\nEnter in username: ");
                username = scan.next();

                if (!userService.isDupUsername(username)) {
                    if (userService.isValidUsername(username)) {
                        user.setUsername(username);
                        break;
                    } else {
                        System.out.println("\nInvalid username :(");
                    }

                } else {
                    System.out.println("\nDuplicate username :(");
                }
            }

            while (true) {
                System.out.print("\nEnter in password: ");
                password1 = scan.next();

                System.out.print("\nEnter in password again: ");
                password2 = scan.next();
                scan.nextLine();

                if (password1.equals(password2)) {
                    if (userService.isValidPassword(password1)) {
                        user.setPassword(password1);
                        break;
                    } else {
                        System.out.println("\nInvalid password!");
                    }
                } else {
                    System.out.println("Password does not match!");
                }
            }
                System.out.println("\nPlease enter your first name" );
                firstname = scan.nextLine();
                user.setFirstname(firstname);

                System.out.println("PLease enter your last name");
                lastname = scan.nextLine();
                user.setLastname(lastname);

                System.out.println("Please enter your address");
                address = scan.nextLine();
                user.setAddress(address);

                System.out.println("Please enter your email");
                email = scan.nextLine();
                user.setEmail(email);

                System.out.println("Is the information correct 'y' or 'n'");
                System.out.println(user);

                System.out.print("\nEnter");

                System.out.println("\nPlease confirm credentials (y/n)");
//                System.out.print("Username: " + username);
//                System.out.print("\nPassword: " + password1);

                if(scan.next().charAt(0) == 'y')
                {
                    userService.getUserDAO().save(user);
                    break;
                }


                System.out.println("Account created succesfully!");
                break;
            }



        }


    private void login() {
        while (true) {
            System.out.print("\nUsername: ");
            user.setUsername(scan.next());

            System.out.print("\nPassword: ");
            user.setPassword((scan.next()));

            if (userService.isValidLogin(user)) {
                user = userService.getUserDAO().findByUsername(user.getUsername());
                new MainMenu(user).start();
                break;
            } else {
                System.out.println("\nInvalid login");
            }
        }
    }
}
