package br.edu.fatecmm;

public class ContasCorrente {
    //atributos
    public int conta;
    public int agencia;
    public double saldo;
    public String nome;
    public static double cpmf; //Atributo estático

    public void efetuarSaque(double valor){ //valor é um nome qualquer q eu preferir...
        this.saldo = this.saldo - valor;
    }

    public void efetuarDeposito(double valor){
        this.saldo = this.saldo + valor;
    }
}
