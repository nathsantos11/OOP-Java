package br.edu.fatecmm;

public class Main {

    public static void main(String[] args) {
	//Simular algumas entradas e saidas
        Gerente gerente = new Gerente();
        Secretaria secretaria = new Secretaria();
        Operador operador = new Operador();
        Cliente cliente = new Cliente();

        gerente.entrarNaInstituicao();
        secretaria.entrarNaInstituicao();
        cliente.entrarNaInstituicao();
        //Não consigo invocar metodo para operador, pois operador não é entravel.

        //Mostrar status
        System.out.println(GerenciarEntrada.getSituacaoDeOcupacao());

        System.out.println();
        cliente.sairDaInstituicao();

        //mostra status novamente
        System.out.println(GerenciarEntrada.getSituacaoDeOcupacao());

    }
}
