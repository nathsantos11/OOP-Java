package br.edu.fatecmm;

public class GerenciarPatrimonio {
    private double totalPatrimonio;

    public void adicionarConta(Conta x){
        totalPatrimonio+= x.getSaldo(); //método que reconhece as subclasses cc e p
    }

    public double getTotalPatrimonio() {
        return totalPatrimonio;
    }
}
