package com.uninter;

import java.util.HashSet;

public class Computador {

    public HashSet<Integer> jogadas = new HashSet<>();

    public int gerarJogada(){ return -1; }

    public void jogar(int casa){
            this.jogadas.add(casa);
    }

    public HashSet<Integer> getJogadas(){
        return this.jogadas;
    }
}
