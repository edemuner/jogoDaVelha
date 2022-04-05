package com.uninter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Computador2 extends Computador{

    // nessa classe é selecionado aleatoriamente um integrante dentre os membros de um array list do tamanho do tabuleiro
    public int gerarJogada() {

        List<Integer> casas = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8));
        Random rand = new Random();
        int jogada = casas.get(rand.nextInt(casas.size()));
        return jogada;
    }
}
