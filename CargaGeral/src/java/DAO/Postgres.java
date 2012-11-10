/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.sun.jndi.ldap.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class Postgres {

    String url;
    String usuario;
    String senha;
    
    public Postgres (String banco, String usuario, String senha) {
        this.url = "jdbc:postgresql://localhost:5432/" + banco;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    
    

    public boolean testeConeccao() {
        try {
            Class.forName("org.postgresql.Driver");
            java.sql.Connection conexao = DriverManager.getConnection(this.url, this.usuario, this.senha);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Postgres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Postgres.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
