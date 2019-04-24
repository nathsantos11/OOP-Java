package br.edu.fatecmm;

public class Corrente extends Conta {
    private double limiteCheque;


    public double getLimiteCheque() {
        return limiteCheque;
    }

    public void setLimiteCheque(double limiteCheque) {
        this.limiteCheque = limiteCheque;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()); //imprime os dados da superclasse Conta
        sb.append("Limite: " + limiteCheque);
        return sb.toString();
    }
}
