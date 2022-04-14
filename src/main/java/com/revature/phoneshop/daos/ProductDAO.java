package com.revature.phoneshop.daos;

import com.revature.phoneshop.connection.DatabaseConnection;
import com.revature.phoneshop.models.Product;
import com.revature.phoneshop.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductDAO implements CrudDAO<Product> {
    Connection con = DatabaseConnection.getCon();

    @Override
    public int save(Product obj) {

            int n = 0;
            try {


            PreparedStatement ps = con.prepareStatement("INSERT INTO Product (name, brand, model, price, warehouses_id) VALUES (?,?,?,?,?, ?)");

            //   ps.setId("id");
            ps.setString(1, obj.getName());
            ps.setString(2, obj.getBrand());
            ps.setString(3, obj.getModel());
            ps.setInt(4, obj.getPrice());
            ps.setInt(5, obj.getWarehouse_id());

            ps.executeUpdate();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return n;
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM product");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Product product = new Product();

                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setBrand(rs.getString("brand"));
                product.setModel(rs.getString("model"));
                product.setPrice(rs.getInt("price"));
                product.setWarehouse_id(rs.getInt("warehouse_id"));

                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productList;
    }
    @Override
    public Product findById(int id) {
        return null;
    }


    @Override
    public List<Product> findAllById(int id) {return null; }

    @Override
    public boolean update(Product updatedObj) {return false; }

    @Override
    public boolean removeById(String id) {return false; }

    public List<String> findAllUsernames() {
        List<String> name_list = new ArrayList<>();


        try {
            PreparedStatement ps = con.prepareStatement("SELECT (name) FROM product");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                name_list.add(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return name_list;
    }

    public int getUserId(String username) {
        int id = 0;

        try {
            PreparedStatement ps = con.prepareStatement("SELECT (id) FROM product where name = ?");
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

    public Product findByname(String name) {
        Product product = new Product();

        try {
            PreparedStatement ps = con.prepareStatement("select * from product where name = ?");
            ps.setString(1,name);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                product.setId(rs.getInt("id"));
               product.setName(rs.getString("name"));
                product.setBrand(rs.getString("brand"));
               product.setModel(rs.getString("model"));
                product.setWarehouse_id(rs.getInt("warehouse_ID"));

            }

        } catch(SQLException e) {
            e.printStackTrace();
        }

        return product;
    }
}




