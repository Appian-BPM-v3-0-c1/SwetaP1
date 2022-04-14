package com.revature.phoneshop.services;

import com.revature.phoneshop.daos.UserDAO;
import com.revature.phoneshop.models.User;

import java.util.List;

public class UserService {
    private final UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public boolean isDupUsername(String username) {
        List<String> username_list = userDAO.findAllUsernames();

        for (String u : username_list) {
            if (u.equals(username)) {
                return true;
            }
        }

        return false;
    }

    public boolean isValidUsername(String username) {
        return username.matches("^(?=[a-zA-Z0-9._]{4,20}$)(?!.*[_.]{2})[^_.].*[^_.]$");
    }

    public boolean isValidPassword(String password) {
        return password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$");
    }

    public boolean isValidLogin(User user) {
        List<User> userList = userDAO.findAll();

        for (User u : userList) {
            if (u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
                return true;
            }
        }

        return false;
    }
}
