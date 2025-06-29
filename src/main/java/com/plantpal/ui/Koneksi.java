/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.plantpal.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author NUGI ARMAS
 */
public class Koneksi {

    public Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/bungaku"; // GANTI nama_database
            String user = "root"; // GANTI username MySQL
            String pass = "";     // GANTI password MySQL
            conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }

}
