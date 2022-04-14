package com.revature.phoneshop.services;

import com.revature.phoneshop.daos.WarehouseDAO;

public class WarhouseServices {
    private final WarehouseDAO warehouseDAO;

    public WarehouseDAO getWarehouseDAO() {
        return warehouseDAO;
    }

    public WarhouseServices(WarehouseDAO warehouseDAO) {
        this.warehouseDAO = warehouseDAO;
    }
}
