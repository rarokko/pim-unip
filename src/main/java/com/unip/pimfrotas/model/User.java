package com.unip.pimfrotas.model;
import java.util.Objects;

public class User {

    public String nomeDoUsuario;
    public String senha;

    public User() {}

    public User(String nomeDoUsuario, String senha) {
        this.nomeDoUsuario = nomeDoUsuario;
        this.senha = senha;
    }

    public String getNomeDoUsuario() {
        return this.nomeDoUsuario;
    }

    public void setNomeDoUsuario(String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public User nomeDoUsuario(String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
        return this;
    }

    public User senha(String senha) {
        this.senha = senha;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(nomeDoUsuario, user.nomeDoUsuario) && Objects.equals(senha, user.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDoUsuario, senha);
    }

    @Override
    public String toString() {
        return "{" +
            " nomeDoUsuario='" + getNomeDoUsuario() + "'" +
            ", senha='" + getSenha() + "'" +
            "}";
    }
}