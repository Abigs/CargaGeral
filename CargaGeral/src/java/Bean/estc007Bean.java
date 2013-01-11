/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.estc007DAO;
import Entidades.Produto;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author samuel
 */
@ManagedBean
@RequestScoped
public class estc007Bean {
    
    estc007DAO estc = new estc007DAO();
    int cd_iten;
    String descricao;
    String ncm;
    String cd_unidade;

    /**
     * Creates a new instance of estc007Bean
     */
    public estc007Bean() {
    }

    public estc007DAO getEstc() {
        return estc;
    }

    public void setEstc(estc007DAO estc) {
        this.estc = estc;
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
    
    public ArrayList<Produto> listarProduto () {
        return estc.listarProdutos();
    }
    
    
}
