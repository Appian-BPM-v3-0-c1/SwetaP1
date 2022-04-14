package com.revature.phoneshop.services;

import com.revature.phoneshop.daos.HistoryDAO;
import com.revature.phoneshop.daos.UserDAO;
import com.revature.phoneshop.models.History;

import java.util.List;
public class HistoryServices {
    private final HistoryDAO historyDAO;

    public HistoryServices(HistoryDAO historyDAO) {
        this.historyDAO = historyDAO;
    }

    public HistoryDAO getHistoryDAO() {
        return historyDAO;
    }

}

