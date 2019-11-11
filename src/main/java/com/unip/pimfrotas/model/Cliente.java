package com.unip.pimfrotas.model;
import java.util.Objects;

public class Cliente {

    public String razaoSocialCliente;
    public String cnpjCliente;
    public String enderecoCliente;
    public String bairroCliente;
    public String cidadeCliente;
    public String estadoCliente;
    public String ativo;
    public String emailCliente;
    public String telefoneCliente;
    public String qntdVeiculosCliente;
    public String qntdMotoristasCliente;

    public Cliente() {
    }

    public Cliente(String razaoSocialCliente, String cnpjCliente, String enderecoCliente, String bairroCliente, String cidadeCliente, String estadoCliente, String ativo, String emailCliente, String telefoneCliente, String qntdVeiculosCliente, String qntdMotoristasCliente) {
        this.razaoSocialCliente = razaoSocialCliente;
        this.cnpjCliente = cnpjCliente;
        this.enderecoCliente = enderecoCliente;
        this.bairroCliente = bairroCliente;
        this.cidadeCliente = cidadeCliente;
        this.estadoCliente = estadoCliente;
        this.ativo = ativo;
        this.emailCliente = emailCliente;
        this.telefoneCliente = telefoneCliente;
        this.qntdVeiculosCliente = qntdVeiculosCliente;
        this.qntdMotoristasCliente = qntdMotoristasCliente;
    }

    public String getRazaoSocialCliente() {
        return this.razaoSocialCliente;
    }

    public void setRazaoSocialCliente(String razaoSocialCliente) {
        this.razaoSocialCliente = razaoSocialCliente;
    }

    public String getCnpjCliente() {
        return this.cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

    public String getEnderecoCliente() {
        return this.enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getBairroCliente() {
        return this.bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getCidadeCliente() {
        return this.cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getEstadoCliente() {
        return this.estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public String getAtivo() {
        return this.ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getEmailCliente() {
        return this.emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelefoneCliente() {
        return this.telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getQntdVeiculosCliente() {
        return this.qntdVeiculosCliente;
    }

    public void setQntdVeiculosCliente(String qntdVeiculosCliente) {
        this.qntdVeiculosCliente = qntdVeiculosCliente;
    }

    public String getQntdMotoristasCliente() {
        return this.qntdMotoristasCliente;
    }

    public void setQntdMotoristasCliente(String qntdMotoristasCliente) {
        this.qntdMotoristasCliente = qntdMotoristasCliente;
    }

    public Cliente razaoSocialCliente(String razaoSocialCliente) {
        this.razaoSocialCliente = razaoSocialCliente;
        return this;
    }

    public Cliente cnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
        return this;
    }

    public Cliente enderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
        return this;
    }

    public Cliente bairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
        return this;
    }

    public Cliente cidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
        return this;
    }

    public Cliente estadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
        return this;
    }

    public Cliente ativo(String ativo) {
        this.ativo = ativo;
        return this;
    }

    public Cliente emailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
        return this;
    }

    public Cliente telefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
        return this;
    }

    public Cliente qntdVeiculosCliente(String qntdVeiculosCliente) {
        this.qntdVeiculosCliente = qntdVeiculosCliente;
        return this;
    }

    public Cliente qntdMotoristasCliente(String qntdMotoristasCliente) {
        this.qntdMotoristasCliente = qntdMotoristasCliente;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(razaoSocialCliente, cliente.razaoSocialCliente) && Objects.equals(cnpjCliente, cliente.cnpjCliente) && Objects.equals(enderecoCliente, cliente.enderecoCliente) && Objects.equals(bairroCliente, cliente.bairroCliente) && Objects.equals(cidadeCliente, cliente.cidadeCliente) && Objects.equals(estadoCliente, cliente.estadoCliente) && Objects.equals(ativo, cliente.ativo) && Objects.equals(emailCliente, cliente.emailCliente) && Objects.equals(telefoneCliente, cliente.telefoneCliente) && Objects.equals(qntdVeiculosCliente, cliente.qntdVeiculosCliente) && Objects.equals(qntdMotoristasCliente, cliente.qntdMotoristasCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(razaoSocialCliente, cnpjCliente, enderecoCliente, bairroCliente, cidadeCliente, estadoCliente, ativo, emailCliente, telefoneCliente, qntdVeiculosCliente, qntdMotoristasCliente);
    }

    @Override
    public String toString() {
        return "{" +
            " razaoSocialCliente='" + getRazaoSocialCliente() + "'" +
            ", cnpjCliente='" + getCnpjCliente() + "'" +
            ", enderecoCliente='" + getEnderecoCliente() + "'" +
            ", bairroCliente='" + getBairroCliente() + "'" +
            ", cidadeCliente='" + getCidadeCliente() + "'" +
            ", estadoCliente='" + getEstadoCliente() + "'" +
            ", ativo='" + getAtivo() + "'" +
            ", emailCliente='" + getEmailCliente() + "'" +
            ", telefoneCliente='" + getTelefoneCliente() + "'" +
            ", qntdVeiculosCliente='" + getQntdVeiculosCliente() + "'" +
            ", qntdMotoristasCliente='" + getQntdMotoristasCliente() + "'" +
            "}";
    }

}