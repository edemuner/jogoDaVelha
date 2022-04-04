package com.uninter;

import java.util.HashSet;

public class Jogador {
    // VERIFICAR POSSIBILIDADE DE SE USAR SET E NÃO ARRAYLIST

    private HashSet<Integer> jogadas = new HashSet<>();

    public void addJogada(int casa){
        jogadas.add(casa);
    }

    public HashSet<Integer> getJogadas() {
        return jogadas;
    }

    public int jogar(){
        return -1;
    }
}
