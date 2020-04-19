package agenda.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Agenda_DAO {
	
	public static String SQL_SELECT_USUARIO = "select * from usuarios where login = ?";
    
    Connection con;
    
    public Agenda_DAO(){
        con = Conexao.getconnectionPacientes();
    }
    
    public void inserir(Agenda a) {
        try {
            PreparedStatement stmt = this.con.prepareStatement("INSERT INTO pacientes (cod_pac, nome, email, endereco, est_uf, telefone) VALUES (?, ?, ?, ?, ? , ?) ");
            stmt.setInt(1, a.getCod_pac());
            stmt.setString(2, a.getNome());
            stmt.setString(3, a.getEmail());
            stmt.setString(4, a.getEndereco());
            stmt.setString(5, a.getEstuf());
            stmt.setString(6, a.getTelefone());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir no banco!" + ex);
        }
        
    }
    
        public void inserir(cadastro c) {
        try {
            PreparedStatement stmt = this.con.prepareStatement("INSERT INTO usuarios (nome, login, senha) VALUES (?, ?, ?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getLogin());
            stmt.setString(3, c.getSenha());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir no banco!" + ex);
        }
        
    }

    
    public Agenda buscaporcodigo(int cod_pac){
             
        if (cod_pac > 0){
            
            try{          
                
                Statement stmt = (Statement) this.con.createStatement();
                
                ResultSet rs = stmt.executeQuery("SELECT * FROM pacientes WHERE cod_pac = '" + cod_pac + "'" );
                
                Agenda ag = new Agenda();
                
                while (rs.next()){
                    
                    ag.cod_pac = rs.getInt("cod_pac");
                    ag.nome = rs.getString("nome");
                    ag.email = rs.getString("email");
                    ag.endereco = rs.getString("endereco");
                    ag.estuf = rs.getString("est_uf");
                    ag.telefone = rs.getString("telefone");
                         
                }
                
                return ag;
                
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro ao Buscar!" + ex);
                
                return null;
            }
            
        }
        return null;
 
        }         
    
    
    public void Deletar(Agenda a){
        
        PreparedStatement stmt = null;
        
        try{
            
            stmt = con.prepareStatement("DELETE FROM pacientes WHERE cod_pac = ?");
            stmt.setInt(1, a.getCod_pac());
            
            JOptionPane.showMessageDialog(null, "Deletado com Sucesso!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Deletar" + e);
        }
        
    }
    
    public void alterar(Agenda a){
    
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE pacientes SET nome = ?, email = ?, endereco = ?, est_uf = ?, telefone = ? where cod_pac = ?");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getEmail());
            stmt.setString(3, a.getEndereco());
            stmt.setString(4, a.getEstuf());
            stmt.setString(5, a.getTelefone());
            stmt.setInt(6, a.getCod_pac());
            stmt.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "Paciente Atualizado com Sucesso!");
            
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Erro ao atualizar" + e);
        }
        
    }
    
    public void buscarUsuario(String login) {
    	PreparedStatement stmt = null;
    	try {
    		stmt = con.prepareStatement(SQL_SELECT_USUARIO);
    		int i = 1;
    		stmt.setString(i++, login);
    		ResultSet rs = stmt.executeQuery();
    		System.out.println(rs.toString());
    	} catch (Exception e) {
    		 JOptionPane.showMessageDialog(null, "Erro ao atualizar" + e);
    	}
    }
    
    public static void main(String[] args) {
		Agenda_DAO ag = new Agenda_DAO();
		String usuario = "admin";
		ag.buscarUsuario(usuario);
	}
    
}
    
    

   





