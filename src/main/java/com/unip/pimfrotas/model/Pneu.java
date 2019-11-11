package com.unip.pimfrotas.model;
import java.util.Objects;

public class Pneu {

    public String marcaPneu;
    public String quilometragemPercorridaPneu;
    public String dataPneu;
    public String valorPneu;
    public String situacaoPneu;
    public String clienteId;
    public String placaVeiculo;

    public Pneu() {
    }

    public Pneu(String marcaPneu, String quilometragemPercorridaPneu, String dataPneu, String valorPneu, String situacaoPneu, String clienteId, String placaVeiculo) {
        this.marcaPneu = marcaPneu;
        this.quilometragemPercorridaPneu = quilometragemPercorridaPneu;
        this.dataPneu = dataPneu;
        this.valorPneu = valorPneu;
        this.situacaoPneu = situacaoPneu;
        this.clienteId = clienteId;
        this.placaVeiculo = placaVeiculo;
    }

    public String getMarcaPneu() {
        return this.marcaPneu;
    }

    public void setMarcaPneu(String marcaPneu) {
        this.marcaPneu = marcaPneu;
    }

    public String getQuilometragemPercorridaPneu() {
        return this.quilometragemPercorridaPneu;
    }

    public void setQuilometragemPercorridaPneu(String quilometragemPercorridaPneu) {
        this.quilometragemPercorridaPneu = quilometragemPercorridaPneu;
    }

    public String getDataPneu() {
        return this.dataPneu;
    }

    public void setDataPneu(String dataPneu) {
        this.dataPneu = dataPneu;
    }

    public String getValorPneu() {
        return this.valorPneu;
    }

    public void setValorPneu(String valorPneu) {
        this.valorPneu = valorPneu;
    }

    public String getSituacaoPneu() {
        return this.situacaoPneu;
    }

    public void setSituacaoPneu(String situacaoPneu) {
        this.situacaoPneu = situacaoPneu;
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

    public Pneu marcaPneu(String marcaPneu) {
        this.marcaPneu = marcaPneu;
        return this;
    }

    public Pneu quilometragemPercorridaPneu(String quilometragemPercorridaPneu) {
        this.quilometragemPercorridaPneu = quilometragemPercorridaPneu;
        return this;
    }

    public Pneu dataPneu(String dataPneu) {
        this.dataPneu = dataPneu;
        return this;
    }

    public Pneu valorPneu(String valorPneu) {
        this.valorPneu = valorPneu;
        return this;
    }

    public Pneu situacaoPneu(String situacaoPneu) {
        this.situacaoPneu = situacaoPneu;
        return this;
    }

    public Pneu clienteId(String clienteId) {
        this.clienteId = clienteId;
        return this;
    }

    public Pneu placaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pneu)) {
            return false;
        }
        Pneu pneu = (Pneu) o;
        return Objects.equals(marcaPneu, pneu.marcaPneu) && Objects.equals(quilometragemPercorridaPneu, pneu.quilometragemPercorridaPneu) && Objects.equals(dataPneu, pneu.dataPneu) && Objects.equals(valorPneu, pneu.valorPneu) && Objects.equals(situacaoPneu, pneu.situacaoPneu) && Objects.equals(clienteId, pneu.clienteId) && Objects.equals(placaVeiculo, pneu.placaVeiculo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marcaPneu, quilometragemPercorridaPneu, dataPneu, valorPneu, situacaoPneu, clienteId, placaVeiculo);
    }

    @Override
    public String toString() {
        return "{" +
            " marcaPneu='" + getMarcaPneu() + "'" +
            ", quilometragemPercorridaPneu='" + getQuilometragemPercorridaPneu() + "'" +
            ", dataPneu='" + getDataPneu() + "'" +
            ", valorPneu='" + getValorPneu() + "'" +
            ", situacaoPneu='" + getSituacaoPneu() + "'" +
            ", clienteId='" + getClienteId() + "'" +
            ", placaVeiculo='" + getPlacaVeiculo() + "'" +
            "}";
    }

}