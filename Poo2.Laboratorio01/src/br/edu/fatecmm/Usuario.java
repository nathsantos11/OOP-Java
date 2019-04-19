package br.edu.fatecmm;

public class Usuario {

    //atributos
    public String nome;
    public String email;
    public String login;
    public String senha;

    //construtores
    public Usuario(){

    }

    public Usuario(String nome, String email, String login, String senha){
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }
}
