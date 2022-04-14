package com.revature.phoneshop.daos;

import com.revature.phoneshop.models.Warehouse;
import com.revature.phoneshop.connection.DatabaseConnection;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WarehouseDAO implements CrudDAO<Warehouse> {
    Connection con = DatabaseConnection.getCon();


    @Override
    public int  save(Warehouse obj) {

     int n = 0;

        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO Warehouses  (name, city, state, country) VALUES (?, ?, ?,?)");
            ps.setString(1, obj.getName());
            ps.setString(2, obj.getCity());
            ps.setString(3, obj.getState());
            ps.setString(3, obj.getCountry());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;
    }

    @Override
    public List<Warehouse> findAll() {

        List<Warehouse> warehouseList = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM warehouse");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Warehouse warehouse = new Warehouse();

                warehouse.setId(rs.getInt("id"));
                warehouse.setName(rs.getString("name"));
                warehouse.setCity(rs.getString("city"));
                warehouse.setState(rs.getString("state"));
                warehouse.setCountry(rs.getString("country"));

                warehouseList.add(warehouse);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return warehouseList;
    }

    @Override
    public Warehouse findById(int id) {
        return null;
    }

    @Override
    public List<Warehouse> findAllById(int id) {
        return null;
    }

    @Override
    public boolean update(Warehouse updateObj) {
        return false;
    }

    @Override
    public boolean removeById(String id) {
        return false;
    }
}