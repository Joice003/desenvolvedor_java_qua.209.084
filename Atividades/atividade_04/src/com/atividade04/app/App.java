package com.atividade04.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // intancia a classe Veiculo
        Veiculo veiculo = new Veiculo();
        Scanner sc = new Scanner(System.in);

        // entrada de dados
        System.out.println("Informe o Fabricante do veículo:");
        veiculo.fabricante = sc.nextLine();
        System.out.println("Informe o Modelo do veículo:");
        veiculo.modelo = sc.nextLine();
        System.out.println("Informe a Placa do veículo:");
        veiculo.placa = sc.nextLine();
        System.out.println("Informe o Ano do veículo:");
        veiculo.ano = sc.nextLine();
        System.out.println("Informe a cor do veículo:");
        veiculo.cor = sc.nextLine();

        // define os valores dos atributos
        veiculo.fabricante = "Fiat";
        veiculo.modelo = "Mobi";
        veiculo.placa = "A7B2KSE";
        veiculo.ano = "2019";
        veiculo.cor = "Azul";

        // saida de dados
        System.out.println("Atributos do objeto:");
        System.out.println("Fabricante: " + veiculo.fabricante);
        System.out.println("Modelo: " + veiculo.modelo);
        System.out.println("Placa: " + veiculo.placa);
        System.out.println("Ano: " + veiculo.ano);
        System.out.println("Cor: " + veiculo.cor);

        sc.close();
    }
}
