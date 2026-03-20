package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nome;
        double idade;
        int opcao;
        String operador;

        System.out.println("Informe seu nome");
        nome = sc.nextLine();
        System.out.println("Informe sua idade");
        idade = sc.nextDouble();


        sc.nextLine();

        do {
        System.out.println("Informe o filme desejado:");
        System.out.println("Sala 01 - A Roda Quadrada - Livre");
        System.out.println("Sala 02 - A volda dos que não foram - 12 anos");
        System.out.println("Sala 03 - Poeira em Alto Mar - 14 anos");
        System.out.println("Sala 04 - As Tranças do Rei Careca - 16 anos");
        System.out.println("Sala 05 - A Vingança do Peixe Frito - 18 anos");
        opcao = sc.nextInt();

                switch (opcao) {
            case "1":
                  (idade)
                  System.out.println("");
        }

                
                
        }




        sc.close();
    }
}


//TODO: atividade 02
        // Crie um programa que receba do usuário o nome e a idade (1x)
        // e depois exiba uma lista de filmes:
        // Sala 01 - A Roda Quadrada - Livre
        // Sala 02 - A volda dos que não foram - 12 anos
        // Sala 03 - Poeira em Alto Mar - 14 anos
        // Sala 04 - As Tranças do Rei Careca - 16 anos
        // Sala 05 - A Vingança do Peixe Frito - 18 anos
        // O usuário deverá escolher o filme desejado. Se tiver a idade
        //  mínima para ver o filme, o programa imprime o ingresso e
        //  encerra. Se o usuário não tiver a idade mínima, o programa
        //  bloqueia a entrada e re-exibe a lista de filmes para o usuário
        //  escolher outro filme.