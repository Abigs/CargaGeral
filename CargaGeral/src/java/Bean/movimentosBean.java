/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class movimentosBean {

    /**
     * Creates a new instance of movimentosBean
     */
    int numero;
    String data;
    String hora;
    String placa;
    String placaCavalo;
    String placaReboque;
    String transportador;
    String motorista;
    String rgMotorista;
    String cpfMotorista;
    String ctrcMotorista;
    String cnhMotorista;
    String transporteParaConta;
    String tipo;
    String movimentcao;
    String operacao;
    String condicao;
    String localOperacao;
    String cliente;
    String despachante;
    String servico;
    String navio;
    String origem;
    String destino;
    String observacao;

    public movimentosBean() {
    }

    public movimentosBean(int numero, String data, String hora, String placa, String placaCavalo, String placaReboque, String transportador, String motorista, String rgMotorista, String cpfMotorista, String ctrcMotorista, String cnhMotorista, String transporteParaConta, String tipo, String movimentcao, String operacao, String condicao, String localOperacao, String cliente, String despachante, String servico, String navio, String origem, String destino, String observacao) {


        this.numero = numero;
        this.data = data;
        this.hora = hora;
        this.placa = placa;
        this.placaCavalo = placaCavalo;
        this.placaReboque = placaReboque;
        this.transportador = transportador;
        this.motorista = motorista;
        this.rgMotorista = rgMotorista;
        this.cpfMotorista = cpfMotorista;
        this.cnhMotorista = cnhMotorista;
        this.ctrcMotorista = ctrcMotorista;
        this.transporteParaConta = transporteParaConta;
        this.tipo = tipo;
        this.movimentcao = movimentcao;
        this.operacao = operacao;
        this.condicao = condicao;
        this.localOperacao = localOperacao;
        this.cliente = cliente;
        this.despachante = despachante;
        this.servico = servico;
        this.navio = navio;
        this.origem = origem;
        this.destino = destino;
        this.observacao = observacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlacaCavalo() {
        return placaCavalo;
    }

    public void setPlacaCavalo(String placaCavalo) {
        this.placaCavalo = placaCavalo;
    }

    public String getPlacaReboque() {
        return placaReboque;
    }

    public void setPlacaReboque(String placaReboque) {
        this.placaReboque = placaReboque;
    }

    public String getTransportador() {
        return transportador;
    }

    public void setTransportador(String transportador) {
        this.transportador = transportador;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getRgMotorista() {
        return rgMotorista;
    }

    public void setRgMotorista(String rgMotorista) {
        this.rgMotorista = rgMotorista;
    }

    public String getCpfMotorista() {
        return cpfMotorista;
    }

    public void setCpfMotorista(String cpfMotorista) {
        this.cpfMotorista = cpfMotorista;
    }

    public String getCnhMotorista() {
        return cnhMotorista;
    }

    public void setCnhMotorista(String cnhMotorista) {
        this.cnhMotorista = cnhMotorista;
    }

    public String getTransporteParaConta() {
        return transporteParaConta;
    }

    public void setTransporteParaConta(String transporteParaConta) {
        this.transporteParaConta = transporteParaConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMovimentcao() {
        return movimentcao;
    }

    public void setMovimentcao(String movimentcao) {
        this.movimentcao = movimentcao;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public String getLocalOperacao() {
        return localOperacao;
    }

    public void setLocalOperacao(String localOperacao) {
        this.localOperacao = localOperacao;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDespachante() {
        return despachante;
    }

    public void setDespachante(String despachante) {
        this.despachante = despachante;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getNavio() {
        return navio;
    }

    public void setNavio(String navio) {
        this.navio = navio;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void cadastrar() {

        FacesMessage msg = new FacesMessage("Usuário ou senha incorretos");
        FacesContext.getCurrentInstance().addMessage("form", msg);
        System.out.println("oioioioiTestinho");
    }
}
