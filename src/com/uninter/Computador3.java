package com.uninter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Computador3 extends Computador{

    public int gerarJogada(){

        List<Integer> casas = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8));
        Collections.shuffle(casas);
        int jogada = casas.get(0);
        return jogada;

    }
}
