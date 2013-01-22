/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Produto;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class admc05DAO extends PostgresDAO {

    int id;
    String usuario;
    String senha;
    boolean autorizado;
    boolean acesso_filial;

    public admc05DAO() {
        this.id = 0;
        this.usuario = "";
        this.autorizado = false;
        this.senha = "";
        this.acesso_filial = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public boolean isAcesso_filial() {
        return acesso_filial;
    }

    public void setAcesso_filial(boolean acesso_filial) {
        this.acesso_filial = acesso_filial;
    }

    public void insertestc007DAO() {
        try {
            String str = "INSERT INTO balanca VALUES ("
                    + getId() + ", "
                    + getUsuario() + ", "
                    + getSenha() + ", "
                    + isAutorizado() + ", "
                    + isAcesso_filial() + ", "
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

    public boolean verificarAcesso(String nome, String senha) {
        try {
            String str = "SELECT * FROM admc05 WHERE usuario = '" + nome + "' and senha = '" + senha + "';";

            Class.forName("org.postgresql.Driver");
            java.sql.Connection conexao = DriverManager.getConnection(this.url, this.usuario, this.senha);
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(str);
            try {
                if (rs.first()) {
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(admc05DAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(admc05DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(admc05DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
