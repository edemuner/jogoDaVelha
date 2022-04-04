package com.uninter;

import java.util.ArrayList;

public class Tabuleiro {

    static ArrayList<Integer> jogadasFeitas = new ArrayList<>();

    static void iniciarJogo(int level){

        jogadasFeitas.clear();

        Usuario usuario = new Usuario();

        Jogador computador = level == 1 ?
                                new Computador1() :
                            level == 2 ?
                                new Computador2() :

                                new Computador3();

        while(true) {
            int jogadaUsuario = usuario.jogar();
            if (verificaJogadaFeita(jogadaUsuario)){
                System.out.println("Essa casa já foi jogada!");
                continue;
            }
            if (verificarVitoria(usuario)) {
                System.out.println("Usuário ganhou");
                break;
            }
            jogadasFeitas.add(jogadaUsuario);
            if (jogadasFeitas.size() == 9){
                System.out.println("Empate!");
                break;
            }

            int jogadapc = computador.jogar();
            System.out.println("O computador jogou " + jogadapc);
            if (verificarVitoria(computador)) {
                System.out.println("Computador ganhou!");
                break;
            }
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

    private static boolean verificaJogadaFeita(int jogada){
        return jogadasFeitas.contains(jogada);
    }
}
