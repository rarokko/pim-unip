package com.unip.pimfrotas.model;
import java.util.Objects;

public class Viagem {
    
    public String estadoInicioViagem;
    public String cidadeInicioViagem;
    public String dataSaidaViagem;
    public String enderecoInicioViagem;
    public String dataChegadaViagem;
    public String estadoDestinoViagem;
    public String cidadeDestinoViagem;
    public String enderecoDestinoViagem;
    public String descricaoViagem;
    public String quilometragemFinalVeiculo;
    public String clienteId;
    public String cpfMotorista;
    public String placaVeiculo;

    public Viagem() {
    }

    public Viagem(String estadoInicioViagem, String cidadeInicioViagem, String dataSaidaViagem, String enderecoInicioViagem, String dataChegadaViagem, String estadoDestinoViagem, String cidadeDestinoViagem, String enderecoDestinoViagem, String descricaoViagem, String quilometragemFinalVeiculo, String clienteId, String cpfMotorista, String placaVeiculo) {
        this.estadoInicioViagem = estadoInicioViagem;
        this.cidadeInicioViagem = cidadeInicioViagem;
        this.dataSaidaViagem = dataSaidaViagem;
        this.enderecoInicioViagem = enderecoInicioViagem;
        this.dataChegadaViagem = dataChegadaViagem;
        this.estadoDestinoViagem = estadoDestinoViagem;
        this.cidadeDestinoViagem = cidadeDestinoViagem;
        this.enderecoDestinoViagem = enderecoDestinoViagem;
        this.descricaoViagem = descricaoViagem;
        this.quilometragemFinalVeiculo = quilometragemFinalVeiculo;
        this.clienteId = clienteId;
        this.cpfMotorista = cpfMotorista;
        this.placaVeiculo = placaVeiculo;
    }

    public String getEstadoInicioViagem() {
        return this.estadoInicioViagem;
    }

    public void setEstadoInicioViagem(String estadoInicioViagem) {
        this.estadoInicioViagem = estadoInicioViagem;
    }

    public String getCidadeInicioViagem() {
        return this.cidadeInicioViagem;
    }

    public void setCidadeInicioViagem(String cidadeInicioViagem) {
        this.cidadeInicioViagem = cidadeInicioViagem;
    }

    public String getDataSaidaViagem() {
        return this.dataSaidaViagem;
    }

    public void setDataSaidaViagem(String dataSaidaViagem) {
        this.dataSaidaViagem = dataSaidaViagem;
    }

    public String getEnderecoInicioViagem() {
        return this.enderecoInicioViagem;
    }

    public void setEnderecoInicioViagem(String enderecoInicioViagem) {
        this.enderecoInicioViagem = enderecoInicioViagem;
    }

    public String getDataChegadaViagem() {
        return this.dataChegadaViagem;
    }

    public void setDataChegadaViagem(String dataChegadaViagem) {
        this.dataChegadaViagem = dataChegadaViagem;
    }

    public String getEstadoDestinoViagem() {
        return this.estadoDestinoViagem;
    }

    public void setEstadoDestinoViagem(String estadoDestinoViagem) {
        this.estadoDestinoViagem = estadoDestinoViagem;
    }

    public String getCidadeDestinoViagem() {
        return this.cidadeDestinoViagem;
    }

    public void setCidadeDestinoViagem(String cidadeDestinoViagem) {
        this.cidadeDestinoViagem = cidadeDestinoViagem;
    }

    public String getEnderecoDestinoViagem() {
        return this.enderecoDestinoViagem;
    }

    public void setEnderecoDestinoViagem(String enderecoDestinoViagem) {
        this.enderecoDestinoViagem = enderecoDestinoViagem;
    }

    public String getDescricaoViagem() {
        return this.descricaoViagem;
    }

    public void setDescricaoViagem(String descricaoViagem) {
        this.descricaoViagem = descricaoViagem;
    }

    public String getQuilometragemFinalVeiculo() {
        return this.quilometragemFinalVeiculo;
    }

    public void setQuilometragemFinalVeiculo(String quilometragemFinalVeiculo) {
        this.quilometragemFinalVeiculo = quilometragemFinalVeiculo;
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

    public Viagem estadoInicioViagem(String estadoInicioViagem) {
        this.estadoInicioViagem = estadoInicioViagem;
        return this;
    }

    public Viagem cidadeInicioViagem(String cidadeInicioViagem) {
        this.cidadeInicioViagem = cidadeInicioViagem;
        return this;
    }

    public Viagem dataSaidaViagem(String dataSaidaViagem) {
        this.dataSaidaViagem = dataSaidaViagem;
        return this;
    }

    public Viagem enderecoInicioViagem(String enderecoInicioViagem) {
        this.enderecoInicioViagem = enderecoInicioViagem;
        return this;
    }

    public Viagem dataChegadaViagem(String dataChegadaViagem) {
        this.dataChegadaViagem = dataChegadaViagem;
        return this;
    }

    public Viagem estadoDestinoViagem(String estadoDestinoViagem) {
        this.estadoDestinoViagem = estadoDestinoViagem;
        return this;
    }

    public Viagem cidadeDestinoViagem(String cidadeDestinoViagem) {
        this.cidadeDestinoViagem = cidadeDestinoViagem;
        return this;
    }

    public Viagem enderecoDestinoViagem(String enderecoDestinoViagem) {
        this.enderecoDestinoViagem = enderecoDestinoViagem;
        return this;
    }

    public Viagem descricaoViagem(String descricaoViagem) {
        this.descricaoViagem = descricaoViagem;
        return this;
    }

    public Viagem quilometragemFinalVeiculo(String quilometragemFinalVeiculo) {
        this.quilometragemFinalVeiculo = quilometragemFinalVeiculo;
        return this;
    }

    public Viagem clienteId(String clienteId) {
        this.clienteId = clienteId;
        return this;
    }

    public Viagem cpfMotorista(String cpfMotorista) {
        this.cpfMotorista = cpfMotorista;
        return this;
    }

    public Viagem placaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Viagem)) {
            return false;
        }
        Viagem viagem = (Viagem) o;
        return Objects.equals(estadoInicioViagem, viagem.estadoInicioViagem) && Objects.equals(cidadeInicioViagem, viagem.cidadeInicioViagem) && Objects.equals(dataSaidaViagem, viagem.dataSaidaViagem) && Objects.equals(enderecoInicioViagem, viagem.enderecoInicioViagem) && Objects.equals(dataChegadaViagem, viagem.dataChegadaViagem) && Objects.equals(estadoDestinoViagem, viagem.estadoDestinoViagem) && Objects.equals(cidadeDestinoViagem, viagem.cidadeDestinoViagem) && Objects.equals(enderecoDestinoViagem, viagem.enderecoDestinoViagem) && Objects.equals(descricaoViagem, viagem.descricaoViagem) && Objects.equals(quilometragemFinalVeiculo, viagem.quilometragemFinalVeiculo) && Objects.equals(clienteId, viagem.clienteId) && Objects.equals(cpfMotorista, viagem.cpfMotorista) && Objects.equals(placaVeiculo, viagem.placaVeiculo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estadoInicioViagem, cidadeInicioViagem, dataSaidaViagem, enderecoInicioViagem, dataChegadaViagem, estadoDestinoViagem, cidadeDestinoViagem, enderecoDestinoViagem, descricaoViagem, quilometragemFinalVeiculo, clienteId, cpfMotorista, placaVeiculo);
    }

    @Override
    public String toString() {
        return "{" +
            "\"estadoInicioViagem\":\"" + getEstadoInicioViagem() + "\"" +
            ",\"cidadeInicioViagem\":\"" + getCidadeInicioViagem() + "\"" +
            ",\"dataSaidaViagem\":\"" + getDataSaidaViagem() + "\"" +
            ",\"enderecoInicioViagem\":\"" + getEnderecoInicioViagem() + "\"" +
            ",\"dataChegadaViagem\":\"" + getDataChegadaViagem() + "\"" +
            ",\"estadoDestinoViagem\":\"" + getEstadoDestinoViagem() + "\"" +
            ",\"cidadeDestinoViagem\":\"" + getCidadeDestinoViagem() + "\"" +
            ",\"enderecoDestinoViagem\":\"" + getEnderecoDestinoViagem() + "\"" +
            ",\"descricaoViagem\":\"" + getDescricaoViagem() + "\"" +
            ",\"quilometragemFinalVeiculo\":\"" + getQuilometragemFinalVeiculo() + "\"" +
            ",\"clienteId\":\"" + getClienteId() + "\"" +
            ",\"cpfMotorista\":\"" + getCpfMotorista() + "\"" +
            ",\"placaVeiculo\":\"" + getPlacaVeiculo() + "\"" +
            "}";
    }

}