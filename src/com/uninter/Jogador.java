package com.uninter;

import java.util.ArrayList;

public class Jogador {

    private ArrayList<Integer> jogadas = new ArrayList<>();

    public void addJogada(int casa){
        jogadas.add(casa);
    }

    public ArrayList<Integer> getJogadas() {
        return jogadas;
    }
}
