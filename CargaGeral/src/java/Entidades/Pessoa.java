/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import DAO.admc05DAO;

/**
 *
 * @author samuel
 */
public class Pessoa {
    int id_pessoa;
    String usuario;
    String senha;
    boolean autorizado;
    boolean acesso_filial;

    public Pessoa(int id_pessoa, String usuario, String senha, boolean autorizado, boolean acesso_filial) {
        this.id_pessoa = id_pessoa;
        this.usuario = usuario;
        this.senha = senha;
        this.autorizado = autorizado;
        this.acesso_filial = acesso_filial;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
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
    
   
    
}
