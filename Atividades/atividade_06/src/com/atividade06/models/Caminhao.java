package com.atividade06.models;

final public class Caminhao extends Veiculo {
    // atributos
    private int carroceria;

    // construtor
    public Caminhao(int carroceria, String fabricante, String modelo, String cor, String ano, String placa, String categoria) {
    super(fabricante, modelo, cor, ano, placa, categoria);
    this.carroceria = carroceria;
    }

    // métodos de acesso

    public int getCarroceria() {
        return this.carroceria;
    }

    public void setCarroceria(int carroceria) {
        this.carroceria = carroceria;
    }


}
