package com.uninter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean sair = true;

        System.out.println("Bem vindo ao jogo da velha!");

        while(sair){
            System.out.println("Por favor, selecione o nível que deseja jogar, de 1 até 3: ");
            int escolha;
            try {
                escolha = Integer.parseInt(scan.nextLine());
                if (escolha >= 1 && escolha <= 3) {
                    Tabuleiro.iniciarJogo(escolha);
                    scan.nextLine();
                } else {
                    System.out.println("O level deve ser entre 1 e 3");
                }
            } catch(NumberFormatException erro){
                System.out.println("Apenas números, de 1 até 3");
            }
        }
    }
}
