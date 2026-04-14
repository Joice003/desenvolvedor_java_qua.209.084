package com.atividade08.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        int idade;

        nome = JOptionPane.showInputDialog("Informe seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));

        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, nome + " é maior de idade.");
        } else {
            JOptionPane.showMessageDialog(null, nome + " é menor de idade.");
        }
    }
}
//TODO: atividade 08
//Crie um programa que recebe do usuário os valores dos atributos nome e
// idade em JOptionsPane, e o programa informa se o usuário é maior ou menor
// de idade.