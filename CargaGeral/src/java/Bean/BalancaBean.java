/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.BalancaDAO;
import java.sql.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author samuel
 */
@ManagedBean
@SessionScoped
public class BalancaBean {

    BalancaDAO bd = new BalancaDAO();
    int ticket;
    String cgc_cpf;
    int cd_navio;
    int cd_item;
    String descricao_produto;
    String descricao_navio;
    String placa_cavalo;
    String placa_carreta;
    String nome_motorista;
    String cnj_transportadora;
    int nr_predido;
    double peso;
    double peso_entrada;
    double peso_saida;
    Date data_entrada;
    Date data_saida;
    boolean faturado;

    public BalancaBean() {
        this.ticket = this.bd.getTicket();

    }

    public BalancaDAO getBd() {
        return bd;
    }

    public void setBd(BalancaDAO bd) {
        this.bd = bd;
    }

    public int getTicket() {
        setTicket(bd.pegarTicket());
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getCgc_cpf() {
        return cgc_cpf;
    }

    public void setCgc_cpf(String cgc_cpf) {
        this.cgc_cpf = cgc_cpf;
    }

    public int getCd_navio() {
        return cd_navio;
    }

    public void setCd_navio(int cd_navio) {
        this.cd_navio = cd_navio;
    }

    public int getCd_item() {
        return cd_item;
    }

    public void setCd_item(int cd_item) {
        this.cd_item = cd_item;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public String getDescricao_navio() {
        return descricao_navio;
    }

    public void setDescricao_navio(String descricao_navio) {
        this.descricao_navio = descricao_navio;
    }

    public String getPlaca_cavalo() {
        return placa_cavalo;
    }

    public void setPlaca_cavalo(String placa_cavalo) {
        this.placa_cavalo = placa_cavalo;
    }

    public String getPlaca_carreta() {
        return placa_carreta;
    }

    public void setPlaca_carreta(String placa_carreta) {
        this.placa_carreta = placa_carreta;
    }

    public String getNome_motorista() {
        return nome_motorista;
    }

    public void setNome_motorista(String nome_motorista) {
        this.nome_motorista = nome_motorista;
    }

    public String getCnj_transportadora() {
        return cnj_transportadora;
    }

    public void setCnj_transportadora(String cnj_transportadora) {
        this.cnj_transportadora = cnj_transportadora;
    }

    public int getNr_predido() {
        return nr_predido;
    }

    public void setNr_predido(int nr_predido) {
        this.nr_predido = nr_predido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso_entrada() {
        return peso_entrada;
    }

    public void setPeso_entrada(double peso_entrada) {
        this.peso_entrada = peso_entrada;
    }

    public double getPeso_saida() {
        return peso_saida;
    }

    public void setPeso_saida(double peso_saida) {
        this.peso_saida = peso_saida;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Date getData_saida() {
        return data_saida;
    }

    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }

    public boolean isFaturado() {
        return faturado;
    }

    public void setFaturado(boolean faturado) {
        this.faturado = faturado;
    }
}
