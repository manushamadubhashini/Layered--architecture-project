package com.example.layeredarchitecture.dao;

import java.sql.SQLException;
import java.time.LocalDate;

public interface OrderDAO {
    public boolean saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;
    public String generateOrderId() throws SQLException, ClassNotFoundException;
    public void getOrderId(String orderId) throws SQLException, ClassNotFoundException;



}
