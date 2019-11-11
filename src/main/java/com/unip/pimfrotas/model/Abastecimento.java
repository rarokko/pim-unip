package com.unip.pimfrotas.model;
import java.util.Objects;

public class Abastecimento {

    public String dataAbastecimento;
    public String postoAbastecimento;
    public String tipoCombustivelAbastecimento;
    public String litrosAbastecimento;
    public String valorTotalAbastecimento;
    public String clienteId;
    public String placaVeiculo;

    public Abastecimento() {
    }

    public Abastecimento(String dataAbastecimento, String postoAbastecimento, String tipoCombustivelAbastecimento, String litrosAbastecimento, String valorTotalAbastecimento, String clienteId, String placaVeiculo) {
        this.dataAbastecimento = dataAbastecimento;
        this.postoAbastecimento = postoAbastecimento;
        this.tipoCombustivelAbastecimento = tipoCombustivelAbastecimento;
        this.litrosAbastecimento = litrosAbastecimento;
        this.valorTotalAbastecimento = valorTotalAbastecimento;
        this.clienteId = clienteId;
        this.placaVeiculo = placaVeiculo;
    }

    public String getDataAbastecimento() {
        return this.dataAbastecimento;
    }

    public void setDataAbastecimento(String dataAbastecimento) {
        this.dataAbastecimento = dataAbastecimento;
    }

    public String getPostoAbastecimento() {
        return this.postoAbastecimento;
    }

    public void setPostoAbastecimento(String postoAbastecimento) {
        this.postoAbastecimento = postoAbastecimento;
    }

    public String getTipoCombustivelAbastecimento() {
        return this.tipoCombustivelAbastecimento;
    }

    public void setTipoCombustivelAbastecimento(String tipoCombustivelAbastecimento) {
        this.tipoCombustivelAbastecimento = tipoCombustivelAbastecimento;
    }

    public String getLitrosAbastecimento() {
        return this.litrosAbastecimento;
    }

    public void setLitrosAbastecimento(String litrosAbastecimento) {
        this.litrosAbastecimento = litrosAbastecimento;
    }

    public String getValorTotalAbastecimento() {
        return this.valorTotalAbastecimento;
    }

    public void setValorTotalAbastecimento(String valorTotalAbastecimento) {
        this.valorTotalAbastecimento = valorTotalAbastecimento;
    }

    public String getClienteId() {
        return this.clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getPlacaVeiculo() {
        return this.placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public Abastecimento dataAbastecimento(String dataAbastecimento) {
        this.dataAbastecimento = dataAbastecimento;
        return this;
    }

    public Abastecimento postoAbastecimento(String postoAbastecimento) {
        this.postoAbastecimento = postoAbastecimento;
        return this;
    }

    public Abastecimento tipoCombustivelAbastecimento(String tipoCombustivelAbastecimento) {
        this.tipoCombustivelAbastecimento = tipoCombustivelAbastecimento;
        return this;
    }

    public Abastecimento litrosAbastecimento(String litrosAbastecimento) {
        this.litrosAbastecimento = litrosAbastecimento;
        return this;
    }

    public Abastecimento valorTotalAbastecimento(String valorTotalAbastecimento) {
        this.valorTotalAbastecimento = valorTotalAbastecimento;
        return this;
    }

    public Abastecimento clienteId(String clienteId) {
        this.clienteId = clienteId;
        return this;
    }

    public Abastecimento placaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Abastecimento)) {
            return false;
        }
        Abastecimento abastecimento = (Abastecimento) o;
        return Objects.equals(dataAbastecimento, abastecimento.dataAbastecimento) && Objects.equals(postoAbastecimento, abastecimento.postoAbastecimento) && Objects.equals(tipoCombustivelAbastecimento, abastecimento.tipoCombustivelAbastecimento) && Objects.equals(litrosAbastecimento, abastecimento.litrosAbastecimento) && Objects.equals(valorTotalAbastecimento, abastecimento.valorTotalAbastecimento) && Objects.equals(clienteId, abastecimento.clienteId) && Objects.equals(placaVeiculo, abastecimento.placaVeiculo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataAbastecimento, postoAbastecimento, tipoCombustivelAbastecimento, litrosAbastecimento, valorTotalAbastecimento, clienteId, placaVeiculo);
    }

    @Override
    public String toString() {
        return "{" +
            " dataAbastecimento='" + getDataAbastecimento() + "'" +
            ", postoAbastecimento='" + getPostoAbastecimento() + "'" +
            ", tipoCombustivelAbastecimento='" + getTipoCombustivelAbastecimento() + "'" +
            ", litrosAbastecimento='" + getLitrosAbastecimento() + "'" +
            ", valorTotalAbastecimento='" + getValorTotalAbastecimento() + "'" +
            ", clienteId='" + getClienteId() + "'" +
            ", placaVeiculo='" + getPlacaVeiculo() + "'" +
            "}";
    }
}