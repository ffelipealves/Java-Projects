package ffelipe.alves.devdojo.Associacao.test;

import ffelipe.alves.devdojo.Associacao.dominio.Jogador;
import ffelipe.alves.devdojo.Associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Josias");
        Time time = new Time("Holanda");
        jogador1.setTime(time);
        Jogador[] jogadores = {jogador1};
        time.setJogadores(jogadores);

        System.out.println("-----Jogador -> Time-----");
        jogador1.imprime();
        System.out.println("------Time -> Jogador-------");
        time.imprime();

    }
}
