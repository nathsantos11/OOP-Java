package br.edu.fatecmm;

import java.util.Random;

public class Cartela {
    private int numeros[][] = new int[5][5];

    public Cartela(){
        gerarCartela();
    }

    public void imprimirCartela(){
        //Imprimir a cartela
        for (int lin = 0; lin < 5; lin++){
            for (int col = 0; col < 5; col++){
                System.out.print("[" + String.format("%2d", numeros[lin][col]) + "]");
            }
            System.out.println("");
        }
    }

    private void ordernarCartela(){
        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
                int col = coluna;
                for (int i = linha; i < numeros.length; i++) {
                    for (int j = col + 1; j < numeros[i].length; j++) {
                        if (numeros[linha][coluna]> numeros[i][j]){
                            int aux = numeros[linha][coluna];
                            numeros[linha][coluna] = numeros[i][j];
                            numeros[i][j] = aux;
                        }
                    }
                    col = -1;
                }

            }
        }
    }

    private void gerarCartela(){
        //Gerar 25 valores não repetidos
        Random r = new Random();
        int cont = 0;
        int lin = 0, col = 0;
        while (cont < 25) {
            boolean encontrado = false;
            int tentado = r.nextInt(76);
            //varrer matriz para ver se o numero não foi gerado antes
            for (int l = 0; l < 5; l++) {
                for (int c = 0; c < 5; c++) {
                    if (tentado == numeros[l][c]) encontrado = true;
                }
            }
            if (!encontrado) {//neste caso coloca-se na matriz o valor gerado
                numeros[lin][col] = tentado;
                col++; //até a coluna 4
                if (col == 5) {
                    col = 0;
                    lin++;
                }
                cont++; //registra a contagem para o numero
            }
        }
        ordernarCartela();
    }
}
