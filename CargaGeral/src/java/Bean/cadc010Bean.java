/*
 * Classe Navio
 */
package Bean;

import DAO.cadc010DAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author samuel
 */
@ManagedBean
@SessionScoped
public class cadc010Bean {

    cadc010DAO cadc10 = new cadc010DAO();
    String descricao;
    int cd_navio;

    public cadc010DAO getCadc10() {
        return cadc10;
    }

    public void setCadc10(cadc010DAO cadc10) {
        this.cadc10 = cadc10;
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
    
    public void Cadastrar () {
        this.cadc10.setCd_navio(cd_navio);
        this.cadc10.setDescricao(descricao);
        //inserção
        this.cadc10.insertestc007DAO();
    }

    /**
     * Creates a new instance of cadc010Bean
     */
    public cadc010Bean() {
    }
}
