package com.uninter;

public class Tabuleiro {

    static void iniciarJogo(int level){
        System.out.println("oi");

        Usuario usuario = new Usuario();
        usuario.addJogada(level);
        System.out.println(usuario.getJogadas());
    }
}
