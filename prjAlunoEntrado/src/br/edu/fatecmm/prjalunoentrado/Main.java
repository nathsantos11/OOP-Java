package br.edu.fatecmm.prjalunoentrado;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pessoa p1, p2;
        //instanciar o objeto p1
        p1 = new Pessoa();
        //atribuir dados ao obj p1
        p1.nome = "Douglas";
        p1.cracha = "AD123";
        p1.entrado = true;

        p2 = new Pessoa();
        p2.nome = "Camila";
        p2.cracha = "AD555";
        p2.entrado = false;

        System.out.println(p1.verificarEntrada());
        System.out.println(p2.verificarEntrada());

        Pessoa p;
        p = p2; //esse objeto está apontando para p2
        p.nome = "Maromo";
        System.out.println(p2.verificarEntrada());

    }
}
