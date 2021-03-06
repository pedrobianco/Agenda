/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class cadastro_DAO {
    
    Connection con;
    
    public cadastro_DAO(){
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
            
    public void Deletar(cadastro c){
        
        PreparedStatement stmt = null;
        
        try{
            
            stmt = con.prepareStatement("DELETE FROM usuarios WHERE login = ?");
            stmt.setString(1, c.getLogin());
            
            JOptionPane.showMessageDialog(null, "Deletado com Sucesso!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Deletar" + e);
        }
        
    }
    
    public void alterar(cadastro c){
    
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE usuarios SET nome = ?, login = ?, senha = ? where login = ?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getLogin());
            stmt.setString(3, c.getSenha());
            stmt.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "Usuario Atualizado com Sucesso!");
            
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Erro ao atualizar" + e);
        }
        
    }
    
}