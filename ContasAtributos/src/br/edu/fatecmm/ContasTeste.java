package br.edu.fatecmm;

public class ContasTeste {

    public static void main(String[] args) {
	// write your code here
        ContasCorrente conta1 = new ContasCorrente();
        //acesso ao atributo estático por meio do nome da classe
        ContasCorrente.cpmf = 0.0038;
        conta1.saldo=1000;

        ContasCorrente conta2 = new ContasCorrente();
        conta2.saldo = 2000;

        System.out.println("Manipulando obejtos em Java\u2122");
        System.out.println("Oracle & Sun Mirosystem, Inc.\u00a9");

        //atributo estatico sendo acessado por um objeto
        System.out.println("Objeto conta1 - atributo estático: " + conta1.cpmf);
        System.out.println("Objeto conta1 - atributo não estático: " + conta1.saldo);
        //atributo estatico sendo acessado por um objeto
        System.out.println("Objeto conta2 - atributo estático: " + conta2.cpmf);
        System.out.println("Objeto conta2 - atributo não estático: " + conta2.saldo);

        conta2.cpmf = 0.0010;
        //atributo estatico sendo acessado por um objeto

        System.out.println("Apos alteração...");
        System.out.println("Objeto conta1 - atributo estático: " + conta1.cpmf);
        System.out.println("Objeto conta1 - atributo não estático: " + conta1.saldo);
        //atributo estatico sendo aceessado por um objeto
        System.out.println("Objeto conta2 - atributo estático: " + conta2.cpmf);
        System.out.println("Objeto conta2 - atributo não estático: " + conta2.saldo);

        //acessando o atributo por meio da classe
        System.out.println("Objeto conta1 acessado pelo nome da classe: " + ContasCorrente.cpmf);
        System.out.println("Objeto conta1 - atributo não estático: " + conta1.saldo);
    }
}
