package com.uninter;

import java.util.Random;

public class Computador1 extends Computador{


    public int jogar(){
        Random rand = new Random();

        int jogada = rand.nextInt(9);
        this.jogadas.add(jogada);
        return jogada;

    }
}
