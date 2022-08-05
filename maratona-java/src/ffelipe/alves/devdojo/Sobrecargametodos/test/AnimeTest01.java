package ffelipe.alves.devdojo.Sobrecargametodos.test;

import ffelipe.alves.devdojo.Sobrecargametodos.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime();
        /*  Jeito que faziamos
        anime.setTipo("TV");
        anime.setEpisodios(12);
        anime.setNome("JoJo Bizarre Adventure");*/

        //assim ao inves de usarmos esses 3 sets podemos simplismente chamar nosso metodo init
        anime.init("Tokyo Ghoul","TV",12);
        anime.imprime();
        anime.init("Tokyo Ghoul Re","TV",12,"Seinen");
        anime.imprime();
    }

}
