package br.edu.fatecmm.prjalunoentrado;

public class Pessoa {
    //definir os atributos
    public String nome;
    public String cracha;
    public boolean entrado;

    //definir o método
    public String verificarEntrada(){
        if(entrado){
            return "Pessoa: " + nome + " entrou";
        }else{
            return "Pessoa: " + nome + " não entrou";
        }
    }
}
