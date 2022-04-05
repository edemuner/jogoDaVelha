package com.uninter;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao jogo da velha!");

        // este laço gera um novo jogo até que o usuário responda algo diferente de "y" ao fim
        while (true){
            // o programa pede que seja selecionado o nível de jogo
            System.out.println("Por favor, selecione o nível que deseja jogar, de 1 até 3: ");
            int escolha;
            // o usuário escolhe um dos níveis, a informação é validada, se estiver tudo certo é chamado o método que inicia o jogo no tabuleiro
            // as mensagens de erro abaixo indicam o que está sendo validado
            try {
                escolha = Integer.parseInt(scan.nextLine());

                if (escolha >= 1 && escolha <= 3) {
                    Tabuleiro.iniciarJogo(escolha);
                } else {
                    System.out.println("O level deve ser entre 1 e 3");
                }
            } catch (NumberFormatException erro) {
                System.out.println("Apenas números, de 1 até 3");
            }

            System.out.println("-----------------");
            System.out.println("Deseja jogar novamente? y/n");
            String novoJogo = scan.nextLine();
            if (!novoJogo.equalsIgnoreCase("y")) break;
        }


    }
}
