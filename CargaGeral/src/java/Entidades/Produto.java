/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author samuel
 */
public class Produto {

    int cd_iten;
    String descricao;
    String ncm;
    String cd_unidade;

    public Produto(int cd_iten, String descricao, String ncm, String cd_unidade) {
        this.cd_iten = cd_iten;
        this.descricao = descricao;
        this.ncm = ncm;
        this.cd_unidade = cd_unidade;
    }

    public Produto() {
        this.cd_iten = 0;
        this.descricao = "";
        this.ncm = "";
        this.cd_unidade = "";
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
    
    @Override
    public String toString () {
        
        return (getNcm() + "-" + getCd_iten());
    }
    
}
