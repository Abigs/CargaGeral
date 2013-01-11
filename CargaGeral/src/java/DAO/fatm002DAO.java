/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class fatm002DAO extends PostgresDAO{

    double aliq;
    double aliq_cofins;
    double aliq_issqn;
    double aliq_pis;
    int cd_cor;
    String cd_centro_custo;
    int cd_deposito;
    int cd_empresa;
    int cd_filial_preco;
    int cd_iten;
    int cd_tabela;
    String cd_unidade;
    double custo_medio;
    String descricao;
    int nr_laudo;
    String nr_lote;
    int nr_pedido;
    int nr_romaneio;
    String obs;
    String obs_item;
    double perc_comissao;
    double perc_desconto;
    double perc_tx_adm;
    double perc_tx_cap;
    double ps_entrada;
    double ps_saida;
    double qtd;
    double qtd_geral;
    String safra;
    int seq_fat_mae;
    int seq_faturamento;
    int seq_item;
    int seq_tabela;
    String sit_tributaria;
    String tamanho;
    int tp_mercadoria;
    int tp_produto;
    double vlr_adm;
    double vlr_aj_estoque;
    double vlr_apr_cofins;
    double vlr_apr_icms;
    double vlr_apr_pis;
    double vlr_base;
    double vlr_base_sub;
    double vlr_cap;
    double vlr_cofins;
    double vlr_contabil;
    double vlr_deposito;
    double vlr_desconto;
    double vlr_diferencial;
    double vlr_estoque;
    double vlr_frete;
    double vlr_geral;
    double vlr_icms;
    double vlr_icms_fonte;
    double vlr_imp_importacao;
    double vlr_imposto_sub;
    double vlr_ipi;
    double vlr_isento;
    double vlr_issqn;
    double vlr_out_estoque;
    double vlr_outros;
    double vlr_pis;
    double vlr_total;
    double vlr_unit_moeda;
    double vlr_unitario;
    int id;

    public fatm002DAO() {
    }

    public double getAliq() {
        return aliq;
    }

    public void setAliq(double aliq) {
        this.aliq = aliq;
    }

    public double getAliq_cofins() {
        return aliq_cofins;
    }

    public void setAliq_cofins(double aliq_cofins) {
        this.aliq_cofins = aliq_cofins;
    }

    public double getAliq_issqn() {
        return aliq_issqn;
    }

    public void setAliq_issqn(double aliq_issqn) {
        this.aliq_issqn = aliq_issqn;
    }

    public double getAliq_pis() {
        return aliq_pis;
    }

    public void setAliq_pis(double aliq_pis) {
        this.aliq_pis = aliq_pis;
    }

    public int getCd_cor() {
        return cd_cor;
    }

    public void setCd_cor(int cd_cor) {
        this.cd_cor = cd_cor;
    }

    public String getCd_centro_custo() {
        return cd_centro_custo;
    }

    public void setCd_centro_custo(String cd_centro_custo) {
        this.cd_centro_custo = cd_centro_custo;
    }

    public int getCd_deposito() {
        return cd_deposito;
    }

    public void setCd_deposito(int cd_deposito) {
        this.cd_deposito = cd_deposito;
    }

    public int getCd_empresa() {
        return cd_empresa;
    }

    public void setCd_empresa(int cd_empresa) {
        this.cd_empresa = cd_empresa;
    }

    public int getCd_filial_preco() {
        return cd_filial_preco;
    }

    public void setCd_filial_preco(int cd_filial_preco) {
        this.cd_filial_preco = cd_filial_preco;
    }

    public int getCd_iten() {
        return cd_iten;
    }

    public void setCd_iten(int cd_iten) {
        this.cd_iten = cd_iten;
    }

    public int getCd_tabela() {
        return cd_tabela;
    }

    public void setCd_tabela(int cd_tabela) {
        this.cd_tabela = cd_tabela;
    }

    public String getCd_unidade() {
        return cd_unidade;
    }

    public void setCd_unidade(String cd_unidade) {
        this.cd_unidade = cd_unidade;
    }

    public double getCusto_medio() {
        return custo_medio;
    }

    public void setCusto_medio(double custo_medio) {
        this.custo_medio = custo_medio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNr_laudo() {
        return nr_laudo;
    }

    public void setNr_laudo(int nr_laudo) {
        this.nr_laudo = nr_laudo;
    }

    public String getNr_lote() {
        return nr_lote;
    }

    public void setNr_lote(String nr_lote) {
        this.nr_lote = nr_lote;
    }

    public int getNr_pedido() {
        return nr_pedido;
    }

    public void setNr_pedido(int nr_pedido) {
        this.nr_pedido = nr_pedido;
    }

    public int getNr_romaneio() {
        return nr_romaneio;
    }

    public void setNr_romaneio(int nr_romaneio) {
        this.nr_romaneio = nr_romaneio;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getObs_item() {
        return obs_item;
    }

    public void setObs_item(String obs_item) {
        this.obs_item = obs_item;
    }

    public double getPerc_comissao() {
        return perc_comissao;
    }

    public void setPerc_comissao(double perc_comissao) {
        this.perc_comissao = perc_comissao;
    }

    public double getPerc_desconto() {
        return perc_desconto;
    }

    public void setPerc_desconto(double perc_desconto) {
        this.perc_desconto = perc_desconto;
    }

    public double getPerc_tx_adm() {
        return perc_tx_adm;
    }

    public void setPerc_tx_adm(double perc_tx_adm) {
        this.perc_tx_adm = perc_tx_adm;
    }

    public double getPerc_tx_cap() {
        return perc_tx_cap;
    }

    public void setPerc_tx_cap(double perc_tx_cap) {
        this.perc_tx_cap = perc_tx_cap;
    }

    public double getPs_entrada() {
        return ps_entrada;
    }

    public void setPs_entrada(double ps_entrada) {
        this.ps_entrada = ps_entrada;
    }

    public double getPs_saida() {
        return ps_saida;
    }

    public void setPs_saida(double ps_saida) {
        this.ps_saida = ps_saida;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public double getQtd_geral() {
        return qtd_geral;
    }

    public void setQtd_geral(double qtd_geral) {
        this.qtd_geral = qtd_geral;
    }

    public String getSafra() {
        return safra;
    }

    public void setSafra(String safra) {
        this.safra = safra;
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

    public int getSeq_item() {
        return seq_item;
    }

    public void setSeq_item(int seq_item) {
        this.seq_item = seq_item;
    }

    public int getSeq_tabela() {
        return seq_tabela;
    }

    public void setSeq_tabela(int seq_tabela) {
        this.seq_tabela = seq_tabela;
    }

    public String getSit_tributaria() {
        return sit_tributaria;
    }

    public void setSit_tributaria(String sit_tributaria) {
        this.sit_tributaria = sit_tributaria;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getTp_mercadoria() {
        return tp_mercadoria;
    }

    public void setTp_mercadoria(int tp_mercadoria) {
        this.tp_mercadoria = tp_mercadoria;
    }

    public int getTp_produto() {
        return tp_produto;
    }

    public void setTp_produto(int tp_produto) {
        this.tp_produto = tp_produto;
    }

    public double getVlr_adm() {
        return vlr_adm;
    }

    public void setVlr_adm(double vlr_adm) {
        this.vlr_adm = vlr_adm;
    }

    public double getVlr_aj_estoque() {
        return vlr_aj_estoque;
    }

    public void setVlr_aj_estoque(double vlr_aj_estoque) {
        this.vlr_aj_estoque = vlr_aj_estoque;
    }

    public double getVlr_apr_cofins() {
        return vlr_apr_cofins;
    }

    public void setVlr_apr_cofins(double vlr_apr_cofins) {
        this.vlr_apr_cofins = vlr_apr_cofins;
    }

    public double getVlr_apr_icms() {
        return vlr_apr_icms;
    }

    public void setVlr_apr_icms(double vlr_apr_icms) {
        this.vlr_apr_icms = vlr_apr_icms;
    }

    public double getVlr_apr_pis() {
        return vlr_apr_pis;
    }

    public void setVlr_apr_pis(double vlr_apr_pis) {
        this.vlr_apr_pis = vlr_apr_pis;
    }

    public double getVlr_base() {
        return vlr_base;
    }

    public void setVlr_base(double vlr_base) {
        this.vlr_base = vlr_base;
    }

    public double getVlr_base_sub() {
        return vlr_base_sub;
    }

    public void setVlr_base_sub(double vlr_base_sub) {
        this.vlr_base_sub = vlr_base_sub;
    }

    public double getVlr_cap() {
        return vlr_cap;
    }

    public void setVlr_cap(double vlr_cap) {
        this.vlr_cap = vlr_cap;
    }

    public double getVlr_cofins() {
        return vlr_cofins;
    }

    public void setVlr_cofins(double vlr_cofins) {
        this.vlr_cofins = vlr_cofins;
    }

    public double getVlr_contabil() {
        return vlr_contabil;
    }

    public void setVlr_contabil(double vlr_contabil) {
        this.vlr_contabil = vlr_contabil;
    }

    public double getVlr_deposito() {
        return vlr_deposito;
    }

    public void setVlr_deposito(double vlr_deposito) {
        this.vlr_deposito = vlr_deposito;
    }

    public double getVlr_desconto() {
        return vlr_desconto;
    }

    public void setVlr_desconto(double vlr_desconto) {
        this.vlr_desconto = vlr_desconto;
    }

    public double getVlr_diferencial() {
        return vlr_diferencial;
    }

    public void setVlr_diferencial(double vlr_diferencial) {
        this.vlr_diferencial = vlr_diferencial;
    }

    public double getVlr_estoque() {
        return vlr_estoque;
    }

    public void setVlr_estoque(double vlr_estoque) {
        this.vlr_estoque = vlr_estoque;
    }

    public double getVlr_frete() {
        return vlr_frete;
    }

    public void setVlr_frete(double vlr_frete) {
        this.vlr_frete = vlr_frete;
    }

    public double getVlr_geral() {
        return vlr_geral;
    }

    public void setVlr_geral(double vlr_geral) {
        this.vlr_geral = vlr_geral;
    }

    public double getVlr_icms() {
        return vlr_icms;
    }

    public void setVlr_icms(double vlr_icms) {
        this.vlr_icms = vlr_icms;
    }

    public double getVlr_icms_fonte() {
        return vlr_icms_fonte;
    }

    public void setVlr_icms_fonte(double vlr_icms_fonte) {
        this.vlr_icms_fonte = vlr_icms_fonte;
    }

    public double getVlr_imp_importacao() {
        return vlr_imp_importacao;
    }

    public void setVlr_imp_importacao(double vlr_imp_importacao) {
        this.vlr_imp_importacao = vlr_imp_importacao;
    }

    public double getVlr_imposto_sub() {
        return vlr_imposto_sub;
    }

    public void setVlr_imposto_sub(double vlr_imposto_sub) {
        this.vlr_imposto_sub = vlr_imposto_sub;
    }

    public double getVlr_ipi() {
        return vlr_ipi;
    }

    public void setVlr_ipi(double vlr_ipi) {
        this.vlr_ipi = vlr_ipi;
    }

    public double getVlr_isento() {
        return vlr_isento;
    }

    public void setVlr_isento(double vlr_isento) {
        this.vlr_isento = vlr_isento;
    }

    public double getVlr_issqn() {
        return vlr_issqn;
    }

    public void setVlr_issqn(double vlr_issqn) {
        this.vlr_issqn = vlr_issqn;
    }

    public double getVlr_out_estoque() {
        return vlr_out_estoque;
    }

    public void setVlr_out_estoque(double vlr_out_estoque) {
        this.vlr_out_estoque = vlr_out_estoque;
    }

    public double getVlr_outros() {
        return vlr_outros;
    }

    public void setVlr_outros(double vlr_outros) {
        this.vlr_outros = vlr_outros;
    }

    public double getVlr_pis() {
        return vlr_pis;
    }

    public void setVlr_pis(double vlr_pis) {
        this.vlr_pis = vlr_pis;
    }

    public double getVlr_total() {
        return vlr_total;
    }

    public void setVlr_total(double vlr_total) {
        this.vlr_total = vlr_total;
    }

    public double getVlr_unit_moeda() {
        return vlr_unit_moeda;
    }

    public void setVlr_unit_moeda(double vlr_unit_moeda) {
        this.vlr_unit_moeda = vlr_unit_moeda;
    }

    public double getVlr_unitario() {
        return vlr_unitario;
    }

    public void setVlr_unitario(double vlr_unitario) {
        this.vlr_unitario = vlr_unitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void insertfatm002DAO() {
        try {
            String str = "INSERT INTO balanca VALUES ("
                    + getAliq() + ", "
                    + getAliq_cofins() + ", "
                    + getAliq_issqn() + ", "
                    + getAliq_pis() + ", "
                    + getCd_cor() + ", "
                    + getCd_centro_custo() + ", "
                    + getCd_deposito() + ", "
                    + getCd_empresa() + ", "
                    + getCd_filial_preco() + ", "
                    + getCd_iten() + ", "
                    + getCd_tabela() + ", "
                    + getCd_unidade() + ", "
                    + getCusto_medio() + ", "
                    + getDescricao() + ", "
                    + getNr_laudo() + ", "
                    + getNr_lote() + ", "
                    + getNr_pedido() + ", "
                    + getObs() + ", "
                    + getObs_item() + ", "
                    + getPerc_comissao() + ", "
                    + getPerc_desconto() + ", "
                    + getPerc_tx_adm() + ", "
                    + getPerc_tx_cap() + ", "
                    + getPs_entrada() + ", "
                    + getPs_saida() + ", "
                    + getQtd() + ", "
                    + getQtd_geral() + ", "
                    + getSafra() + ", "
                    + getSeq_faturamento() + ", "
                    + getSeq_item() + ", "
                    + getSeq_tabela() + ", "
                    + getSit_tributaria() + ", "
                    + getTamanho() + ", "
                    + getTp_mercadoria() + ", "
                    + getTp_produto() + ", "
                    + getVlr_adm() + ", "
                    + getVlr_aj_estoque() + ", "
                    + getVlr_apr_cofins() + ", "
                    + getVlr_apr_pis() + ", "
                    + getVlr_base() + ", "
                    + getVlr_base_sub() + ", "
                    + getVlr_cap() + ", "
                    + getVlr_cofins() + ", "
                    + getVlr_contabil() + ", "
                    + getVlr_deposito() + ", "
                    + getVlr_desconto() + ", "
                    + getVlr_diferencial() + ", "
                    + getVlr_estoque() + ", "
                    + getVlr_frete() + ", "
                    + getVlr_geral() + ", "
                    + getVlr_icms() + ", "
                    + getVlr_icms_fonte() + ", "
                    + getVlr_imp_importacao() + ", "
                    + getVlr_imposto_sub() + ", "
                    + getVlr_ipi() + ", "
                    + getVlr_isento() + ", "
                    + getVlr_issqn() + ", "
                    + getVlr_out_estoque() + ", "
                    + getVlr_outros() + ", "
                    + getVlr_pis() + ", "
                    + getVlr_total() + ", "
                    + getVlr_unit_moeda() + ", "
                    + getVlr_unitario() + ", "
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
