package br.edu.fatecmm;

public class ApoliceTeste {

    public static void main(String[] args) {
	// write your code here
        Apolice apolice = new Apolice();

        apolice.setNomeSegurado("Nath");
        apolice.setIdade(31);
        apolice.setValorPremio(140);

        apolice.imprimir();
    }
}
