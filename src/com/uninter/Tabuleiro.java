package com.uninter;

import java.util.ArrayList;

public class Tabuleiro {

   static void iniciarJogo(int level){
        Usuario usuario = new Usuario();
        while(true) {
            usuario.jogar();
            if (verificarVitoria(usuario)) System.out.println("usuário ganhou");
            // verificar vitória
            // jogadas ++
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
