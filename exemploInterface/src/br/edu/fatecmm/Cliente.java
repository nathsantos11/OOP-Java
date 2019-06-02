package br.edu.fatecmm;

public class Cliente implements Entravel {

    @Override
    public void entrarNaInstituicao(){
        System.out.println("Cliente chegou para visitar a Instituição");
        GerenciarEntrada.adicionarEntrado(this);
    }

    @Override
    public void sairDaInstituicao() {
        System.out.println("Cliente saiu correndo");
        GerenciarEntrada.removerEntrada(this);
    }
}
