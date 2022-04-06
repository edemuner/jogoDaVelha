package com.uninter;

import java.util.ArrayList;
import java.util.HashSet;

public class Tabuleiro {

    // aqui ficam as jogadas de ambos os jogadores
    static ArrayList<Integer> jogadasFeitas = new ArrayList<>();

    static void iniciarJogo(int level){

        // limpeza da lista para não confundir com jogos anteriores
        jogadasFeitas.clear();

        Usuario usuario = new Usuario();

        // a variável computador pode ser uma instância de 3 classes diferentes
        // conforme a escolha do jogador
        Computador computador = level == 1 ?
                                new Computador1() :
                            level == 2 ?
                                new Computador2() :

                                new Computador3();

        // o laço principal desse método
        // contém duas jogadas, uma do usuário e outra do computador
        while(true) {

            // retorno -1 = falha na validação, nova tentativa
            // retorno 1 = vitória do usuário, fim do laço
            // retorno 0 = o jogo apenas prossegue
            try {
                int jogada = jogadaHumana(usuario);
                if (jogada == -1){
                    continue;
                } else if (jogada == 1){
                    break;
                }
            } catch(NumberFormatException erro){
                System.out.println("Apenas números de casas são jogadas válidas");
                continue;
        }
            // o empate sempre acontece se em 9 jogadas ninguém ganhar
            // o momento adequado para verificar se o jogo empatou é entre o par de jogadas
            // após uma jogada do usuário o número de jogadas sempre será ímpar
            // enquanto o número de jogadas sempre será par depois das jogadas do computador
            if (jogadasFeitas.size() == 9){
                System.out.println("Empate!");
                break;
            }

            if (jogadaComputador(computador)) break;

        }
    }

    private static boolean jogadaComputador(Computador computador){


        // na jogada do computador, mais um laço while é necessário
        // pois os métodos de geração do valor são internos às classes filhas de Computador, e são aleatórios
        // então é preciso se certificar que o valor não foi jogado ainda, algumas iterações são feitas até achar um valor válido
        while (true){

            // é chamado um método de computador que gera um valor para ser jogado
            // esse valor varia conforme o nível de computador, cf. implementação das classes filhas
            int jogadaPC = computador.gerarJogada();
            if (verificaJogadaFeita(jogadaPC)) {

                // o valor é validado, se estiver tudo certo é adicionado nas listas
                computador.jogar(jogadaPC);
                jogadasFeitas.add(jogadaPC);
                break;
            }
        }
        System.out.println("Computador jogou " + computador.getJogadas());

        // ao fim da jogada do computador, verifica-se se foi vencedor
        if (verificarVitoria(computador.getJogadas())){
            System.out.println("Computador venceu!");
            return true;
        }

        return false;
    }

    private static int jogadaHumana(Usuario usuario){

        // esse método obtem um int através de um input do usuário

        int jogadaUsuario = usuario.obterJogada();

        //validação de que se trata de um número pertencente ao tabuleiro
        if (jogadaUsuario >= 0 && jogadaUsuario <= 8){

            // validação se a jogada é repetida, não é possível jogar 2x na mesma casa
            if (verificaJogadaFeita(jogadaUsuario)){

                // tudo validado, a jogada é adicionada na lista do tabuleiro e na lista do jogador
                usuario.addJogada(jogadaUsuario);
                jogadasFeitas.add(jogadaUsuario);
                System.out.println("Usuário jogou " + usuario.getJogadas());

                // logo após a jogada, é verificado se essa jogada levou o usuário à vitória, se sim o laço encerra
                if (verificarVitoria(usuario.getJogadas())){
                    System.out.println("Usuário venceu!");
                    return 1;
                } else {
                    return 0;
                }
            } else {
                System.out.println("Essa casa já foi jogada");
                return -1;
            }
        } else {
            System.out.println("O número deve ser entre 0 e 8");
            return -1;
        }

    }

    // aqui está a lógica que verifica se um set de jogadas é vencedor
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

    // apenas verifica se uma jogada é repetida
    private static boolean verificaJogadaFeita(int jogada){
        return !jogadasFeitas.contains(jogada);
    }
}
