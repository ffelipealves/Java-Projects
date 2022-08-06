package ffelipe.alves.devdojo.Blocosinicializacao.test;

import ffelipe.alves.devdojo.Blocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio+" ");
        }


    }


}
