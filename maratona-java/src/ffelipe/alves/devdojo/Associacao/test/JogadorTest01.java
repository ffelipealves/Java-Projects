package ffelipe.alves.devdojo.Associacao.test;

import ffelipe.alves.devdojo.Associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Jubileu");
        Jogador jogador2 = new Jogador("Bostil");
        Jogador jogador3 = new Jogador("Bananilson");

        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};

        for (Jogador jogador:jogadores){
            jogador.imprime();
        }

    }
}

/*
* Associacao
* Jogador 1 -- 1 Personagem
* Time 1 -- N Jogador
* Jogador N -- 1 Time
* Estudante N -- N Curso
* */