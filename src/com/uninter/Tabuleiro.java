package com.uninter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Tabuleiro {

    static Scanner scan = new Scanner(System.in);

    static ArrayList<Integer> jogadasFeitas = new ArrayList<>();

    static void iniciarJogo(int level){

        jogadasFeitas.clear();

        Usuario usuario = new Usuario();

        Computador computador = level == 1 ?
                                new Computador1() :
                            level == 2 ?
                                new Computador2() :

                                new Computador3();

        while(true) {
            System.out.println("Digite sua jogada: ");
            int jogadaUsuario = Integer.parseInt(scan.nextLine());

            if (jogadaUsuario >= 0 && jogadaUsuario <= 8){

                if (verificaJogadaFeita(jogadaUsuario)){

                    usuario.addJogada(jogadaUsuario);
                    jogadasFeitas.add(jogadaUsuario);
                    System.out.println("Usuário jogou " + usuario.getJogadas());
                    if (verificarVitoria(usuario.getJogadas())){
                        System.out.println("Usuário venceu!");
                        break;
                    }
                } else {
                    System.out.println("Essa casa já foi jogada");
                    continue;
                }
            } else {
                System.out.println("O número deve ser entre 0 e 8");
                continue;
            }


            if (jogadasFeitas.size() == 9){
                System.out.println("Empate!");
                break;
            }

            int jogadaPC;
            while (true){
                jogadaPC = computador.gerarJogada();
                if (verificaJogadaFeita(jogadaPC)) {
                    computador.jogar(jogadaPC);
                    jogadasFeitas.add(jogadaPC);
                    break;
                }
            }
            System.out.println("Computador jogou " + computador.getJogadas());

            if (verificarVitoria(computador.getJogadas())){
                System.out.println("Computador venceu!");
                break;
            }
        }
    }

    private static boolean verificarVitoria(HashSet<Integer> jogadas){
        return ((jogadas.contains(0) && jogadas.contains(1) && jogadas.contains(2)) ||
                (jogadas.contains(3) && jogadas.contains(4) && jogadas.contains(5)) ||
                (jogadas.contains(6) && jogadas.contains(7) && jogadas.contains(8)) ||
                (jogadas.contains(0) && jogadas.contains(3) && jogadas.contains(6)) ||
                (jogadas.contains(1) && jogadas.contains(4) && jogadas.contains(7)) ||
                (jogadas.contains(2) && jogadas.contains(5) && jogadas.contains(8)) ||
                (jogadas.contains(0) && jogadas.contains(4) && jogadas.contains(8)) ||
                (jogadas.contains(2) && jogadas.contains(4) && jogadas.contains(6)));
    }

    private static boolean verificaJogadaFeita(int jogada){
        return !jogadasFeitas.contains(jogada);
    }
}
