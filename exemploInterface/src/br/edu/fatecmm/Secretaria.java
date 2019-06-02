package br.edu.fatecmm;

public class Secretaria extends Funcionario implements Entravel{

    @Override
    public void entrarNaInstituicao() {
        System.out.println("Secretaria entra mais cedo");
        GerenciarEntrada.adicionarEntrado(this);
    }

    @Override
    public void sairDaInstituicao() {
        System.out.println("Secretaria sai mais tarde");
        GerenciarEntrada.removerEntrada(this);
    }
}


