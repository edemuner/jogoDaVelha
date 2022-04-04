package com.uninter;

import java.util.Scanner;

public class Usuario extends Jogador{

    Scanner scan = new Scanner(System.in);

    public int jogar(){

        boolean done = false;
        int jogada = -1;
        while(!done) {
            System.out.println("Digite sua jogada: ");
            jogada = Integer.parseInt(scan.nextLine());
            if (jogada >= 0 && jogada <= 8){
                this.addJogada(jogada);
                done = true;
            } else {
                System.out.println("Número fora do tabuleiro!");
                System.out.println("----------------------");
            }
        }
        return jogada;
    }
}
