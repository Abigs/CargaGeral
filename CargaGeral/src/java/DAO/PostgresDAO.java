/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class PostgresDAO {

    String url = "jdbc:postgresql://localhost:5432/carga_geral";
    String usuario = "postgres";
    String senha = "postgres";
    
    public PostgresDAO () {
    }
    
    
    

    public boolean testeConeccao() {
        try {
            Class.forName("org.postgresql.Driver");
            java.sql.Connection conexao = DriverManager.getConnection(this.url, this.usuario, this.senha);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PostgresDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PostgresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
