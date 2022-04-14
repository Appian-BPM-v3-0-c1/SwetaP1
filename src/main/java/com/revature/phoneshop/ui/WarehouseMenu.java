package com.revature.phoneshop.ui;
import com.revature.phoneshop.models.Warehouse;
import com.revature.phoneshop.services.WarhouseServices;

import java.util.List;
import java.util.Scanner;

public class WarehouseMenu implements IMenu {

    private final WarhouseServices warhouseServices;

    public WarehouseMenu(WarhouseServices warhouseServices) {
        this.warhouseServices = warhouseServices;
    }

    @Override
    public void start() {
        char input = ' ';
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        while (!exit) {
            System.out.println("\nWelcome to Warehouse !");
            System.out.println("[1] Location of all Warehouse");
            System.out.println("[2] Search Warehouse");
            System.out.println("[x] Exit");

            System.out.print("\nEnter: ");
            input = scan.next().charAt(0);

            switch (input) {
                case '1':
                    viewAllWarehouse();
                    break;
                case '2':
                    break;
                case 'x':
                    exit = true;
                    break;
                default:
                    System.out.println("\nInvalid input!");
                    break;
            }
        }
    }

    private void viewAllWarehouse() {
        int input = 0;
        Scanner scan = new Scanner(System.in);
        List<Warehouse> wareList = warhouseServices.getWarehouseDAO().findAll();

        System.out.println();
        for (int i = 0; i < wareList.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + wareList.get(i).getName());
        }
    }
}





