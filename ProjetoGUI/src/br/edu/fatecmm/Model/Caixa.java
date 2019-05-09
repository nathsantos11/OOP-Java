package br.edu.fatecmm.Model;

public class Caixa {
    private double saldo;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String sacar (double valor){
        if (valor <= saldo){
            saldo -= valor;
            return "Saque efetuado com sucesso. Valor " + valor + "\n";
        }
        return "Sem limite para saque \n";
    }

    public String depositar (double valor){
        if (valor >0){
            saldo += valor;
            return "Deposito efetuado com sucesso. Valor: " + valor + "\n";
        }
        return "Valor invalido para deposito \n";
    }
}
