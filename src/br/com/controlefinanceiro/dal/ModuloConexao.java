/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controlefinanceiro.dal;


import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author welton
 */
public class ModuloConexao {

    public static Connection conector() {
        Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/controlefinanceiro?characterEncoding=utf-8";
        String user = "root";
        String password = "tyu2527tyu";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
