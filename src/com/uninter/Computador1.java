package com.uninter;

import java.util.Random;

public class Computador1 extends Computador{


    public int gerarJogada(){
        Random rand = new Random();
        int jogada = rand.nextInt(9);
        return jogada;

    }
}
