package agenda.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	
	public static final String KEY_SELECT_LOGIN = "select * from usuarios where login = ?";
	
	Connection conn;
	
	public void LoginDao() {
	}
	
	public Usuarios consultaPorLogin(String login) {
		Usuarios usu = new Usuarios();
		conn = Conexao.getconnection();
		try {
			usu = this.consultaPorLogin(login, conn);
		} finally {
			
		}
		return usu;
	}
	
	public Usuarios consultaPorLogin (String login, Connection conn) {
		Usuarios usu = new Usuarios();
		 PreparedStatement stmt = null;
		 try {
			 stmt = conn.prepareStatement(KEY_SELECT_LOGIN);
			 if (stmt != null) {
				 int i =  1;  
				 stmt.setString(i++, login);
				 ResultSet rs = stmt.executeQuery();
				  while (rs.next()){
					  i = 1;
					  usu.setNome(rs.getString(i++));
					  usu.setLogin(rs.getString(i++));
					  usu.setSenha(rs.getLong(i++));
				  }
			 }
			 
		 } catch (Exception e) {
			 System.out.println("Erro ao consultar por codigo nos usuarios");
		 }
		 return usu;
	}

}
