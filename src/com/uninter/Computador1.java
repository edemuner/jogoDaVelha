package com.uninter;

import java.util.Random;

public class Computador1 extends Jogador{


    public int jogar(){
        Random rand = new Random();

        return rand.nextInt(9);

    }
}
