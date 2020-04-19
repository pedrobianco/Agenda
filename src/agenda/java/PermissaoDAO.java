package agenda.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PermissaoDAO {
	
	public final String SELECT_PERMISSOES = "select * from permissao";
	
	Connection conn;

	public PermissaoDAO() {
	}
	
	public ArrayList<Permissao> selectPermissoes(){
		ArrayList<Permissao> permissoes = new ArrayList<Permissao>();
		conn = Conexao.getconnection();
		try {
			permissoes = this.selectPermissoes(conn);
		} finally {

		}
		return permissoes;
	}
	
	public ArrayList<Permissao> selectPermissoes(Connection conn){
		ArrayList<Permissao> permissoes = new ArrayList<Permissao>();
		try {
			 PreparedStatement stmt = null;
			 stmt = conn.prepareStatement(SELECT_PERMISSOES);
			 if (stmt != null) {
				 int i =  1;
				 ResultSet rs = stmt.executeQuery();
				 while (rs.next()) {
					 Permissao perm = new Permissao();
					 perm.setId_permissao(rs.getString(i++));
					 perm.setDescricao(rs.getString(i++));
					 permissoes.add(perm);
				 }
			 }
			
		} catch (Exception e) {
			 System.out.println("Erro ao buscar as permissoes");
		}
		return permissoes;
	}
	
	
		

}
