package com.mycompany.ad_02.model;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String nome;
    private String apelidos;
    private String email;

    public Cliente(String nome, String apelidos, String email) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.email = email;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente: " + "Nome: " + nome + ", Apelidos: " + apelidos + ", Email: " + email + '\n';
    }
    
}
