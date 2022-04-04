package com.uninter;

import java.util.ArrayList;

public class Jogador {
    // VERIFICAR POSSIBILIDADE DE SE USAR SET E NÃO ARRAYLIST

    private ArrayList<Integer> jogadas = new ArrayList<>();

    public void addJogada(int casa){
        jogadas.add(casa);
    }

    public ArrayList<Integer> getJogadas() {
        return jogadas;
    }

    public int jogar(){
        return -1;
    }
}
