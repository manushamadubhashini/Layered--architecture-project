package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> loadAllCustomer() throws SQLException, ClassNotFoundException;

    public void saveCustomer(String id, String name, String address) throws SQLException, ClassNotFoundException;

    public void updateCustomer(String id, String name, String address) throws SQLException, ClassNotFoundException;

    public void deleteCustomer(String id) throws SQLException, ClassNotFoundException;

    public boolean exitCustomer(String id) throws SQLException, ClassNotFoundException;

    public String genereteId() throws SQLException, ClassNotFoundException;




}
