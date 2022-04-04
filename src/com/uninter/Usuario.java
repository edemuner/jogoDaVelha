package com.uninter;

import java.util.Scanner;

public class Usuario extends Jogador{

    Scanner scan = new Scanner(System.in);

    public void jogar(){

        boolean done = false;
        while(!done) {
            System.out.println("Digite sua jogada: ");
            int jogada = Integer.parseInt(scan.nextLine());
            if (jogada >= 1 && jogada <= 9){
                this.addJogada(jogada);
                done = true;
            } else {
                System.out.println("Número fora do tabuleiro!");
                System.out.println("----------------------");
            }
        }
    }
}
