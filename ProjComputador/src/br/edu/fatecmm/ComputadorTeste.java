package br.edu.fatecmm;

public class ComputadorTeste {

    public static void main(String[] args) {
        Computador computador = new Computador();
        computador.marca = "HP";
        computador.cor = "preto";
        computador.modelo = "I5";
        computador.numeroSerie = 1234567123;
        computador.preco = 1599.00;

        computador.imprimir();
        computador.calcularValor();
        computador.imprimir();

        System.out.println("\n");

        Computador computador1 = new Computador();
        computador1.marca = "IBM";
        computador1.cor = "branco";
        computador1.modelo = "I7";
        computador1.numeroSerie = 217654321;
        computador1.preco = 2200.00;

        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();

        int retorno = computador1.alterarValor(-100.00);

        if (retorno==1){
            System.out.println("Valor Alterado");
        }else {
            System.out.println("Valor não alterado");
        }
        System.out.println("\n");


        computador1.imprimir();
    }
}
