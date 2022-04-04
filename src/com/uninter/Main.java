package com.uninter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean sair = true;

        while(sair){
            System.out.println("Bem vindo ao jogo da velha!");
            System.out.println("Por favor, selecione o nível que deseja jogar, de 1 até 3: ");
            int escolha;
            try {
                escolha = Integer.parseInt(scan.nextLine());
                Tabuleiro.iniciarJogo(escolha);
                scan.nextLine();
            } catch(NumberFormatException erro){
                System.out.println("Apenas números, de 1 até 3");
            }
        }
    }
}
