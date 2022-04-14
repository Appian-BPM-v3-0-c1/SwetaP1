package com.revature.phoneshop;

import com.revature.phoneshop.daos.UserDAO;
import com.revature.phoneshop.services.UserService;
import com.revature.phoneshop.ui.LoginMenu;

public class Main {
    public static void main(String[] args) {

  //      new MainMenu().start();
        new LoginMenu(new UserService(new UserDAO())).start();

    }
}
