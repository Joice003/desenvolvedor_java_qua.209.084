package com.atividade05.models;

public class Aluno {
// atributos
public String nome;
public int idade;
public String email;

// método
public String apresentar() {
    return "Eu sou" + this.nome + " tenho " + this.idade + " anos, e meu email é " + this.email + ".";
}
}
