package ffelipe.alves.devdojo.Blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    public Anime(){
        episodios = new int[10000];
        for(int i = 0; i<episodios.length;i++){
            episodios[i]=i+1;
        }
        for (int episodio:episodios){
            System.out.println(episodio);
        }
    }

}
