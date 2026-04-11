package com.atividade07.models;

public class ContaJuridica extends Conta {
    private PessoaJuridica pessoaJuridica;
    private double taxa = 0.01;

    public ContaJuridica(PessoaJuridica pessoaJuridica, double taxa, String conta, String agencia, double saldo) {
        super(conta, agencia, saldo);
        this.pessoaJuridica = pessoaJuridica;
        this.taxa;    
    }


    public PessoaJuridica getPessoaJuridica() {
        return this.pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public double getTaxa() {
        return this.taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }


    public void exibirDados() {
        System.out.println("Razão social da empresa: " + this.pessoaJuridica.getRazaoSocial());
        System.out.println("Nome Fantasia da empresa: " + this.pessoaJuridica.getNomeFantasia());
        System.out.println("CNPJ da empresa: " + this.pessoaJuridica.getCnpj());
        System.out.println("E=mail da empresa: " + this.pessoaJuridica.getEmail());
        super.exibirDados();       
    }

    public double fazerSaque(double valor) {
        this.setSaldo(this.getSaldo() - valor - (this.getSaldo() - 0.01/100));
        return getSaldo();
    }



    }
    

}
