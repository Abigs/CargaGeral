/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.BalancaDAO;
import DAO.estc007DAO;
import Entidades.Navio;
import Entidades.Produto;
import java.sql.Date;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author samuel
 */
@ManagedBean
@RequestScoped
public class BalancaBean {

    // ArrayList<Navio> listaNavio;
    BalancaDAO bd = new BalancaDAO();
    String strNavio;
    String strProduto;
    Navio navio;
    Produto produto;
    int ticket;
    String cgc_cpf;
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
        //   this.listaNavio = new ArrayList<Navio>();

        this.strNavio = "";
        this.strProduto = "";

        this.ticket = this.bd.getTicket();
        this.cgc_cpf = "";
        this.placa_cavalo = "";
        this.placa_carreta = "";
        this.nome_motorista = "";
        this.cnj_transportadora = "";
        this.nr_predido = 0;
        this.peso = 0;
        this.peso_entrada = 0;
        this.peso_saida = 0;
        this.data_entrada = null;
        this.data_saida = null;
        this.faturado = false;

    }

    public String getPlaca_cavalo() {
        return placa_cavalo;
    }

    
    
    public String getStrNavio() {
        return strNavio;
    }

    public void setStrNavio(String strNavio) {
        this.strNavio = strNavio;
    }

    public String getStrProduto() {
        return strProduto;
    }

    public void setStrProduto(String strProduto) {
        this.strProduto = strProduto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

   

    // public ArrayList<Navio> getListaNavio() {
    //    return listaNavio;
    //}
    // public void setListaNavio(ArrayList<Navio> listaNavio) {
    //     this.listaNavio = listaNavio;
    // }
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

    public Navio getNavio() {
        return navio;
    }

    public void setNavio(Navio navio) {
        this.navio = navio;
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

    public void cadastrar() {
        
        retirarCnpj();

        this.navio = pegarNavio(strNavio);
        this.produto = pegarProduto(strProduto);

        this.bd.setTicket(ticket);
        this.bd.setCgc_cpf(cgc_cpf);
        this.bd.setCd_navio(navio.getCdNavio());
        this.bd.setCd_item(produto.getCd_iten());
        this.bd.setDescricao_produto(produto.getDescricao());
        this.bd.setDescricao_navio(navio.getDescricao());
        this.bd.setPlaca_carreta(placa_carreta);
        this.bd.setPlaca_cavalo(placa_cavalo);
        this.bd.setNome_motorista(nome_motorista);
        this.bd.setCnj_transportadora(cnj_transportadora);
        this.bd.setNr_predido(nr_predido);
        this.bd.setPeso(peso);
        this.bd.setPeso_entrada(peso_entrada);
        this.bd.setPeso_saida(peso_saida);
        this.bd.setData_entrada(data_entrada);
        this.bd.setData_saida(data_saida);
        this.bd.setFaturado(faturado);

        FacesMessage msg;

        if (this.bd.insertBalancaDAO()) {
            msg = new FacesMessage("Cadastro efetuado!!!");
        } else {
            msg = new FacesMessage("Cadastro Falhou");
        }

        FacesContext.getCurrentInstance().addMessage("form", msg);
    }

    public Navio pegarNavio(String str) {
        cadc010Bean cad = new cadc010Bean();
        ArrayList<Navio> list= cad.listarNavios();
        
        for (Navio navio1 : list) {
            if (navio1.toString().equals(str)) {
                return navio1;
            }
        }
        return null;
    }

    public Produto pegarProduto(String str) {
        estc007DAO est = new estc007DAO();
        ArrayList<Produto> list = est.listarProdutos();
        
        for (Produto produto1 : list) {
            if (produto1.toString().equals(str)) {
                return produto1;
            }
        }
        return null;
    }
    
    public void retirarCnpj () {
        String aux = this.cnj_transportadora;
        String aux2 = "";
        
        for (int i = 0; i < aux.length(); i++) {
            if ((aux.charAt(i) == '1') || (aux.charAt(i) == '2') ||(aux.charAt(i) == '3') ||(aux.charAt(i) == '4') ||(aux.charAt(i) == '5') ||(aux.charAt(i) == '6') ||(aux.charAt(i) == '7') ||(aux.charAt(i) == '8') ||(aux.charAt(i) == '9') ||(aux.charAt(i) == '0')) {
                aux2 = aux2 + aux.charAt(i);
            }
            
        }
        
        setCnj_transportadora(aux2);
    }
    
}
