package com.uninter;

import java.util.HashSet;
import java.util.Scanner;

public class Usuario {

    static Scanner scan = new Scanner(System.in);

    // o hashset foi escolhido tanto para usuários quanto para computador
    // por não armazenar valores duplicados
    private HashSet<Integer> jogadas = new HashSet<>();

    // escrever no hashset
    public void addJogada(int casa){
        jogadas.add(casa);
    }

    // ler do hashset
    public HashSet<Integer> getJogadas() {
        return jogadas;
    }

    // input ao usuário para obter a jogada
    public int obterJogada() {
        System.out.println("Digite sua jogada: ");
        int jogada = Integer.parseInt(scan.nextLine());
        return jogada;
    }

}

