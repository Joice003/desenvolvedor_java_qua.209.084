package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variáveis
        String nome;
        double peso;
        double altura;
        double imc;

        // instancia a classe
        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Informe seu nome:");
        nome = sc.nextLine();
        System.out.println("Informe seu peso em kg:");
        peso = sc.nextDouble();
        System.out.println("Informe sua altura em metros:");
        altura = sc.nextDouble();

        // cálculo imc
        imc = peso/(altura*altura);

        // condicional 
        if (imc < 18.5) {
            System.out.println(nome + " está abaixo do peso.");
        }
        else if (imc <25) {
            System.out.println(nome + " está no peso ideal");
        }
        else if (imc <30) {
            System.out.println(nome + " está acima do peso.");
        }
        else if (imc <35) {
            System.out.println(nome + " está obeso.");
        }else if (imc <40) {
            System.out.println(nome + " está com obesidade nível 2.");
        }else {
            System.out.println(nome + " está com obesidade mórbida.");
        }
       
        // fecha objeto Scanner
        sc.close();
        
    }
}
