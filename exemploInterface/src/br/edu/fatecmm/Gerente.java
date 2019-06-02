package br.edu.fatecmm;

public class Gerente extends Funcionario implements Entravel{

    @Override
    public void entrarNaInstituicao(){
        System.out.println("Gerente entra sem o cracha");
        GerenciarEntrada.adicionarEntrado(this);
    }

    @Override
    public void sairDaInstituicao() {
        System.out.println("Gerente sai mais cedo");
        GerenciarEntrada.removerEntrada(this);
    }
}
