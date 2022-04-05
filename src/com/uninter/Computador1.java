package com.uninter;

import java.util.Random;

public class Computador1 extends Computador{


    // aqui é apenas gerado um número aleatório conforme delimitado (0 a 8)
    public int gerarJogada(){
        Random rand = new Random();
        int jogada = rand.nextInt(9);
        return jogada;
    }
}
