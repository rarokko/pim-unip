package com.unip.pimfrotas.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DbConnection {

    Statement stmt = null;
    ResultSet rs = null;
    Connection conn = null;

    public DbConnection() {
        this.connect();
    }

    public void connect() {

        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MecFrotas?useLegacyDatetimeCode=false&serverTimezone=UTC&user=root&password=579122xxX@");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public ResultSet query(String queryString) {

        try {
          stmt = conn.createStatement();
          stmt.execute(queryString);
          rs = stmt.getResultSet();
          return rs;
        } catch (SQLException ex) {
          System.out.println("SQLException: " + ex.getMessage());
          System.out.println("SQLState: " + ex.getSQLState());
          System.out.println("VendorError: " + ex.getErrorCode());
          return rs;
        }

    }
}