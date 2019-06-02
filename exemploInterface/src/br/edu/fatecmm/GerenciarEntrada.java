package br.edu.fatecmm;

import java.util.ArrayList;
import java.util.List;

public class GerenciarEntrada {

    public static List<Entravel> entrados = new ArrayList<>();

    public static void adicionarEntrado(Entravel obj) {
        entrados.add(obj);
    }

    public static void removerEntrada(Entravel obj) {
        entrados.remove(obj);
    }

    public static String getSituacaoDeOcupacao() {
        StringBuilder sb = new StringBuilder();
        sb.append("Total de pessoas na Instituição \n");
        sb.append(entrados.size() + "\n");

        for (Entravel pessoa : entrados) {
            sb.append("Objeto do tipo: " +
                    pessoa.getClass().toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}