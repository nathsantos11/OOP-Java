package br.edu.fatecmm;

import br.edu.fatecmm.model.Aluno;

public class Main {

    public static void main(String[] args) {
	// Dois objetos do tipo Aluno devem ser criados
        Aluno aluno1, aluno2;
        aluno1 = new Aluno(); //construtor
        aluno1.ra = 123;
        aluno1.nome = "Nath";
        aluno1.email = "nath.adm@hotmail.com";
        aluno1.telefone = "3333-3333";

        aluno1.matricular();
        aluno1.trocarDisciplina();


        aluno2 = new Aluno();
        aluno2.ra = 234;
        aluno2.nome = "Camila";
        aluno2.email = "camilinha@blablabla";
        aluno2.telefone = "2222-2222";

        aluno2.matricular();
        aluno2.trocarDisciplina();

        Aluno aluno3;
        aluno3 = aluno1;
        aluno3.nome = "Juca Chaves"; //aqui o aluno1 e o aluno3 apontam para o mesmo objeto
        aluno3.matricular();
        aluno1.matricular();
    }
}
