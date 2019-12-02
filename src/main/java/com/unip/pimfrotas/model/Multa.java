package com.unip.pimfrotas.model;
import java.util.Objects;

public class Multa {

    public String valorMulta;
    public String dataMulta;
    public String enderecoMulta;
    public String vencimentoPagamentoMulta;
    public String dataPagamentoMulta;
    public String descricaoMulta;
    public String clienteId;
    public String cpfMotorista;
    public String placaVeiculo;

    public Multa() {
    }

    public Multa(String valorMulta, String dataMulta, String enderecoMulta, String vencimentoPagamentoMulta, String dataPagamentoMulta, String descricaoMulta, String clienteId, String cpfMotorista, String placaVeiculo) {
        this.valorMulta = valorMulta;
        this.dataMulta = dataMulta;
        this.enderecoMulta = enderecoMulta;
        this.vencimentoPagamentoMulta = vencimentoPagamentoMulta;
        this.dataPagamentoMulta = dataPagamentoMulta;
        this.descricaoMulta = descricaoMulta;
        this.clienteId = clienteId;
        this.cpfMotorista = cpfMotorista;
        this.placaVeiculo = placaVeiculo;
    }

    public String getValorMulta() {
        return this.valorMulta;
    }

    public void setValorMulta(String valorMulta) {
        this.valorMulta = valorMulta;
    }

    public String getDataMulta() {
        return this.dataMulta;
    }

    public void setDataMulta(String dataMulta) {
        this.dataMulta = dataMulta;
    }

    public String getEnderecoMulta() {
        return this.enderecoMulta;
    }

    public void setEnderecoMulta(String enderecoMulta) {
        this.enderecoMulta = enderecoMulta;
    }

    public String getVencimentoPagamentoMulta() {
        return this.vencimentoPagamentoMulta;
    }

    public void setVencimentoPagamentoMulta(String vencimentoPagamentoMulta) {
        this.vencimentoPagamentoMulta = vencimentoPagamentoMulta;
    }

    public String getDataPagamentoMulta() {
        return this.dataPagamentoMulta;
    }

    public void setDataPagamentoMulta(String dataPagamentoMulta) {
        this.dataPagamentoMulta = dataPagamentoMulta;
    }

    public String getDescricaoMulta() {
        return this.descricaoMulta;
    }

    public void setDescricaoMulta(String descricaoMulta) {
        this.descricaoMulta = descricaoMulta;
    }

    public String getClienteId() {
        return this.clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getCpfMotorista() {
        return this.cpfMotorista;
    }

    public void setCpfMotorista(String cpfMotorista) {
        this.cpfMotorista = cpfMotorista;
    }

    public String getPlacaVeiculo() {
        return this.placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public Multa valorMulta(String valorMulta) {
        this.valorMulta = valorMulta;
        return this;
    }

    public Multa dataMulta(String dataMulta) {
        this.dataMulta = dataMulta;
        return this;
    }

    public Multa enderecoMulta(String enderecoMulta) {
        this.enderecoMulta = enderecoMulta;
        return this;
    }

    public Multa vencimentoPagamentoMulta(String vencimentoPagamentoMulta) {
        this.vencimentoPagamentoMulta = vencimentoPagamentoMulta;
        return this;
    }

    public Multa dataPagamentoMulta(String dataPagamentoMulta) {
        this.dataPagamentoMulta = dataPagamentoMulta;
        return this;
    }

    public Multa descricaoMulta(String descricaoMulta) {
        this.descricaoMulta = descricaoMulta;
        return this;
    }

    public Multa clienteId(String clienteId) {
        this.clienteId = clienteId;
        return this;
    }

    public Multa cpfMotorista(String cpfMotorista) {
        this.cpfMotorista = cpfMotorista;
        return this;
    }

    public Multa placaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Multa)) {
            return false;
        }
        Multa multa = (Multa) o;
        return Objects.equals(valorMulta, multa.valorMulta) && Objects.equals(dataMulta, multa.dataMulta) && Objects.equals(enderecoMulta, multa.enderecoMulta) && Objects.equals(vencimentoPagamentoMulta, multa.vencimentoPagamentoMulta) && Objects.equals(dataPagamentoMulta, multa.dataPagamentoMulta) && Objects.equals(descricaoMulta, multa.descricaoMulta) && Objects.equals(clienteId, multa.clienteId) && Objects.equals(cpfMotorista, multa.cpfMotorista) && Objects.equals(placaVeiculo, multa.placaVeiculo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valorMulta, dataMulta, enderecoMulta, vencimentoPagamentoMulta, dataPagamentoMulta, descricaoMulta, clienteId, cpfMotorista, placaVeiculo);
    }

    @Override
    public String toString() {
        return "{" +
            "\"valorMulta\":\"" + getValorMulta() + "\"" +
            ",\"dataMulta\":\"" + getDataMulta() + "\"" +
            ",\"enderecoMulta\":\"" + getEnderecoMulta() + "\"" +
            ",\"vencimentoPagamentoMulta\":\"" + getVencimentoPagamentoMulta() + "\"" +
            ",\"dataPagamentoMulta\":\"" + getDataPagamentoMulta() + "\"" +
            ",\"descricaoMulta\":\"" + getDescricaoMulta() + "\"" +
            ",\"clienteId\":\"" + getClienteId() + "\"" +
            ",\"cpfMotorista\":\"" + getCpfMotorista() + "\"" +
            ",\"placaVeiculo\":\"" + getPlacaVeiculo() + "\"" +
            "}";
    }

}