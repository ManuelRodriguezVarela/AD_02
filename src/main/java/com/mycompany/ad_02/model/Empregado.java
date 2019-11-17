package com.mycompany.ad_02.model;

import java.io.Serializable;

public class Empregado implements Serializable {
    private String nome;
    private String apelidos;

    public Empregado(String nome, String apelidos) {
        this.nome = nome;
        this.apelidos = apelidos;
    }

    public Empregado() {
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

    @Override
    public String toString() {
        return "Empregado: " + "Nome: " + nome + ", Apelidos: " + apelidos + '\n';
    }
    
}
