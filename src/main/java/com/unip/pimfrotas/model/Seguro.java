package com.unip.pimfrotas.model;
import java.util.Objects;

public class Seguro {
    
    public String apoliceSeguro;
    public String tipoSeguro;
    public String dataVigenciaSeguro;
    public String dataVencimentoSeguro;
    public String valorSeguro;
    public String securadoraSeguro;
    public String corretorSeguro;
    public String telefoneCorretorSeguro;
    public String situacaoSeguro;
    public String clienteId;
    public String placaVeiculo;

    public Seguro() {
    }

    public Seguro(String apoliceSeguro, String tipoSeguro, String dataVigenciaSeguro, String dataVencimentoSeguro, String valorSeguro, String securadoraSeguro, String corretorSeguro, String telefoneCorretorSeguro, String situacaoSeguro, String clienteId, String placaVeiculo) {
        this.apoliceSeguro = apoliceSeguro;
        this.tipoSeguro = tipoSeguro;
        this.dataVigenciaSeguro = dataVigenciaSeguro;
        this.dataVencimentoSeguro = dataVencimentoSeguro;
        this.valorSeguro = valorSeguro;
        this.securadoraSeguro = securadoraSeguro;
        this.corretorSeguro = corretorSeguro;
        this.telefoneCorretorSeguro = telefoneCorretorSeguro;
        this.situacaoSeguro = situacaoSeguro;
        this.clienteId = clienteId;
        this.placaVeiculo = placaVeiculo;
    }

    public String getApoliceSeguro() {
        return this.apoliceSeguro;
    }

    public void setApoliceSeguro(String apoliceSeguro) {
        this.apoliceSeguro = apoliceSeguro;
    }

    public String getTipoSeguro() {
        return this.tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getDataVigenciaSeguro() {
        return this.dataVigenciaSeguro;
    }

    public void setDataVigenciaSeguro(String dataVigenciaSeguro) {
        this.dataVigenciaSeguro = dataVigenciaSeguro;
    }

    public String getDataVencimentoSeguro() {
        return this.dataVencimentoSeguro;
    }

    public void setDataVencimentoSeguro(String dataVencimentoSeguro) {
        this.dataVencimentoSeguro = dataVencimentoSeguro;
    }

    public String getValorSeguro() {
        return this.valorSeguro;
    }

    public void setValorSeguro(String valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public String getSecuradoraSeguro() {
        return this.securadoraSeguro;
    }

    public void setSecuradoraSeguro(String securadoraSeguro) {
        this.securadoraSeguro = securadoraSeguro;
    }

    public String getCorretorSeguro() {
        return this.corretorSeguro;
    }

    public void setCorretorSeguro(String corretorSeguro) {
        this.corretorSeguro = corretorSeguro;
    }

    public String getTelefoneCorretorSeguro() {
        return this.telefoneCorretorSeguro;
    }

    public void setTelefoneCorretorSeguro(String telefoneCorretorSeguro) {
        this.telefoneCorretorSeguro = telefoneCorretorSeguro;
    }

    public String getSituacaoSeguro() {
        return this.situacaoSeguro;
    }

    public void setSituacaoSeguro(String situacaoSeguro) {
        this.situacaoSeguro = situacaoSeguro;
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

    public Seguro apoliceSeguro(String apoliceSeguro) {
        this.apoliceSeguro = apoliceSeguro;
        return this;
    }

    public Seguro tipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
        return this;
    }

    public Seguro dataVigenciaSeguro(String dataVigenciaSeguro) {
        this.dataVigenciaSeguro = dataVigenciaSeguro;
        return this;
    }

    public Seguro dataVencimentoSeguro(String dataVencimentoSeguro) {
        this.dataVencimentoSeguro = dataVencimentoSeguro;
        return this;
    }

    public Seguro valorSeguro(String valorSeguro) {
        this.valorSeguro = valorSeguro;
        return this;
    }

    public Seguro securadoraSeguro(String securadoraSeguro) {
        this.securadoraSeguro = securadoraSeguro;
        return this;
    }

    public Seguro corretorSeguro(String corretorSeguro) {
        this.corretorSeguro = corretorSeguro;
        return this;
    }

    public Seguro telefoneCorretorSeguro(String telefoneCorretorSeguro) {
        this.telefoneCorretorSeguro = telefoneCorretorSeguro;
        return this;
    }

    public Seguro situacaoSeguro(String situacaoSeguro) {
        this.situacaoSeguro = situacaoSeguro;
        return this;
    }

    public Seguro clienteId(String clienteId) {
        this.clienteId = clienteId;
        return this;
    }

    public Seguro placaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Seguro)) {
            return false;
        }
        Seguro seguro = (Seguro) o;
        return Objects.equals(apoliceSeguro, seguro.apoliceSeguro) && Objects.equals(tipoSeguro, seguro.tipoSeguro) && Objects.equals(dataVigenciaSeguro, seguro.dataVigenciaSeguro) && Objects.equals(dataVencimentoSeguro, seguro.dataVencimentoSeguro) && Objects.equals(valorSeguro, seguro.valorSeguro) && Objects.equals(securadoraSeguro, seguro.securadoraSeguro) && Objects.equals(corretorSeguro, seguro.corretorSeguro) && Objects.equals(telefoneCorretorSeguro, seguro.telefoneCorretorSeguro) && Objects.equals(situacaoSeguro, seguro.situacaoSeguro) && Objects.equals(clienteId, seguro.clienteId) && Objects.equals(placaVeiculo, seguro.placaVeiculo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apoliceSeguro, tipoSeguro, dataVigenciaSeguro, dataVencimentoSeguro, valorSeguro, securadoraSeguro, corretorSeguro, telefoneCorretorSeguro, situacaoSeguro, clienteId, placaVeiculo);
    }

    @Override
    public String toString() {
        return "{" +
            "\"apoliceSeguro\":\"" + getApoliceSeguro() + "\"" +
            ",\"tipoSeguro\":\"" + getTipoSeguro() + "\"" +
            ",\"dataVigenciaSeguro\":\"" + getDataVigenciaSeguro() + "\"" +
            ",\"dataVencimentoSeguro\":\"" + getDataVencimentoSeguro() + "\"" +
            ",\"valorSeguro\":\"" + getValorSeguro() + "\"" +
            ",\"securadoraSeguro\":\"" + getSecuradoraSeguro() + "\"" +
            ",\"corretorSeguro\":\"" + getCorretorSeguro() + "\"" +
            ",\"telefoneCorretorSeguro\":\"" + getTelefoneCorretorSeguro() + "\"" +
            ",\"situacaoSeguro\":\"" + getSituacaoSeguro() + "\"" +
            ",\"clienteId\":\"" + getClienteId() + "\"" +
            ",\"placaVeiculo\":\"" + getPlacaVeiculo() + "\"" +
            "}";
    }

}