/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.java;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class conexao2 {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/usuarios";
    private static final String USER = "root";
    private static final String PASS = "";
    Connection cn = null;
    
    public static Connection getconnection(){
        try {
            Class.forName(DRIVER);
            return (Connection) DriverManager.getConnection(URL,USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro na Conexão com o banco de dados" + ex );
        }
       return null;
    }
     
}
