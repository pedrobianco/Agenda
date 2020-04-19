package agenda.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JOptionPane;

public class Conexao {

    static Connection cn = null;
    
    public static Connection getconnection(){
        try {
        	Properties props = loadProperties();
            String url = props.getProperty("url");
            String user = props.getProperty("user");
            String password = props.getProperty("password");
            String driver = props.getProperty("driver");
            Class.forName(driver);
            return (Connection) DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro na Conexão com o banco de dados" + ex );
        }
       return null;
    }

    private static Properties loadProperties() {
    	Properties props = new Properties();
		try (FileInputStream fs = new FileInputStream("parametros.properties")) {
			props.load(fs);
			return props;
		}
		catch (IOException e) {
			throw new ConexaoException(e.getMessage());
		}
	}
    
}
