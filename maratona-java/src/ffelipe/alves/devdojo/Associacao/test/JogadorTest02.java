package ffelipe.alves.devdojo.Associacao.test;

import ffelipe.alves.devdojo.Associacao.dominio.Jogador;
import ffelipe.alves.devdojo.Associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        //criamos um objeto jogador e um time vamo relacionalos
        Jogador jogador1 = new Jogador("Ben 10");
        Time time1 = new Time("Pain Gaming");

        //aqui definimos um time pro nosso jogador 1
        jogador1.setTime(time1);
        jogador1.imprime();
    }
}
