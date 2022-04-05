package com.uninter;

import java.util.Scanner;

// mudança de projeto para acabar com a classe jogador
// pois a unificação do método jogar em jogador não dá certo
// pq os métodos jogar dentro de usuário e dentro de computador(es) são visceralmente diferentes
// jogar de usuário parâmetro, pq o valor a ser armazenado vem de fora, já é conhecido da classe de cima, e não precisa ser retornado
// jogar de computador não recebe parâmetro, o valor é gerado dentro da classe, ele precisa retornar esse valor, que é desconhecido da classe de cima

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
