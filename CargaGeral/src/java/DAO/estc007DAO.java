/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Navio;
import Entidades.Produto;
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
public class estc007DAO extends PostgresDAO {

    int cd_iten;
    String descricao;
    String ncm;
    String cd_unidade;

    public estc007DAO() {
    }

    public int getCd_iten() {
        return cd_iten;
    }

    public void setCd_iten(int cd_iten) {
        this.cd_iten = cd_iten;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getCd_unidade() {
        return cd_unidade;
    }

    public void setCd_unidade(String cd_unidade) {
        this.cd_unidade = cd_unidade;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public void insertestc007DAO() {
        try {
            String str = "INSERT INTO balanca VALUES ("
                    + getCd_iten() + ", "
                    + getDescricao() + ", "
                    + getNcm() + ", "
                    + getCd_unidade() + ", "
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

    public ArrayList<Produto> listarProdutos() {
        ArrayList<Produto> list = new ArrayList<Produto>();
        try {
            String str = "SELECT * FROM estc007 ORDER BY ncm";

            Class.forName("org.postgresql.Driver");
            java.sql.Connection conexao = DriverManager.getConnection(this.url, this.usuario, this.senha);
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(str);

            while (rs.next()) {

                list.add(new Produto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(estc007DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(estc007DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }
}
