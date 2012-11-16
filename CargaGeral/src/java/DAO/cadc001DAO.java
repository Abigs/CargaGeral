/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class cadc001DAO extends PostgresDAO{
    
    int id_cliente;
    String nome;
    String cgc_cpf;
    String cgc_cpf_local;
    int local_fat;
    String endereco;
    int numero;
    int cd_municipio;
    String nome_municipio;
    String uf;
    String i_estadual;
    String bairro;
    String telefone;

    public cadc001DAO() {
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCgc_cpf() {
        return cgc_cpf;
    }

    public void setCgc_cpf(String cgc_cpf) {
        this.cgc_cpf = cgc_cpf;
    }

    public String getCgc_cpf_local() {
        return cgc_cpf_local;
    }

    public void setCgc_cpf_local(String cgc_cpf_local) {
        this.cgc_cpf_local = cgc_cpf_local;
    }

    public int getLocal_fat() {
        return local_fat;
    }

    public void setLocal_fat(int local_fat) {
        this.local_fat = local_fat;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCd_municipio() {
        return cd_municipio;
    }

    public void setCd_municipio(int cd_municipio) {
        this.cd_municipio = cd_municipio;
    }

    public String getNome_municipio() {
        return nome_municipio;
    }

    public void setNome_municipio(String nome_municipio) {
        this.nome_municipio = nome_municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getI_estadual() {
        return i_estadual;
    }

    public void setI_estadual(String i_estadual) {
        this.i_estadual = i_estadual;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void insertCadc001DAO() {
        try {
            String str = "INSERT INTO balanca VALUES ("
                    + getNome() + ", "
                    + getCgc_cpf() + ", "
                    + getCgc_cpf_local() + ", "
                    + getLocal_fat() + ", "
                    + getEndereco() + ", "
                    + getNumero() + ", "
                    + getCd_municipio() + ", "
                    + getUf() + ", "
                    + getI_estadual() + ", "
                    + getBairro() + ", "
                    + getTelefone() + ", "
                    + ");";
            
            Class.forName("org.postgresql.Driver");
            java.sql.Connection conexao = DriverManager.getConnection(this.url, this.usuario, this.senha);
            Statement statement = conexao.createStatement();
            statement.execute(str);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BalancaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BalancaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
