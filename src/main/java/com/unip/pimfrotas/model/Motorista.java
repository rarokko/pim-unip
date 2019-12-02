package com.unip.pimfrotas.model;
import java.util.Objects;

public class Motorista {

    public String cpfMotorista;
    public String nomeMotorista;
    public String dataNascimentoMotorista;
    public String cnhMotorista;
    public String validadeCnhMotorista;
    public String categoriaCnhMotorista;
    public String estadoMotorista;
    public String cidadeMotorista;
    public String bairroMotorista;
    public String enderecoMotorista;
    public String telefoneMotorista;
    public String emailMotorista;
    public String exameMedicoMotorista;

    public Motorista() {
    }

    public Motorista(String cpfMotorista, String nomeMotorista, String dataNascimentoMotorista, String cnhMotorista, String validadeCnhMotorista, String categoriaCnhMotorista, String estadoMotorista, String cidadeMotorista, String bairroMotorista, String enderecoMotorista, String telefoneMotorista, String emailMotorista, String exameMedicoMotorista, String clienteID) {
        this.cpfMotorista = cpfMotorista;
        this.nomeMotorista = nomeMotorista;
        this.dataNascimentoMotorista = dataNascimentoMotorista;
        this.cnhMotorista = cnhMotorista;
        this.validadeCnhMotorista = validadeCnhMotorista;
        this.categoriaCnhMotorista = categoriaCnhMotorista;
        this.estadoMotorista = estadoMotorista;
        this.cidadeMotorista = cidadeMotorista;
        this.bairroMotorista = bairroMotorista;
        this.enderecoMotorista = enderecoMotorista;
        this.telefoneMotorista = telefoneMotorista;
        this.emailMotorista = emailMotorista;
        this.exameMedicoMotorista = exameMedicoMotorista;
        this.clienteID = clienteID;
    }

    public String getCpfMotorista() {
        return this.cpfMotorista;
    }

    public void setCpfMotorista(String cpfMotorista) {
        this.cpfMotorista = cpfMotorista;
    }

    public String getNomeMotorista() {
        return this.nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getDataNascimentoMotorista() {
        return this.dataNascimentoMotorista;
    }

    public void setDataNascimentoMotorista(String dataNascimentoMotorista) {
        this.dataNascimentoMotorista = dataNascimentoMotorista;
    }

    public String getCnhMotorista() {
        return this.cnhMotorista;
    }

    public void setCnhMotorista(String cnhMotorista) {
        this.cnhMotorista = cnhMotorista;
    }

    public String getValidadeCnhMotorista() {
        return this.validadeCnhMotorista;
    }

    public void setValidadeCnhMotorista(String validadeCnhMotorista) {
        this.validadeCnhMotorista = validadeCnhMotorista;
    }

    public String getCategoriaCnhMotorista() {
        return this.categoriaCnhMotorista;
    }

    public void setCategoriaCnhMotorista(String categoriaCnhMotorista) {
        this.categoriaCnhMotorista = categoriaCnhMotorista;
    }

    public String getEstadoMotorista() {
        return this.estadoMotorista;
    }

    public void setEstadoMotorista(String estadoMotorista) {
        this.estadoMotorista = estadoMotorista;
    }

    public String getCidadeMotorista() {
        return this.cidadeMotorista;
    }

    public void setCidadeMotorista(String cidadeMotorista) {
        this.cidadeMotorista = cidadeMotorista;
    }

    public String getBairroMotorista() {
        return this.bairroMotorista;
    }

    public void setBairroMotorista(String bairroMotorista) {
        this.bairroMotorista = bairroMotorista;
    }

    public String getEnderecoMotorista() {
        return this.enderecoMotorista;
    }

    public void setEnderecoMotorista(String enderecoMotorista) {
        this.enderecoMotorista = enderecoMotorista;
    }

    public String getTelefoneMotorista() {
        return this.telefoneMotorista;
    }

    public void setTelefoneMotorista(String telefoneMotorista) {
        this.telefoneMotorista = telefoneMotorista;
    }

    public String getEmailMotorista() {
        return this.emailMotorista;
    }

    public void setEmailMotorista(String emailMotorista) {
        this.emailMotorista = emailMotorista;
    }

    public String getExameMedicoMotorista() {
        return this.exameMedicoMotorista;
    }

    public void setExameMedicoMotorista(String exameMedicoMotorista) {
        this.exameMedicoMotorista = exameMedicoMotorista;
    }

    public String getClienteID() {
        return this.clienteID;
    }

    public void setClienteID(String clienteID) {
        this.clienteID = clienteID;
    }

    public Motorista cpfMotorista(String cpfMotorista) {
        this.cpfMotorista = cpfMotorista;
        return this;
    }

    public Motorista nomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
        return this;
    }

    public Motorista dataNascimentoMotorista(String dataNascimentoMotorista) {
        this.dataNascimentoMotorista = dataNascimentoMotorista;
        return this;
    }

    public Motorista cnhMotorista(String cnhMotorista) {
        this.cnhMotorista = cnhMotorista;
        return this;
    }

    public Motorista validadeCnhMotorista(String validadeCnhMotorista) {
        this.validadeCnhMotorista = validadeCnhMotorista;
        return this;
    }

    public Motorista categoriaCnhMotorista(String categoriaCnhMotorista) {
        this.categoriaCnhMotorista = categoriaCnhMotorista;
        return this;
    }

    public Motorista estadoMotorista(String estadoMotorista) {
        this.estadoMotorista = estadoMotorista;
        return this;
    }

    public Motorista cidadeMotorista(String cidadeMotorista) {
        this.cidadeMotorista = cidadeMotorista;
        return this;
    }

    public Motorista bairroMotorista(String bairroMotorista) {
        this.bairroMotorista = bairroMotorista;
        return this;
    }

    public Motorista enderecoMotorista(String enderecoMotorista) {
        this.enderecoMotorista = enderecoMotorista;
        return this;
    }

    public Motorista telefoneMotorista(String telefoneMotorista) {
        this.telefoneMotorista = telefoneMotorista;
        return this;
    }

    public Motorista emailMotorista(String emailMotorista) {
        this.emailMotorista = emailMotorista;
        return this;
    }

    public Motorista exameMedicoMotorista(String exameMedicoMotorista) {
        this.exameMedicoMotorista = exameMedicoMotorista;
        return this;
    }

    public Motorista clienteID(String clienteID) {
        this.clienteID = clienteID;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Motorista)) {
            return false;
        }
        Motorista motorista = (Motorista) o;
        return Objects.equals(cpfMotorista, motorista.cpfMotorista) && Objects.equals(nomeMotorista, motorista.nomeMotorista) && Objects.equals(dataNascimentoMotorista, motorista.dataNascimentoMotorista) && Objects.equals(cnhMotorista, motorista.cnhMotorista) && Objects.equals(validadeCnhMotorista, motorista.validadeCnhMotorista) && Objects.equals(categoriaCnhMotorista, motorista.categoriaCnhMotorista) && Objects.equals(estadoMotorista, motorista.estadoMotorista) && Objects.equals(cidadeMotorista, motorista.cidadeMotorista) && Objects.equals(bairroMotorista, motorista.bairroMotorista) && Objects.equals(enderecoMotorista, motorista.enderecoMotorista) && Objects.equals(telefoneMotorista, motorista.telefoneMotorista) && Objects.equals(emailMotorista, motorista.emailMotorista) && Objects.equals(exameMedicoMotorista, motorista.exameMedicoMotorista) && Objects.equals(clienteID, motorista.clienteID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpfMotorista, nomeMotorista, dataNascimentoMotorista, cnhMotorista, validadeCnhMotorista, categoriaCnhMotorista, estadoMotorista, cidadeMotorista, bairroMotorista, enderecoMotorista, telefoneMotorista, emailMotorista, exameMedicoMotorista, clienteID);
    }

    @Override
    public String toString() {
        return "{" +
            "\"cpfMotorista\":\"" + getCpfMotorista() + "\"" +
            ",\"nomeMotorista\":\"" + getNomeMotorista() + "\"" +
            ",\"dataNascimentoMotorista\":\"" + getDataNascimentoMotorista() + "\"" +
            ",\"cnhMotorista\":\"" + getCnhMotorista() + "\"" +
            ",\"validadeCnhMotorista\":\"" + getValidadeCnhMotorista() + "\"" +
            ",\"categoriaCnhMotorista\":\"" + getCategoriaCnhMotorista() + "\"" +
            ",\"estadoMotorista\":\"" + getEstadoMotorista() + "\"" +
            ",\"cidadeMotorista\":\"" + getCidadeMotorista() + "\"" +
            ",\"bairroMotorista\":\"" + getBairroMotorista() + "\"" +
            ",\"enderecoMotorista\":\"" + getEnderecoMotorista() + "\"" +
            ",\"telefoneMotorista\":\"" + getTelefoneMotorista() + "\"" +
            ",\"emailMotorista\":\"" + getEmailMotorista() + "\"" +
            ",\"exameMedicoMotorista\":\"" + getExameMedicoMotorista() + "\"" +
            ",\"clienteID\":\"" + getClienteID() + "\"" +
            "}";
    }
    public String clienteID;

}