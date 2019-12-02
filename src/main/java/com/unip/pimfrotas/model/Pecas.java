package com.unip.pimfrotas.model;
import java.util.Objects;

public class Pecas {

    public String nomePeca;
    public String qntdPeca;
    public String descricaoPeca;
    public String valorPeca;
    public String clienteId;

    public Pecas() {
    }

    public Pecas(String nomePeca, String qntdPeca, String descricaoPeca, String valorPeca, String clienteId) {
        this.nomePeca = nomePeca;
        this.qntdPeca = qntdPeca;
        this.descricaoPeca = descricaoPeca;
        this.valorPeca = valorPeca;
        this.clienteId = clienteId;
    }

    public String getNomePeca() {
        return this.nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    public String getQntdPeca() {
        return this.qntdPeca;
    }

    public void setQntdPeca(String qntdPeca) {
        this.qntdPeca = qntdPeca;
    }

    public String getDescricaoPeca() {
        return this.descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }

    public String getValorPeca() {
        return this.valorPeca;
    }

    public void setValorPeca(String valorPeca) {
        this.valorPeca = valorPeca;
    }

    public String getClienteId() {
        return this.clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public Pecas nomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
        return this;
    }

    public Pecas qntdPeca(String qntdPeca) {
        this.qntdPeca = qntdPeca;
        return this;
    }

    public Pecas descricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
        return this;
    }

    public Pecas valorPeca(String valorPeca) {
        this.valorPeca = valorPeca;
        return this;
    }

    public Pecas clienteId(String clienteId) {
        this.clienteId = clienteId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pecas)) {
            return false;
        }
        Pecas pecas = (Pecas) o;
        return Objects.equals(nomePeca, pecas.nomePeca) && Objects.equals(qntdPeca, pecas.qntdPeca) && Objects.equals(descricaoPeca, pecas.descricaoPeca) && Objects.equals(valorPeca, pecas.valorPeca) && Objects.equals(clienteId, pecas.clienteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomePeca, qntdPeca, descricaoPeca, valorPeca, clienteId);
    }

    @Override
    public String toString() {
        return "{" +
            "\"nomePeca\":\"" + getNomePeca() + "\"" +
            ",\"qntdPeca\":\"" + getQntdPeca() + "\"" +
            ",\"descricaoPeca\":\"" + getDescricaoPeca() + "\"" +
            ",\"valorPeca\":\"" + getValorPeca() + "\"" +
            ",\"clienteId\":\"" + getClienteId() + "\"" +
            "}";
    }

}
