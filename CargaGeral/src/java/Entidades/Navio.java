/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author samuel
 */
public class Navio {
    String descricao;
    int cdNavio;

    public Navio(String descricao, int cdNavio) {
        this.descricao = descricao;
        this.cdNavio = cdNavio;
    }

    public Navio() {
        this.descricao = "";
        this.cdNavio = 0;
    }
    
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCdNavio() {
        return cdNavio;
    }

    public void setCdNavio(int cdNavio) {
        this.cdNavio = cdNavio;
    }
    
    @Override
    public String toString () {
        return (this.descricao + "-" + this.cdNavio);
    }
    
    
}
