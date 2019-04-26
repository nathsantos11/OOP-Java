package br.edu.fatecmm;

public class Poupanca extends Conta {
    private int diaAniversario;

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()); //imprime os dados da superclasse Conta
        sb.append("Dia Aniversario: " + diaAniversario);
        return sb.toString();
    }

    @Override
    boolean sacar(double valor){
        if(valor <= getSaldo()){
            setSaldo(getSaldo()-valor);
            return true;
        }
        return false;
    }
}
