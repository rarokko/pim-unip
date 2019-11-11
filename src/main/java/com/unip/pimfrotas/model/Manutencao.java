package com.unip.pimfrotas.model;
import java.util.Objects;

public class Manutencao {

    public String dataManutencao;
    public String empresaManutencao;
    public String tipoManutencao;
    public String descricaoManutencao;
    public String valorManutencao;
    public String clienteId;
    public String placaVeiculo;

    public Manutencao() {
    }

    public Manutencao(String dataManutencao, String empresaManutencao, String tipoManutencao, String descricaoManutencao, String valorManutencao, String clienteId, String placaVeiculo) {
        this.dataManutencao = dataManutencao;
        this.empresaManutencao = empresaManutencao;
        this.tipoManutencao = tipoManutencao;
        this.descricaoManutencao = descricaoManutencao;
        this.valorManutencao = valorManutencao;
        this.clienteId = clienteId;
        this.placaVeiculo = placaVeiculo;
    }

    public String getDataManutencao() {
        return this.dataManutencao;
    }

    public void setDataManutencao(String dataManutencao) {
        this.dataManutencao = dataManutencao;
    }

    public String getEmpresaManutencao() {
        return this.empresaManutencao;
    }

    public void setEmpresaManutencao(String empresaManutencao) {
        this.empresaManutencao = empresaManutencao;
    }

    public String getTipoManutencao() {
        return this.tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    public String getDescricaoManutencao() {
        return this.descricaoManutencao;
    }

    public void setDescricaoManutencao(String descricaoManutencao) {
        this.descricaoManutencao = descricaoManutencao;
    }

    public String getValorManutencao() {
        return this.valorManutencao;
    }

    public void setValorManutencao(String valorManutencao) {
        this.valorManutencao = valorManutencao;
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

    public Manutencao dataManutencao(String dataManutencao) {
        this.dataManutencao = dataManutencao;
        return this;
    }

    public Manutencao empresaManutencao(String empresaManutencao) {
        this.empresaManutencao = empresaManutencao;
        return this;
    }

    public Manutencao tipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
        return this;
    }

    public Manutencao descricaoManutencao(String descricaoManutencao) {
        this.descricaoManutencao = descricaoManutencao;
        return this;
    }

    public Manutencao valorManutencao(String valorManutencao) {
        this.valorManutencao = valorManutencao;
        return this;
    }

    public Manutencao clienteId(String clienteId) {
        this.clienteId = clienteId;
        return this;
    }

    public Manutencao placaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Manutencao)) {
            return false;
        }
        Manutencao manutencao = (Manutencao) o;
        return Objects.equals(dataManutencao, manutencao.dataManutencao) && Objects.equals(empresaManutencao, manutencao.empresaManutencao) && Objects.equals(tipoManutencao, manutencao.tipoManutencao) && Objects.equals(descricaoManutencao, manutencao.descricaoManutencao) && Objects.equals(valorManutencao, manutencao.valorManutencao) && Objects.equals(clienteId, manutencao.clienteId) && Objects.equals(placaVeiculo, manutencao.placaVeiculo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataManutencao, empresaManutencao, tipoManutencao, descricaoManutencao, valorManutencao, clienteId, placaVeiculo);
    }

    @Override
    public String toString() {
        return "{" +
            " dataManutencao='" + getDataManutencao() + "'" +
            ", empresaManutencao='" + getEmpresaManutencao() + "'" +
            ", tipoManutencao='" + getTipoManutencao() + "'" +
            ", descricaoManutencao='" + getDescricaoManutencao() + "'" +
            ", valorManutencao='" + getValorManutencao() + "'" +
            ", clienteId='" + getClienteId() + "'" +
            ", placaVeiculo='" + getPlacaVeiculo() + "'" +
            "}";
    }

}