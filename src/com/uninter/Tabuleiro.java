package com.uninter;

import java.util.ArrayList;

public class Tabuleiro {

    static int jogadasFeitas;

    static void iniciarJogo(int level){
        jogadasFeitas = 0;
        Usuario usuario = new Usuario();
        if (level == 1) {
            Computador1 computador = new Computador1();
        } else if (level == 2){
            Computador2 computador = new Computador2();
        } else {
            Computador3 computador = new Computador3();
        }

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
            // computador.jogar()
            // verificar vitória
            // jogadas ++
        }
    }


    private static boolean verificarVitoria(Jogador jogador){
        ArrayList<Integer> jogadas = jogador.getJogadas();
        return (jogadas.contains(1) && jogadas.contains(2) && jogadas.contains(3) ||
                jogadas.contains(4) && jogadas.contains(5) && jogadas.contains(6) ||
                jogadas.contains(7) && jogadas.contains(8) && jogadas.contains(9) ||
                jogadas.contains(1) && jogadas.contains(4) && jogadas.contains(7) ||
                jogadas.contains(2) && jogadas.contains(5) && jogadas.contains(8) ||
                jogadas.contains(3) && jogadas.contains(6) && jogadas.contains(9) ||
                jogadas.contains(1) && jogadas.contains(5) && jogadas.contains(9) ||
                jogadas.contains(3) && jogadas.contains(5) && jogadas.contains(7));
    }
}
