package com.revature.phoneshop.services;

import com.revature.phoneshop.daos.HistoryDAO;
import com.revature.phoneshop.daos.ProductDAO;
import com.revature.phoneshop.daos.UserDAO;
import com.revature.phoneshop.models.History;

import java.util.List;
public class ProductServices {
    private final ProductDAO productDAO;
    public ProductServices(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public ProductDAO getProductDAO() {
        return productDAO;
    }

}

