package com.uninter;

import java.util.ArrayList;

public class Tabuleiro {

    static int jogadasFeitas;

    static void iniciarJogo(int level){

        jogadasFeitas = 0;

        Usuario usuario = new Usuario();

        Jogador computador = level == 1 ?
                                new Computador1() :
                            level == 2 ?
                                new Computador2() :

                                new Computador3();

        while(true) {
            usuario.jogar();
            if (verificarVitoria(usuario)) {
                System.out.println("usuário ganhou");
                break;
            }
            jogadasFeitas++;
            if (jogadasFeitas == 9){
                System.out.println("Empate!");
                break;
            }

            int jogadapc = computador.jogar();
            System.out.println("O computador jogou " + jogadapc);
            // computador.jogar()
            // verificar vitória
            // jogadas ++
        }
    }


    private static boolean verificarVitoria(Jogador jogador){
        ArrayList<Integer> jogadas = jogador.getJogadas();
        return (jogadas.contains(0) && jogadas.contains(1) && jogadas.contains(2) ||
                jogadas.contains(3) && jogadas.contains(4) && jogadas.contains(5) ||
                jogadas.contains(6) && jogadas.contains(7) && jogadas.contains(8) ||
                jogadas.contains(0) && jogadas.contains(3) && jogadas.contains(5) ||
                jogadas.contains(1) && jogadas.contains(4) && jogadas.contains(7) ||
                jogadas.contains(2) && jogadas.contains(5) && jogadas.contains(8) ||
                jogadas.contains(0) && jogadas.contains(4) && jogadas.contains(8) ||
                jogadas.contains(2) && jogadas.contains(4) && jogadas.contains(6));
    }
}
