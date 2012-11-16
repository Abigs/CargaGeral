/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class fatm001DAO extends PostgresDAO{
  int cd_empresa; 
  int cd_filial;
  boolean cancelado;
  int cd_deposito;
  int cd_conta_financeira;
  int cd_filial_dest;
  int cd_operacao;
  int cd_navio;
  int cd_deposito_des;
  int cd_cfop;
  int cd_operacao_agr;
  String cgc_cpf;
  String cgc_cpf_dest;
  String cgc_cpf_dev;
  String cgc_cpf_repres;
  Date data_emissao;
  Date data_mvto;
  String especie_dcto;
  Time hora_lcto;
  int local_fat;
  int loca_fat_dest;
  int local_fat_dev;
  int local_fat_repres;
  boolean nf_emitida;
  int nf_prod;
  String nome;
  String nome_navio;
  String nome_transportador;
  int nr_contr;
  int nr_contrato;
  int nr_custo;
  int nr_dcto;
  int nr_fatura;
  int nr_pedido;
  int nr_pedido_ex;
  int nr_selo_fiscal;
  int nr_ticket;
  double perc_comissao;
  String placa;
  double qtd_geral;
  int seq_fat_mae;
  int seq_faturamento;
  int seq_nfc;
  int seq_processo;
  String serie;
  boolean tipo_operacao;
  String usuario;
  double vlr_geral;
  String inscricao;
  int seq_controle;
  String nr_container;

    public fatm001DAO() {
    }

    public int getCd_empresa() {
        return cd_empresa;
    }

    public void setCd_empresa(int cd_empresa) {
        this.cd_empresa = cd_empresa;
    }

    public int getCd_filial() {
        return cd_filial;
    }

    public void setCd_filial(int cd_filial) {
        this.cd_filial = cd_filial;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public int getCd_deposito() {
        return cd_deposito;
    }

    public void setCd_deposito(int cd_deposito) {
        this.cd_deposito = cd_deposito;
    }

    public int getCd_conta_financeira() {
        return cd_conta_financeira;
    }

    public void setCd_conta_financeira(int cd_conta_financeira) {
        this.cd_conta_financeira = cd_conta_financeira;
    }

    public int getCd_filial_dest() {
        return cd_filial_dest;
    }

    public void setCd_filial_dest(int cd_filial_dest) {
        this.cd_filial_dest = cd_filial_dest;
    }

    public int getCd_operacao() {
        return cd_operacao;
    }

    public void setCd_operacao(int cd_operacao) {
        this.cd_operacao = cd_operacao;
    }

    public int getCd_navio() {
        return cd_navio;
    }

    public void setCd_navio(int cd_navio) {
        this.cd_navio = cd_navio;
    }

    public int getCd_deposito_des() {
        return cd_deposito_des;
    }

    public void setCd_deposito_des(int cd_deposito_des) {
        this.cd_deposito_des = cd_deposito_des;
    }

    public int getCd_cfop() {
        return cd_cfop;
    }

    public void setCd_cfop(int cd_cfop) {
        this.cd_cfop = cd_cfop;
    }

    public int getCd_operacao_agr() {
        return cd_operacao_agr;
    }

    public void setCd_operacao_agr(int cd_operacao_agr) {
        this.cd_operacao_agr = cd_operacao_agr;
    }

    public String getCgc_cpf() {
        return cgc_cpf;
    }

    public void setCgc_cpf(String cgc_cpf) {
        this.cgc_cpf = cgc_cpf;
    }

    public String getCgc_cpf_dest() {
        return cgc_cpf_dest;
    }

    public void setCgc_cpf_dest(String cgc_cpf_dest) {
        this.cgc_cpf_dest = cgc_cpf_dest;
    }

    public String getCgc_cpf_dev() {
        return cgc_cpf_dev;
    }

    public void setCgc_cpf_dev(String cgc_cpf_dev) {
        this.cgc_cpf_dev = cgc_cpf_dev;
    }

    public String getCgc_cpf_repres() {
        return cgc_cpf_repres;
    }

    public void setCgc_cpf_repres(String cgc_cpf_repres) {
        this.cgc_cpf_repres = cgc_cpf_repres;
    }

    public Date getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(Date data_emissao) {
        this.data_emissao = data_emissao;
    }

    public Date getData_mvto() {
        return data_mvto;
    }

    public void setData_mvto(Date data_mvto) {
        this.data_mvto = data_mvto;
    }

    public String getEspecie_dcto() {
        return especie_dcto;
    }

    public void setEspecie_dcto(String especie_dcto) {
        this.especie_dcto = especie_dcto;
    }

    public Time getHora_lcto() {
        return hora_lcto;
    }

    public void setHora_lcto(Time hora_lcto) {
        this.hora_lcto = hora_lcto;
    }

    public int getLocal_fat() {
        return local_fat;
    }

    public void setLocal_fat(int local_fat) {
        this.local_fat = local_fat;
    }

    public int getLoca_fat_dest() {
        return loca_fat_dest;
    }

    public void setLoca_fat_dest(int loca_fat_dest) {
        this.loca_fat_dest = loca_fat_dest;
    }

    public int getLocal_fat_dev() {
        return local_fat_dev;
    }

    public void setLocal_fat_dev(int local_fat_dev) {
        this.local_fat_dev = local_fat_dev;
    }

    public int getLocal_fat_repres() {
        return local_fat_repres;
    }

    public void setLocal_fat_repres(int local_fat_repres) {
        this.local_fat_repres = local_fat_repres;
    }

    public boolean isNf_emitida() {
        return nf_emitida;
    }

    public void setNf_emitida(boolean nf_emitida) {
        this.nf_emitida = nf_emitida;
    }

    public int getNf_prod() {
        return nf_prod;
    }

    public void setNf_prod(int nf_prod) {
        this.nf_prod = nf_prod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_navio() {
        return nome_navio;
    }

    public void setNome_navio(String nome_navio) {
        this.nome_navio = nome_navio;
    }

    public String getNome_transportador() {
        return nome_transportador;
    }

    public void setNome_transportador(String nome_transportador) {
        this.nome_transportador = nome_transportador;
    }

    public int getNr_contr() {
        return nr_contr;
    }

    public void setNr_contr(int nr_contr) {
        this.nr_contr = nr_contr;
    }

    public int getNr_contrato() {
        return nr_contrato;
    }

    public void setNr_contrato(int nr_contrato) {
        this.nr_contrato = nr_contrato;
    }

    public int getNr_custo() {
        return nr_custo;
    }

    public void setNr_custo(int nr_custo) {
        this.nr_custo = nr_custo;
    }

    public int getNr_dcto() {
        return nr_dcto;
    }

    public void setNr_dcto(int nr_dcto) {
        this.nr_dcto = nr_dcto;
    }

    public int getNr_fatura() {
        return nr_fatura;
    }

    public void setNr_fatura(int nr_fatura) {
        this.nr_fatura = nr_fatura;
    }

    public int getNr_pedido() {
        return nr_pedido;
    }

    public void setNr_pedido(int nr_pedido) {
        this.nr_pedido = nr_pedido;
    }

    public int getNr_pedido_ex() {
        return nr_pedido_ex;
    }

    public void setNr_pedido_ex(int nr_pedido_ex) {
        this.nr_pedido_ex = nr_pedido_ex;
    }

    public int getNr_selo_fiscal() {
        return nr_selo_fiscal;
    }

    public void setNr_selo_fiscal(int nr_selo_fiscal) {
        this.nr_selo_fiscal = nr_selo_fiscal;
    }

    public int getNr_ticket() {
        return nr_ticket;
    }

    public void setNr_ticket(int nr_ticket) {
        this.nr_ticket = nr_ticket;
    }

    public double getPerc_comissao() {
        return perc_comissao;
    }

    public void setPerc_comissao(double perc_comissao) {
        this.perc_comissao = perc_comissao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getQtd_geral() {
        return qtd_geral;
    }

    public void setQtd_geral(double qtd_geral) {
        this.qtd_geral = qtd_geral;
    }

    public int getSeq_fat_mae() {
        return seq_fat_mae;
    }

    public void setSeq_fat_mae(int seq_fat_mae) {
        this.seq_fat_mae = seq_fat_mae;
    }

    public int getSeq_faturamento() {
        return seq_faturamento;
    }

    public void setSeq_faturamento(int seq_faturamento) {
        this.seq_faturamento = seq_faturamento;
    }

    public int getSeq_nfc() {
        return seq_nfc;
    }

    public void setSeq_nfc(int seq_nfc) {
        this.seq_nfc = seq_nfc;
    }

    public int getSeq_processo() {
        return seq_processo;
    }

    public void setSeq_processo(int seq_processo) {
        this.seq_processo = seq_processo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public boolean isTipo_operacao() {
        return tipo_operacao;
    }

    public void setTipo_operacao(boolean tipo_operacao) {
        this.tipo_operacao = tipo_operacao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getVlr_geral() {
        return vlr_geral;
    }

    public void setVlr_geral(double vlr_geral) {
        this.vlr_geral = vlr_geral;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public int getSeq_controle() {
        return seq_controle;
    }

    public void setSeq_controle(int seq_controle) {
        this.seq_controle = seq_controle;
    }

    public String getNr_container() {
        return nr_container;
    }

    public void setNr_container(String nr_container) {
        this.nr_container = nr_container;
    }
  
  public void insertfatm001DAO() {
        try {
            String str = "INSERT INTO balanca VALUES ("
                    + getCd_empresa() + ", "
                    + getCd_filial() + ", "
                    + isCancelado() + ", "
                    + getCd_deposito() + ", "
                    + getCd_conta_financeira() + ", "
                    + getCd_filial_dest() + ", "
                    + getCd_operacao() + ", "
                    + getCd_navio() + ", "
                    + getCd_deposito_des() + ", "
                    + getCd_cfop() + ", "
                    + getCd_operacao_agr() + ", "
                    + getCgc_cpf() + ", "
                    + getCgc_cpf_dest() + ", "
                    + getCgc_cpf_dev() + ", "
                    + getCgc_cpf_repres() + ", "
                    + getData_emissao() + ", "
                    + getData_mvto() + ", "
                    + getEspecie_dcto() + ", "
                    + getHora_lcto() + ", "
                    + getLocal_fat() + ", "
                    + getLoca_fat_dest() + ", "
                    + getLocal_fat_dev() + ", "
                    + getLocal_fat_repres() + ", "
                    + isNf_emitida() + ", "
                    + getNf_prod() + ", "
                    + getNome() + ", "
                    + getNome_navio() + ", "
                    + getNome_transportador() + ", "
                    + getNr_contr() + ", "
                    + getNr_contrato() + ", "
                    + getNr_custo() + ", "
                    + getNr_dcto() + ", "
                    + getNr_fatura() + ", "
                    + getNr_pedido() + ", "
                    + getNr_pedido_ex() + ", "
                    + getNr_selo_fiscal() + ", "
                    + getNr_ticket() + ", "
                    + getPerc_comissao() + ", "
                    + getPlaca() + ", "
                    + getQtd_geral() + ", "
                    + getSeq_fat_mae() + ", "
                    + getSeq_faturamento() + ", "
                    + getSeq_nfc() + ", "
                    + getSeq_processo() + ", "
                    + getSerie() + ", "
                    + isTipo_operacao() + ", "
                    + getUsuario() + ", "
                    + getVlr_geral() + ", "
                    + getInscricao() + ", "
                    + getSeq_controle() + ", "
                    + getNr_container() + ", "
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
}
