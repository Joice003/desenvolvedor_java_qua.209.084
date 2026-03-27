package com.atividade05.app;

import java.util.Scanner;

import com.atividade05.models.Professor;
import com.atividade05.models.Aluno;;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor();
        Aluno aluno = new Aluno();

        double b;
        double a;

        System.out.println("Informe o nome do aluno:");
        aluno.nome = sc.nextLine();

        System.out.println(aluno.apresentar());

        professor.nome = "Maria Teresa";
        professor.matricula = "011010";

        System.out.println(professor.bemVindo());

        System.out.println("Informe o valor da base:");
        b = sc.nextDouble();
        System.out.println("Informe o valor da altura:");
        a = sc.nextDouble();

        System.out.println("A área do triângulo é" + professor.areaDoTriangulo());

        sc.close();


    }
}
// TODO: atividade 05
// Utilizando os conceitos básicos de orientação a objetos, crie um
// programa que um aluno informa seus dados (nome, idade e email) e pede 
// para um professor (dados: nome e matrícula) calcular para ele as
// seguintes fórmulas: área do triângulo ((base*altura)/2), área do circulo e equação do 1º
// grau, e exibe o resultado na tela.
// NOTE: crie as classes Aluno e Professor no package models, que fica
// dentro de com.atividade05.