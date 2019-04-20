package br.edu.fatecmm;

public class Acampamento {
    public String nome;
    public char equipe;
    public int idade;

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Equipe: " + equipe);
        System.out.println("Idade: " + idade);
    }

    public void separarGrupo(){
        if(idade<5){
            equipe = ' ';
        }else{
            if(idade<=10){
                equipe = 'A';
            }else{
                if(idade<=20){
                    equipe = 'B';
                }else{
                    equipe = 'C';
                }
            }
        }
    }
}
