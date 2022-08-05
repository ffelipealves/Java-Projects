package ffelipe.alves.devdojo.Construtores.test;

import ffelipe.alves.devdojo.Construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        //agr so podemos instanciar um objeto se dermos um nome para ele
        Anime anime = new Anime("Hunter x Hunter","TV", 150,"Battle Shounen");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
    }
}
