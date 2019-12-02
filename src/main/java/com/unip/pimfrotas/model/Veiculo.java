package com.unip.pimfrotas.model;
import java.util.Objects;

public class Veiculo {

    public String placaVeiculo;
    public String codigoInternoVeiculo;
    public String marcaVeiculo;
    public String modeloVeiculo;
    public String corVeiculo;
    public String anoVeiculo;
    public String quilometragemAtualVeiculo;
    public String qntdCombustivelVeiculo;
    public String tipoCombustivelVeiculo;
    public String tipoVeiculo;
    public String motorizacaoVeiculo;
    public String clienteId;

    public Veiculo() {
    }

    public Veiculo(String placaVeiculo, String codigoInternoVeiculo, String marcaVeiculo, String modeloVeiculo, String corVeiculo, String anoVeiculo, String quilometragemAtualVeiculo, String qntdCombustivelVeiculo, String tipoCombustivelVeiculo, String tipoVeiculo, String motorizacaoVeiculo, String clienteId) {
        this.placaVeiculo = placaVeiculo;
        this.codigoInternoVeiculo = codigoInternoVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.corVeiculo = corVeiculo;
        this.anoVeiculo = anoVeiculo;
        this.quilometragemAtualVeiculo = quilometragemAtualVeiculo;
        this.qntdCombustivelVeiculo = qntdCombustivelVeiculo;
        this.tipoCombustivelVeiculo = tipoCombustivelVeiculo;
        this.tipoVeiculo = tipoVeiculo;
        this.motorizacaoVeiculo = motorizacaoVeiculo;
        this.clienteId = clienteId;
    }

    public String getPlacaVeiculo() {
        return this.placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getCodigoInternoVeiculo() {
        return this.codigoInternoVeiculo;
    }

    public void setCodigoInternoVeiculo(String codigoInternoVeiculo) {
        this.codigoInternoVeiculo = codigoInternoVeiculo;
    }

    public String getMarcaVeiculo() {
        return this.marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return this.modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getCorVeiculo() {
        return this.corVeiculo;
    }

    public void setCorVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    public String getAnoVeiculo() {
        return this.anoVeiculo;
    }

    public void setAnoVeiculo(String anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public String getQuilometragemAtualVeiculo() {
        return this.quilometragemAtualVeiculo;
    }

    public void setQuilometragemAtualVeiculo(String quilometragemAtualVeiculo) {
        this.quilometragemAtualVeiculo = quilometragemAtualVeiculo;
    }

    public String getQntdCombustivelVeiculo() {
        return this.qntdCombustivelVeiculo;
    }

    public void setQntdCombustivelVeiculo(String qntdCombustivelVeiculo) {
        this.qntdCombustivelVeiculo = qntdCombustivelVeiculo;
    }

    public String getTipoCombustivelVeiculo() {
        return this.tipoCombustivelVeiculo;
    }

    public void setTipoCombustivelVeiculo(String tipoCombustivelVeiculo) {
        this.tipoCombustivelVeiculo = tipoCombustivelVeiculo;
    }

    public String getTipoVeiculo() {
        return this.tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getMotorizacaoVeiculo() {
        return this.motorizacaoVeiculo;
    }

    public void setMotorizacaoVeiculo(String motorizacaoVeiculo) {
        this.motorizacaoVeiculo = motorizacaoVeiculo;
    }

    public String getClienteId() {
        return this.clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public Veiculo placaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
        return this;
    }

    public Veiculo codigoInternoVeiculo(String codigoInternoVeiculo) {
        this.codigoInternoVeiculo = codigoInternoVeiculo;
        return this;
    }

    public Veiculo marcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
        return this;
    }

    public Veiculo modeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
        return this;
    }

    public Veiculo corVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
        return this;
    }

    public Veiculo anoVeiculo(String anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
        return this;
    }

    public Veiculo quilometragemAtualVeiculo(String quilometragemAtualVeiculo) {
        this.quilometragemAtualVeiculo = quilometragemAtualVeiculo;
        return this;
    }

    public Veiculo qntdCombustivelVeiculo(String qntdCombustivelVeiculo) {
        this.qntdCombustivelVeiculo = qntdCombustivelVeiculo;
        return this;
    }

    public Veiculo tipoCombustivelVeiculo(String tipoCombustivelVeiculo) {
        this.tipoCombustivelVeiculo = tipoCombustivelVeiculo;
        return this;
    }

    public Veiculo tipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
        return this;
    }

    public Veiculo motorizacaoVeiculo(String motorizacaoVeiculo) {
        this.motorizacaoVeiculo = motorizacaoVeiculo;
        return this;
    }

    public Veiculo clienteId(String clienteId) {
        this.clienteId = clienteId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Veiculo)) {
            return false;
        }
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(placaVeiculo, veiculo.placaVeiculo) && Objects.equals(codigoInternoVeiculo, veiculo.codigoInternoVeiculo) && Objects.equals(marcaVeiculo, veiculo.marcaVeiculo) && Objects.equals(modeloVeiculo, veiculo.modeloVeiculo) && Objects.equals(corVeiculo, veiculo.corVeiculo) && Objects.equals(anoVeiculo, veiculo.anoVeiculo) && Objects.equals(quilometragemAtualVeiculo, veiculo.quilometragemAtualVeiculo) && Objects.equals(qntdCombustivelVeiculo, veiculo.qntdCombustivelVeiculo) && Objects.equals(tipoCombustivelVeiculo, veiculo.tipoCombustivelVeiculo) && Objects.equals(tipoVeiculo, veiculo.tipoVeiculo) && Objects.equals(motorizacaoVeiculo, veiculo.motorizacaoVeiculo) && Objects.equals(clienteId, veiculo.clienteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placaVeiculo, codigoInternoVeiculo, marcaVeiculo, modeloVeiculo, corVeiculo, anoVeiculo, quilometragemAtualVeiculo, qntdCombustivelVeiculo, tipoCombustivelVeiculo, tipoVeiculo, motorizacaoVeiculo, clienteId);
    }

    @Override
    public String toString() {
        return "{" +
            "\"placaVeiculo\":\"" + getPlacaVeiculo() + "\"" +
            ",\"codigoInternoVeiculo\":\"" + getCodigoInternoVeiculo() + "\"" +
            ",\"marcaVeiculo\":\"" + getMarcaVeiculo() + "\"" +
            ",\"modeloVeiculo\":\"" + getModeloVeiculo() + "\"" +
            ",\"corVeiculo\":\"" + getCorVeiculo() + "\"" +
            ",\"anoVeiculo\":\"" + getAnoVeiculo() + "\"" +
            ",\"quilometragemAtualVeiculo\":\"" + getQuilometragemAtualVeiculo() + "\"" +
            ",\"qntdCombustivelVeiculo\":\"" + getQntdCombustivelVeiculo() + "\"" +
            ",\"tipoCombustivelVeiculo\":\"" + getTipoCombustivelVeiculo() + "\"" +
            ",\"tipoVeiculo\":\"" + getTipoVeiculo() + "\"" +
            ",\"motorizacaoVeiculo\":\"" + getMotorizacaoVeiculo() + "\"" +
            ",\"clienteId\":\"" + getClienteId() + "\"" +
            "}";
    }
}
