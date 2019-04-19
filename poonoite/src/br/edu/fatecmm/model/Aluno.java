package br.edu.fatecmm.model;

public class Aluno {

    //Atributos ou campos
    public int ra; //tipo primitivo
    public String nome; //tipo referência
    public String email;
    public String telefone;
    private double salario;


    //Métodos
    public void matricular (){
        System.out.println("Aluno matriculado: "+ nome);

    }
    public void trocarDisciplina(){
        System.out.println("Só no dia 18 de fevereiro");

    }

}
