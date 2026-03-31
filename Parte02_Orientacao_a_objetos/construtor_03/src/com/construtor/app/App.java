package com.construtor.app;

import java.util.Scanner;
import com.construtor.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();

        System.out.println("Digite o nome da pessoa:");
        String nome = sc.nextLine();

        System.out.println("Digite o email da pessoa:");
        String email = sc.nextLine();

        System.out.println("Digite o telefone da pessoa:");
        String telefone = sc.nextLine();

        System.out.println("Digite o CPF da pessoa:");
        String cpf = sc.nextLine();

        System.out.println("Digite a idade da pessoa:");
        int idade = sc.nextInt();

        System.out.println("Digite a altura da pessoa:");
        double altura = sc.nextDouble();

        Pessoa pessoa1 = new Pessoa(nome, email, telefone, cpf, idade, altura);

        System.out.println("\nDados da pessoa cadastrada:");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Email: " + pessoa1.email);
        System.out.println("Telefone: " + pessoa1.telefone);
        System.out.println("CPF: " + pessoa1.cpf);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Altura: " + pessoa1.altura);

        sc.close();
    }
}
