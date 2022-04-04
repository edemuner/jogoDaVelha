package com.uninter;

public class Tabuleiro {

    static void iniciarJogo(int level){
        System.out.println("oi");

        Usuario usuario = new Usuario();
        while(true) {
            usuario.jogar();
            System.out.println(usuario.getJogadas());
        }
    }
}
