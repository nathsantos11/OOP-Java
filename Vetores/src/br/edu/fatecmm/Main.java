package br.edu.fatecmm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int x[] = new int[10];
        for (int i = 0; i < 10; i++) {
            x[i] = (i+1) * 10;
        }
        //Percorrer para mostrar

        //fori
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor: = " + x[i]);
        }*/

        //fore
        for (int valor: x) {
            System.out.println(valor);
        }

        ////////

        int[] idade;
        idade = new int[5]; //Alocando cinco posições inteiras para o vetor

        idade[0]=21;
        idade[1]=18;
        idade[2]=16;
        idade[3]=24;
        idade[4]=19;

        for (int i = 0; i < idade.length; i++) {
            System.out.printf("Elemento %d - idade %d \n", i,idade[i]);
        }//printf

        int[] idadeGrupo2 = {14,21,35};
        for (int i = 0; i < idadeGrupo2.length; i++) {
            System.out.printf("grupo 2, elemento %d - idade %d \n\n", i, idadeGrupo2[i]);
        }//printf

        /////////

        int vetor[] = new int[10];
        Arrays.fill(vetor, 15);
        for (int valor: vetor) {
            System.out.println(valor);
        }
        int va[]= {11,12,13,14,15,16,17,18,19,20};
        int vb[]= new int[10];
        System.arraycopy(va, 3, vb, 6, 4);
        for (int i = 0; i < 10; i++) {
            System.out.println("vb ["+ i + "] = " + vb[i]);
        }
    }
}
