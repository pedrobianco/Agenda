package agenda.java;

import com.mysql.jdbc.Connection;

/**
 *
 * @author pedro
 */
public class Agenda {
    
        
    public int cod_pac;
    public String nome;
    public String email;
    public String endereco;
    public String estuf;
    public String telefone;
    public String pesquisar;

    /**
     * @return the pesquisar
     */
    public String getPesquisar() {
        return pesquisar;
    }

    /**
     * @param pesquisar the pesquisar to set
     */
    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }
    


    /**
     * @return the estuf
     */
    public String getEstuf() {
        return estuf;
    }

    /**
     * @param estuf the estuf to set
     */
    public void setEstuf(String estuf) {
        this.estuf = estuf;
    }
    
    Connection con;
    
    public Agenda(){
        con = (Connection) Conexao.getconnection();
    }
    
    /**
     * @return the cod_pac
     */
    public int getCod_pac() {
        return cod_pac;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param cod_pac the cod_pac to set
     */
    public void setCod_pac(int cod_pac) {
        this.cod_pac = cod_pac;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
   
}
