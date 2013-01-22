package Bean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.admc05DAO;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author samuel
 */
@ManagedBean
@SessionScoped
public class admc05Bean {

    int serial;
    String usuario;
    String senha;
    boolean autorizado;
    boolean acesso_filial;

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
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
    
    
    /**
     * Creates a new instance of admc05Bean
     */
    public admc05Bean() {
        
        this.acesso_filial = false;
        this.autorizado = false;
        this.senha = "";
        this.usuario = "";
        this.serial = 0;
        
    }
    
    public boolean verificarAdmc05 () {
        admc05DAO pessoa = new admc05DAO();
               
        boolean valor = pessoa.verificarAcesso(getUsuario(), getSenha());
        
        
        FacesMessage msg;

        if (valor) {
            msg = new FacesMessage("Acesso Garantido!!!");
        } else {
            msg = new FacesMessage("Acesso Negado!!!");
        }

        FacesContext.getCurrentInstance().addMessage("form", msg);
        return valor;
    }
}
