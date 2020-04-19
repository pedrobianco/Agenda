package agenda.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/clinica?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "123456";
    
    static Connection cn = null;
    
    public static Connection getconnectionPacientes(){
        try {
            Class.forName(DRIVER);
            return (Connection) DriverManager.getConnection(URL,USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro na Conexão com o banco de dados" + ex );
        }
       return null;
    }
    
    public static Connection getConnectionUsuarios() {
    	try {
            Class.forName(DRIVER);
            return (Connection) DriverManager.getConnection(URL,USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro na Conexão com o banco de dados" + ex );
        }
       return null;
    }
    
 
}
