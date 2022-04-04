package com.uninter;

import java.util.Random;

public class Computador1 extends Jogador{


    public int jogar(){
        Random rand = new Random();

        int jogada = rand.nextInt(9);
        System.out.println("O computador jogou " + jogada);
        return jogada;

    }
}
