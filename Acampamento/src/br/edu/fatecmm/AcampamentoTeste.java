package br.edu.fatecmm;

public class AcampamentoTeste {

    public static void main(String[] args) {
        Acampamento membro = new Acampamento();

        membro.nome = "Alice";
        membro.idade = 21;
        membro.imprimir();
        membro.separarGrupo();
        membro.imprimir();
    }
}
