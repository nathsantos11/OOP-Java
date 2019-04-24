package br.edu.fatecmm;

public class Conta {
    private int numConta;
    private String agencia;
    private String cidade;
    private double saldo;

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Num: " + numConta + "\n");
        sb.append("Ag: " + agencia + "\n");
        sb.append("cidade: " + cidade + "\n");
        sb.append("saldo: " + saldo + "\n");
        return sb.toString();
    }


    public void depositar(double valor){
        saldo+=valor;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
