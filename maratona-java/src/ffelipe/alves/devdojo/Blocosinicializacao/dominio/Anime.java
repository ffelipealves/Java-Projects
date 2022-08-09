package ffelipe.alves.devdojo.Blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    //Sequencia de execucao da classe
    //1- Alocado espaço em memoria para objeto
    //2- cada atributo da classe eh criado e inicializados com valores defaults ou nao
    //2.5-Blocos de inicializacao statico
    //3- Bloco de inicializacao
    //4- Contrutores
    //5- Metodos
    //bloco de inicializacao
    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[10];
        for(int i = 0; i<episodios.length;i++){
            episodios[i]=i+1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){

        for (int episodio:episodios){
            System.out.println(episodio);
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
