package com.uninter;

import java.util.HashSet;

public class Usuario {

    private HashSet<Integer> jogadas = new HashSet<>();

    public void addJogada(int casa){
        jogadas.add(casa);
    }

    public HashSet<Integer> getJogadas() {
        return jogadas;
    }

    public void jogar(int jogada){

        boolean done = false;
        while(!done) {
            if (jogada >= 0 && jogada <= 8){
                this.addJogada(jogada);
                done = true;
            } else {
                System.out.println("Número fora do tabuleiro!");
                System.out.println("----------------------");
            }
        }
    }
}
