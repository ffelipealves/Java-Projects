package ffelipe.alves.devdojo.Modificadoresestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    //Sequencia de execucao da classe
    //0- Bloco de inicializacao statico
    //1-Alocado espaço em memoria para objeto
    //2- cada atributo da classe eh criado e inicializados com valores defaults ou nao
    //3- Bloco de inicializacao
    //4- Contrutores
    //5- Metodos

    //aqui temos um problema no nosso bloco de inicializacao
    //nesse caso temos que executalo sempre que criamos um objeto
    //porem podemos deixa-lo padrao usando o static

    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[10];
        for(int i = 0; i<episodios.length;i++){
            episodios[i]=i+1;
        }
    }
    {
        System.out.println("Bloco de inicializacao nao estatico");
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
