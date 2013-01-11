/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entidades.Navio;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

    public boolean insertcadc010DAO() {
        try {
            String str = "INSERT INTO cadc010 VALUES ("
                    + "'" + getDescricao() + "'" + ", "
                    + getCd_navio() + ");";

            Class.forName("org.postgresql.Driver");
            java.sql.Connection conexao = DriverManager.getConnection(this.url, this.usuario, this.senha);
            Statement statement = conexao.createStatement();
            statement.executeUpdate(str);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cadc010DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(cadc010DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ArrayList<Navio> listarNavios() {
        ArrayList<Navio> list = new ArrayList<Navio>();
        try {
            String str = "SELECT * FROM cadc010 ORDER BY descricao";
           
            String strAux;
            int intAux;
           
            Class.forName("org.postgresql.Driver");
            java.sql.Connection conexao = DriverManager.getConnection(this.url, this.usuario, this.senha);
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(str);
            
            while (rs.next()) {
               strAux = rs.getString(1);
               intAux = rs.getInt(2);
               list.add(new Navio(strAux, intAux));
            }
        } catch (ClassNotFoundException ex) { 
            Logger.getLogger(cadc010DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {        
            Logger.getLogger(cadc010DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        return list;
        
    }
}
