package com.revature.phoneshop.daos;

import com.revature.phoneshop.connection.DatabaseConnection;
import com.revature.phoneshop.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserDAO implements CrudDAO<User> {
    Connection con = DatabaseConnection.getCon();

    @Override
    public int save(User obj) {

        int n = 0;
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO users (firstname, lastname, address, email, username, password) VALUES (?, ?, ?, ?, ?, ?)");

            //   ps.setId("id");
            ps.setString(1, obj.getFirstname());
            ps.setString(2, obj.getLastname());
            ps.setString(3, obj.getAddress());
            ps.setString(4, obj.getEmail());
            ps.setString(5, obj.getUsername());
            ps.setString(6, obj.getPassword());


            ps.executeUpdate();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return n;
    }

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM users");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                User user = new User();

                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setFirstname(rs.getString("firstname"));
                user.setLastname(rs.getString("lastname"));
                user.setAddress(rs.getString("address"));
                user.setEmail(rs.getString("email"));

                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }

    @Override
    public User findById(int id) {
        return null;
    }


    @Override
    public List<User> findAllById(int id) {return null; }

    @Override
    public boolean update(User updatedObj) {return false; }

    @Override
    public boolean removeById(String id) {return false; }

    public List<String> findAllUsernames() {
        List<String> username_list = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement("SELECT (username) FROM users");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                username_list.add(rs.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return username_list;
    }

    public int getUserId(String username) {
        int id = 0;

        try {
            PreparedStatement ps = con.prepareStatement("SELECT (id) FROM users where username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return id;
    }

    public User findByUsername(String username) {
        User user = new User();

        try {
            PreparedStatement ps = con.prepareStatement("select * from users where username = ?");
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setAddress(rs.getString("address"));
                user.setEmail(rs.getString("email"));
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}

