package com.revature.phoneshop.daos;

import com.revature.phoneshop.connection.DatabaseConnection;
import com.revature.phoneshop.models.User;
import com.revature.phoneshop.models.Cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartDAO implements CrudDAO<Cart> {
    Connection con = DatabaseConnection.getCon();

    @Override
    public int save(Cart obj) {
        return 0;
    }

    @Override
    public List<Cart> findAll() {
        return null;
    }

    @Override
    public Cart findById(int id) {
        return null;
    }

    @Override
    public List<Cart> findAllById(int id) {
        return null;
    }

    @Override
    public boolean update(Cart updatedObj) {
        return false;
    }

    @Override
    public boolean removeById(String id) {
        return false;
    }
}