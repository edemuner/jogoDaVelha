package com.uninter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Computador3 extends Computador{

    // nessa classe é sempre selecionado o intex 0 do arraylist do tamanho do tabuleiro
    // mas antes disso o arraylist é embaralhado, de maneira que o index 0 é definido aleatoriamente
    public int gerarJogada(){

        List<Integer> casas = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8));
        Collections.shuffle(casas);
        int jogada = casas.get(0);
        return jogada;

    }
}
