package br.edu.fatecmm;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Poupanca p = new Poupanca();
        p.setAgencia("Ag. Mogi Mirim");
        p.setCidade("Mogi Mirim - SP");
        p.setNumConta(123);
        p.setDiaAniversario(5);
        p.depositar(1500);
        System.out.println(p.toString());

        System.out.println();
        Corrente cc = new Corrente();
        cc.setAgencia("Mogi Guacu");
        cc.setCidade("Mogi Guacu - SP");
        cc.setNumConta(345);
        cc.setLimiteCheque(1500);
        cc.depositar(3000);
        System.out.println(cc.toString());

        GerenciarPatrimonio gp = new GerenciarPatrimonio();
        gp.adicionarConta(cc); //metodo que reconhece
        gp.adicionarConta(p);
        System.out.println("Total Patrimonio: ");
        System.out.println(gp.getTotalPatrimonio());
    }
}
