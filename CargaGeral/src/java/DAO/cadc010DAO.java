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
public class cadc010DAO extends PostgresDAO {
    String descricao;
    int cd_navio;

    public cadc010DAO() {
        this.cd_navio = 0;
        this.descricao = "";
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCd_navio() {
        return cd_navio;
    }

    public void setCd_navio(int cd_navio) {
        this.cd_navio = cd_navio;
    }
    
    
    
     public void insertestc007DAO() {
        try {
            String str = "INSERT INTO balanca VALUES ("
                    + getCd_navio() + ", "
                    + getDescricao() + ", "
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
